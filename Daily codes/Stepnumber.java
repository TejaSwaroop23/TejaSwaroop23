public class Stepnumber{
	public static void main(String[] args) {
		//Print number in a step number pattern.
		int n=1;
		for(int i=0;i<=4;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(n+" ");
				n++;
			}System.out.println();
		}
	}
}