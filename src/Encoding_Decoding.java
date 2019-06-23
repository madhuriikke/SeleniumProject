import java.util.Base64;

public class Encoding_Decoding {

	
	public static String decodePassword(String password) {
		byte[] actualbyte =Base64.getDecoder().decode(password);
		
		String actualString =new String(actualbyte);
		return actualString;
	}
	 
	public static String encodePassword(String password) {
		String encodePassword =Base64.getEncoder().encodeToString(password.getBytes());
		return encodePassword;
	}
		
		public static void main(String[] args) {
			//create a simple String to encode
			
			String simple ="Selenium Webdriver";
			System.out.println("Orignal password:" +simple);
			System.out.println("Encoded password:" +encodePassword(simple));
			System.out.println("Decodepassword:" +decodePassword(encodePassword(simple)));
		
	} 
}

	
	
	
	
/*
 * 
 * 
 * public static void main(String[] args) { // Encodig simple String into Basic
 * Base 64 format
 * 
 * // create a sample String to encode String sample = "Selenium Webdriver";
 * 
 * // print actual String System.out.println("Sample String:\n " + sample);
 * 
 * // Encode into Base64 format String encodeString= Base64.getEncoder()
 * .encodeToString(sample.getBytes());
 * 
 * // print encoded String System.out.println("Encoded String:\n" +
 * encodeString);
 * 
 * //---------------------------------------------------------------------------
 * --------------------
 * 
 * // Decoding Basic Base 64 format to String
 * 
 * // create an encoded String to decode String encoded =
 * "U2VsZW5pdW0gV2ViZHJpdmVy"; System.out.println("encoded String" +encoded);
 * 
 * // print encoded String System.out.println("Encoded String:\n" + encoded);
 * 
 * // decode into String from encoded format byte[] actualByte =
 * Base64.getDecoder().decode(encoded);
 * 
 * String actualString = new String(actualByte);
 * 
 * // print actual String System.out.println("actual String:\n " +
 * actualString); }
 * 
 * //---------------------------------------------------------------------------
 * public static String decodePassword(String password) {
 * byte[] actualByte = Base64.getDecoder().decode(password);
 * 
 * String actualString =new String(actualByte); return actualString;
 * 
 */
   

