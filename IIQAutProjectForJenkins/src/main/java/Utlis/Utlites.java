package Utlis;

import java.sql.Date;

public class Utlites {
	public static String generateEmailWithTimeStamp() {
		Date date=new Date(0);
		String timestamp = date.toString().replace(" ","_").replace(":","_");
		return "amotoori" +timestamp+"@gmail.com";
		
		
	}
	//Name
	public static String generateFirstNameWithTimeStamp() {
		Date date=new Date(0);
		String timestamp = date.toString().replace(" ","_").replace(":","_");
		return "MunMun" +timestamp;
		
		
	}


}
