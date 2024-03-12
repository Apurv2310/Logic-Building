class PatternThird{
	public static void main(String[]args){
		int a = 5;
		int temp= 1;
		for(int i=a;i>=1;i--){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=temp;k++){
				System.out.print(temp);
				System.out.print(" ");
			}
			temp++;
			System.out.println();
		}	
	}	
}