import java.util.Scanner;

public class Hdfcbank {
	public static void main(String[] args) {
		float balance=25000;
		int deposit,withdraw;
		float interest_amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("Hi, your current balance is = "+balance +'\n');
		System.out.println("How much u want to deposit?");
		deposit=sc.nextInt();
		System.out.println("How much u want to withdraw?");
		withdraw=sc.nextInt();
		balance=(balance+deposit)-withdraw;
		
		System.out.println("Your current balance is = "+balance);
		interest_amount=(balance*2/100)*12;
		System.out.println("Your 12 month interest amount="+interest_amount);
		balance=balance+interest_amount;
		System.out.println("Your total balance after 2% for 12 months is ="+balance);
		
		
		
		
	}
}