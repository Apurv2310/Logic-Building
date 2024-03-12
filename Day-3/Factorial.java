class Factorial{
	public static void main(String[]args){
		int fac = 6;
		int mul = 1;
		while(fac!=0){
			mul = mul*fac;
			fac--;
		}
		System.out.println("Factorial is : "+mul);
	}
}