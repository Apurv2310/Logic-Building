import java.util.Scanner;
class Multiplication{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int mul;
		System.out.println("Enter Number :");
		int a = sc.nextInt();
		for(int i=1;i<=10;i++){
			mul = a*i;
			System.out.println(mul);
		}
	}
}