import java.util.Scanner;
class A{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int var = sc.nextInt();
		if(var>40)
			System.out.println("PASSED");
		else
			System.out.println("Failed");
	}
}