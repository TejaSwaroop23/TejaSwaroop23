import java.util.Scanner;

public class EmployeeSalary {
	public static void main(String[] args) {
		int base_salary,da,hra,pf,gross;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Base Salary = ");
		base_salary=sc.nextInt();
		da=base_salary*12/100;
		hra=base_salary*13/100;
		pf=base_salary*15/100;
		gross=base_salary+da+hra+pf;
		System.out.println("da = "+da);
		System.out.println("hra = "+hra);
		System.out.println("pf = "+pf);
		System.out.println("gross salary = "+gross);
		
		
	}
}
