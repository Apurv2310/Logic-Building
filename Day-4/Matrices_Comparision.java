import java.util.Scanner;
class Matrices_Comparision{
	static Scanner sc = new Scanner(System.in);
	static int[][] arr1(){
		int[][] a = new int[2][2];
		System.out.println("Enter the values of First Array : ");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){	
				a[i][j] = sc.nextInt();
			}
		}
		return a;
	}
	static int[][] arr2(){
		int[][] b = new int[2][2];
		System.out.println("Enter the values of Second Array : ");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++){	
				b[i][j] = sc.nextInt();
			}
		}
		return b;
	}
	static String compare(int[][] a,int[][] b){
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				if(a[i][j] == b[i][j])
					continue;
				else{
					return "Arrays are not equal";	
				}
			}
		}
		return "Arrays Are equal!!!";
	}
	public static void main(String[] args){
		System.out.println(Matrices_Comparision.compare(arr1(),arr2()));
	}
}