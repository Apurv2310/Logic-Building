import java.util.Scanner;
class Calculator {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First Number : ");
		int first = sc.nextInt();
		System.out.print("Enter Second Number : ");
		int second = sc.nextInt();
		System.out.println("Enter Your Choice : ");
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				int sum = first+second;
				System.out.println("Sum of two number is : "+sum);
				break;
			case 2:
				int sub = first-second;
				System.out.println("Substraction of two number is : "+sub);
				break;
			case 3:
				int mul = first*second;
				System.out.println("Multiply of two number is : "+mul);
				break;
			case 4:
				double divide = (double)first/(double)second;
				System.out.println("Division of two number is : "+divide);
				break;

		}

	}
}