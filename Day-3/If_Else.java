import java.util.Scanner;
class If_Else{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number I : ");
		int i = sc.nextInt();
		while(i<10){
			i++;
			System.out.println("Enter Number J :");
			int j = sc.nextInt();
			if(j==0)	
				break;
			else if(j==1)
				continue;
			System.out.println(i);
		}
		System.out.println("Finished");
	}
}