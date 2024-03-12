import java.util.Scanner;
class Check{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		for(int i=1;i>0;){
			System.out.println("Enter a number : ");
			int j = sc.nextInt();
			if(j==0){
				System.out.println("Terminate");
				break;
			}
		}
	}
}