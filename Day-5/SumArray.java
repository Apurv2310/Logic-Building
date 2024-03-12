import java.util.Scanner;
class SumArray{
	static int sum(int[] arr){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum = sum+arr[i];
		}
		System.out.println("Sum of all Element is : ");
		return sum;
	}
	public static void main(String[]args){
		System.out.println("Enter Size of Array : ");
		Scanner sc= new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter Values in an Array : ");
		for(int i=0;i<size;i++){
			System.out.println("Enter value at "+(i+1)+" index");
			arr[i] = sc.nextInt();
		}
		System.out.println(SumArray.sum(arr));
	}
}