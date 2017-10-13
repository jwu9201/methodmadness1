
public class ControlStructures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.out.println(JWuLib.isPalindrome("abc")); 	//Input = String, Output = True/false
		System.out.println(JWuLib.isFibonnaci(8)); 		//Input = integer, Output = True/false
		System.out.println(JWuLib.sumUpTo(10)); 		//Input = integer, Output = Sum of all integers up to Input
		System.out.println(SQiuLib.dateStr("mm/dd/yyyy")); 	//Input = string in format "mm/dd/yyyy", Output = string in format "mm-dd-yyyy"
		System.out.println(SQiuLib.cutOut("newyork", "york"));  //Input = mainStr and subStr, Output = mainStr with the first occurence of subStr cutout
		SQiuLib.multiplicationTable(10, 5);			//Input = base and range, Output = A multiplication table displaying the base*n for n= all integers from 0 to range
	}
}
