public class Palindromenumber{
	public static void main(String[] args) {
		//Tell if a number or word is a palindrome or not
		int count=0;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter any value: ");
		String input=sc.next();
		for(int i=0;i<input.length()/2;i++) {
			if(input.charAt(i)==input.charAt((input.length()-1)-i)){
				 
			}else {
				count++;
				break;
			}
		}if(count==1) {
			System.out.println("It's not a Palindrome");
		}
		else {
			System.out.println("It's a palindrome");
		}
		 
	}

}