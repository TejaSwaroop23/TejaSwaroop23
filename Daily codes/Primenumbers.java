public class Primenumbers{
	public static void main(String[] args) {
		//Print Prime numbers
		int count=0;
		int n=Integer.MAX_VALUE;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of prime numbers you want to print: ");
		int num=sc.nextInt();
		for(int j=2;j<=n;j++) {
			boolean Checker=true;
			int sqr_rt=(int) Math.sqrt(j);
			for(int k=2;k<=sqr_rt;k++) {
				if(j%k==0){
					Checker=false;
				}
			}
			if(Checker==true) {
				System.out.print(j+" ");
				count++;
			}
			if(count==num) {
				break;
			}	
		}
			
	}
}