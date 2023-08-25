public class Numbertowords{
	public static void main(String[] args) {
		//print numbers into words like 123 should be printed like one two three.
		String value;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number: ");
		value=sc.next();
		char digit;
		int stringlength=value.length();
		int[] arr=new int[stringlength];
		for(int i=0;i<value.length();i++) {
		    digit=value.charAt(i);
		    arr[i]=Character.getNumericValue(digit);
		   
		}for(int j=0;j<arr.length;j++) {
			switch(arr[j]){
			case 0:
				System.out.print("Zero ");
				break;
			case 1:
				System.out.print("One ");
				break;
			case 2:
				System.out.print("Two ");
				break;
			case 3:
				System.out.print("Three ");
				break;
			case 4:
				System.out.print("Four ");
				break;
			case 5:
				System.out.print("Five ");
				break;
			case 6:
				System.out.print("Six ");
				break;
			case 7:
				System.out.print("Seven ");
				break;
			case 8:
				System.out.print("Eight ");
				break;
			case 9:
				System.out.print("Nine ");
				break;
			}
		}
	}
}