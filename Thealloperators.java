import java.util.Scanner;


public class Thealloperators {
	public static void main(String[] args) {
		int a=2,b=5;
		String ch;
		//Arithmetic operator
		System.out.println(a+b);
		//unary operator
		a++;
		System.out.println(a);
		//bitwise operator
		int bitwiseAnd= a&b;
		System.out.println(bitwiseAnd);
		//ternary operator
		ch=(a>b)?"pass":"fail";
		System.out.println(ch);
		
		
		
	}
}
