public class Upsidedownstars{
	public static void main(String[] args) {
		//Print stars in up-side down heap manner.
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the heap: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<n;k++) {
				System.out.print("* ");
			}System.out.println();
		}
	}
}