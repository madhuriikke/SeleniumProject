import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;

public class HandlingFlash {

	
	    private final WebDriver webDriver;
	   private final String flashObjectId; 

	    public HandlingFlash(final WebDriver webDriver, final String flashObjectId) {
	        this.webDriver = webDriver; 
	        this.flashObjectId = flashObjectId;
	    }


	    public String call(final String functionName, final String... args) {
	      final Object result =
	            ((JavascriptExecutor)webDriver).executeScript(
	                 makeJsFunction(functionName, args),
	                 new Object[0]);

	         return result != null ? result.toString() : null;
	    }

	    private String makeJsFunction(final String functionName, final String... args) {
	         final StringBuffer functionArgs = new StringBuffer();

	        if (args.length > 0) {
	            for (int i = 0; i < args.length; i++) {
	                if (i > 0) {
	                    functionArgs.append(",");
	            }
	                functionArgs.append(String.format("'%1$s'", args[i]));
	         }
	        }
	        return String.format(
	            "return document.%1$s.%2$s(%3$s);",
	            flashObjectId,
	            functionName,
	            functionArgs);
	    }
	}
