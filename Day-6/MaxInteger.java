import java.util.Scanner;
class MaxInteger{	
	static int maxValue(int a,int b){
		if(a>b){
			System.out.println("Max value is A : ");
			return a;
		}	
		else if(a==b){
			System.out.println("Both the number is Equal : ");
			return a;
		}
		else
			System.out.println("Max value is B : ");
			return b;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Value : ");
		int a = sc.nextInt();
		System.out.println("Enter second value");
		int b = sc.nextInt();
		System.out.println(MaxInteger.maxValue(a,b));
	}
	
}