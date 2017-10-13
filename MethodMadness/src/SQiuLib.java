
public class SQiuLib{

	//String Method: dateStr
		public static String dateStr (String dateStr) {
			  String a = dateStr.substring(3,5);  //returns dd
			  String b = dateStr.substring(0,2);  //returns mm
			  String c = dateStr.substring(6,10); //returns yyyy
			  return (a + "-" + b + "-" + c);
		}
		//String Method: cutOut	
		
		public static String cutOut (String mainStr , String subStr) {
			  String a = mainStr.replaceFirst(subStr, " "); //first occurence of subStr cutout
			  return a;
		}
		
		//Math Method: multiplicationTable
		
		public static void multiplicationTable(int base, int range) {
			
			for (int n = 0 ; n <= range ; n++)
				System.out.print(base * n + " ");
		}
		
}
	
