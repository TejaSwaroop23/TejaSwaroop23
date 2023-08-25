public class Printalphabetsinheap{
	public static void main(String[] args) {
		//Print A,B,C,D in heap.
		int starting_letter=65;
		int ending_letter=70;
		for(int i=starting_letter;i<=ending_letter;i++) {
			for(int j=i;j<ending_letter;j++) {
				System.out.print(" ");
			}
			for(int k=starting_letter;k<i+1;k++) {
				char character=(char) k;
				System.out.print(character+" ");
			}
			System.out.println();
		}
	}
}