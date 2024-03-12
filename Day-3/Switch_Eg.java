import java.util.Scanner;
class Switch_Eg
{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 10 : ");	
		int i = sc.nextInt();
		if(i>=0 && i<= 10){	
		switch(i){
			case 10 :
				System.out.println("You have full Marks");
				break;
			case 9 :
				System.out.println("You have almost full marks");
				break;
			case 8 : 
				System.out.println("You have done very Well");
				break;
			case 7 :
				System.out.println("You have done well");
				break;
			case 6 :
				System.out.println("alright! need to study more");
				break;
			case 5 : 
				System.out.println("Half Marks");
				break;
			case 4 : 
				System.out.println("Less than Half ");
				break;
			case 3 :
				System.out.println("got low marks");
				break;
			case 2 : 
				System.out.println("got very low marks");
				break;
			case 1 :
				System.out.println("got only 1 Mark");
				break;
			default :
				System.out.println("You Failed!!!");
		}
		}else{
			System.out.println("Please Enter number between 0 to 10");
		}
	}	
}