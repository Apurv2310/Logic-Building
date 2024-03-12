import java.util.*;
class ReverseString{
	static String reverseString(String str){
		Stack<Character> stk = new Stack<>();
		char[] c = str.toCharArray();
		for(int i=0;i<c.length;i++){
			stk.push(c[i]);
		}
		for(int i=0;i<c.length;i++){
			c[i] = stk.pop();
		}
		String s = new String(c);
		System.out.println("Original String is : "+str);
		System.out.println("Reverse String is : ");
		return s;
	}
	public static void main(String[]args){
		String s = "Hello";
		System.out.println(ReverseString.reverseString(s));
	}
}