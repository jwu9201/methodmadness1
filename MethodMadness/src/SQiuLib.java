
public class SQiuLib {
	public String dateStr(String mmddyyyy) {
		  String a = mmddyyyy.substring(2,4);  // returns dd
		  String b = mmddyyyy.substring(0,2);  //returns mm
		  String c = mmddyyyy.substring(4,8); //returns yyyy
	return a + "-" + b + "-" + c;
}
