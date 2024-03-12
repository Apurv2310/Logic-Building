import java.util.Scanner;
class Sum{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int sum = 0;
		int digit;
		do{
			digit = i%10;
			sum = sum+digit;
			i = i/10;
		}while(i>0);
		System.out.println("Sum is : "+sum);
	}
}