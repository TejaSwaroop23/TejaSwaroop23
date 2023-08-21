public class Sortingofarrays{
	public static void main(String[] args) {
		//Sorting arrays in ascending order.
		int[] arr= {10,12,14,15,13,11};//declaration
		
		for(int i=arr.length-1;i>0;i--) {//forloop
			for(int j=arr.length-1;j>0;j--) {//nested for loop
				if(arr[j]<arr[j-1]) {//if condition
					int x=arr[j-1];//logic statement
					arr[j-1]=arr[j];
					arr[j]=x;
				}
			}
		}
			System.out.print("After sorting in ascending order: {");//print stuff
			for(int k=0;k<arr.length;k++) {//for loop to print array
				System.out.print(arr[k]);//print function
				for(int l=0;l<1;l++) {//for loop to print comma
					if(k==arr.length-1) {//if condition to break 
						break;//break function
					}
					System.out.print(",");//print comma in loop
				}
			}System.out.print("}");//print flower bracket to end
			
	}
}