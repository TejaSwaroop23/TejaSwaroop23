public class Armstrongnumber{
	public static void main(String[] args) {
		//Tell if a number is Armstrong number or not
		String ch;
		char x;
		int y=3;
		int z=0;
		int k=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		ch=sc.next();
		int number = Integer.parseInt(ch);
		for(int i=0;i<ch.length();i++) {
			 x=ch.charAt(i);
			 k=Character.getNumericValue(x); 
			 k=k*k*k;
			z=z+k;
		}if(number==z) {
			System.out.println("It's a Amstrong number.");
		}else {
			System.out.println("It's not a Armstrong number.");
		}
	}
}