public class Additionof2arrays{
	public static void main(String[] args) {
		//Addition of two arrays
		int[] arr1= {1,2,3,4};//declaration
		int[] arr2= {2,3,4,5};//declaration
		int[] arr3= new int[4];//initialization
		System.out.println("new array after addition:");//print function
		System.out.print("arr3 = {");//print function
		for(int i=0;i<arr1.length;i++) {//for loop
			arr3[i]=arr1[i]+arr2[i];//addition of two arrays
			System.out.print(arr3[i]);//print array
			for(int j=0;j<1;j++) {//nested loop to print commas
				if(i==arr1.length-1) {//using if condition
					break;//use break function
				}
				System.out.print(",");//printing commas
			}
		}System.out.print("}");//printing flower brackets
		
	}
}