public class Checkdiscount{
	public static void main(String[] args) {
		//Display discount on each product
		int num=1;
		int bill=20000;
		int discount=0;
		System.out.println("Your total bill: "+bill);
		switch(num){
			
		case 1:
			discount=bill*10/100;
			System.out.println("You get 10% discount on nuts: "+discount);
			
			
		case 2:
			discount=bill*5/100;
			System.out.println("You get 5% discount on oils: "+discount);
			
			
		case 3:
			discount=bill*12/100;
			System.out.println("You get 12% discount on soaps: "+discount);
			
			
		case 4:
			discount=bill*2/100;
			System.out.println("You get 2% discount on other products: "+discount);
			break;
			
		}
		
	
	}

	
}