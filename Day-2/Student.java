import java.util.Scanner;
class Student{
	String name;
	int sub1_Mark;
	int sub2_Mark;
	int sub3_Mark;
	
	void set_Value(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name of Student : ");
		name = sc.nextLine();
		System.out.println("Enter 1st subject Mark : ");
		sub1_Mark = sc.nextInt();
		System.out.println("Enter 2nd Subject Mark : ");
		sub2_Mark = sc.nextInt();
		System.out.println("Enter 3rd subject Mark : ");
		sub3_Mark = sc.nextInt();
	}
	double average_Marks(){
		double avg = (sub1_Mark+sub2_Mark+sub3_Mark)/3;
		return avg;
	}
	void get_Value(){
		System.out.println("Name = " +name+ "\nFirst Subject Mark = "+ sub1_Mark+ "\nSecond Subject Mark = " + sub2_Mark+ "\nThird Subject Mark = " +sub3_Mark);
	}
	public static void main(String[]args){
		Student s1 = new Student();
		s1.set_Value();
		System.out.println("\nAverage marks is : "+s1.average_Marks());
		s1.get_Value();
	}
}