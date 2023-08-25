public class Heapstars{
	public static void main(String[] args) {
	//print star pattern in heap.
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of heap: ");
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=i;j<n-1;j++) {
				System.out.print(" ");
			}
			
			for(int k=0;k<i+1;k++) {
				
				System.out.print("* ");
			}System.out.println();
		}
	}
}