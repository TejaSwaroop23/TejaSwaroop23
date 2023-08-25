public class Armopousnumber{
	public static void main(String[] args) {
		//Armopous number=given any number like 123 the sum of individial digits 
		//and multiplication should be equal.
		char digit;
		String value;
		int num;
		int z=0;
		int k=1;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check if it is Armopous: ");
		value=sc.next();
		
		for(int i=0;i<value.length();i++) {
			digit=value.charAt(i);
			num=Character.getNumericValue(digit);
			z=z+num;
			k=k*num;
		}if(z==k) {
			System.out.println("It's a Armopous number.");
		}
		else {
			System.out.println("It's not a Armopous number.");
		}
	}
}
