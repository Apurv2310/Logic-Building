import java.util.Scanner;
class MultiArray{
	static Scanner sc = new Scanner(System.in);
	static int[][] arr1(){
		int[][] a = new int[2][2];
		System.out.println("Enter the Values of First Array : ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}
	static int[][] arr2(){
		int[][] b = new int[2][2];
		System.out.println("Enter the Values of Second Array : ");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++){
				b[i][j] = sc.nextInt();
			}
		}
		return b;
	}
	static void sum(int[][] a,int[][]b){
		int total = 0;
		System.out.println("Sum of 2-d array is : ");
		for(int i=0;i<a.length;i++){	
			for(int j=0;j<a.length;j++){	
				total = a[i][j]+b[i][j];
				System.out.print(total+" ");
				total = 0;
			}
			System.out.println();
		}
	}
	public static void main(String[]args){
		MultiArray.sum(arr1(),arr2());
	}
}