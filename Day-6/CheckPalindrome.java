import java.util.*;
class CheckPalindrome{
	static boolean isPalindrome(String str){
		Stack<Character> stk = new Stack<>();
		char[] c = str.toCharArray();
		System.out.println("Is string is palindrome???? ");
		for(int i=0;i<c.length;i++){
			stk.push(c[i]);	
		}
		for(int i=0;i<c.length;i++){
			if(stk.peek() == c[i]){
				stk.pop();
			}
			else 
				return false;
		}
		return true;
	}	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str = sc.nextLine();
		System.out.println(CheckPalindrome.isPalindrome(str));

	}
}