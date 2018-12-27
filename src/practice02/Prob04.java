package practice02;

public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse("Hello World");
		printCharArray(c1);

		char[] c2 = reverse("Java Programming!");
		printCharArray(c2);
	}

	public static char[] reverse(String str) {
		/* 코드를 완합니다 */
		char[] c_str = str.toCharArray();
		char[] c_change = new char[c_str.length];
		
		for(int i = 0; i < c_str.length; i++)
		{
			c_change[i] = c_str[c_str.length - 1 - i];
		}
		
		return c_change;
	}

	public static void printCharArray(char[] array) {
		/* 코드를 완성합니다 */
		System.out.println(array);
	}
}
