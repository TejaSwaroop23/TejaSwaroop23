public class Factorialnumber{
	public static void main(String[] srgs) {
	//Print factorial of a number.
		int number;
		int factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check it's factorial: ");
		number=sc.nextInt();
		System.out.print("factorial of "+number+"! is:");
		for(int i=number;i>=1;i--) {
			
			factorial=factorial*i;
				
		}System.out.print(factorial);
		
	}
}
