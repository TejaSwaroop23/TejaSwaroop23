public class Fibonacciseries{
	public static void main(String[] args) {
		//Print fibonacci series.
		int first=0;
		int second=1;
		int input;
		int nextvalue=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of digits you like to print: ");
		input=sc.nextInt();
		System.out.print("Fibonacci Series: "+first+", "+second);
		for(int i=0;i<=input;i++) {
			nextvalue=second+first;
			System.out.print(", "+nextvalue);
			first=second;
			second=nextvalue;
			
		}
	}
}