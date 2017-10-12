public class JWuLib {
  public static boolean isPalindrome (String s) {
	  return s.equals(new StringBuilder(s).reverse().toString());
  }
	public static boolean perfectSquare (int n) {
		int m = (int) Math.sqrt(n);
		return (m*m == n);
	}
	public static boolean isFibonnaci (int y) {
		return (perfectSquare((5*y*y) + 4)) || (perfectSquare((5*y*y) - 4));
  }
  public static int sumUpTo (int x) {
    int y = (x*(x+1)/2);
    return (y);
  }
}
