public class Printoddnumbers{
	public static void main(String[] args) {
		//print odd numbers.
	    int num;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the number of odd numbers you would like to print: ");
	    num=sc.nextInt();
	    num=num*2;
	    for(int i=1;i<=num;i++) {
	    	if(i%2 != 0) {
	    		System.out.print(i+" ");
	    	}
	    	else {
	    		continue;
	    	}
	    }
	   
	   
	    
	}
}