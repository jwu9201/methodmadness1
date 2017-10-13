
public class JWuLib {
  public static boolean isPalindrome (String s) { 			//method to determine whether or not input string is a Palindrome
	  return s.equals(new StringBuilder(s).reverse().toString()); 	//returns whether input string (s) is equal to a new string that is the reverse of the input - definition of a Palindrome
  }
	public static boolean perfectSquare (int n) {	//method to determine whether or not input integer is a perfect square
		int m = (int) Math.sqrt(n); 		//integer m defined as the square root of input as an integer
		return (m*m == n);			//returns whether the square root squared is equal to the original input - definition of a perfect square
	}
	public static boolean isFibonnaci (int y) {					//method to determine if a number is a Fibonnaci number
		return (perfectSquare((5*y*y) + 4)) || (perfectSquare((5*y*y) - 4));	//returns whether or not (5 * input^2 + or - 4) is a perfect square - definition of a Fibonnaci number
  }
  public static int sumUpTo (int x) {	//method to determine the sum of all numbers up to the input integer
    int y = (x*(x+1)/2);		//int y defined as the sum using the formula
    return (y);				//returns the sum	
  }
}
