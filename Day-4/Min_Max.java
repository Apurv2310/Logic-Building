class Min_Max{
	static int[] a = {5,4,3,9,1,7,9};
	static void min(){
		int min = a[0];
		for(int i=1;i<a.length;i++){
			if(min>a[i]){
				min = a[i];
			}
		}
		System.out.println("Minimum number is : "+min);
	}
	static void max(){
		int max = a[0];
		for(int i=1;i<a.length;i++){
			if(max<a[i]){
				max = a[i];
			}
		}
		System.out.println("Maximum number is : "+max);
	}
	public static void main(String[]args){
		Min_Max.min();
		Min_Max.max();
	}
}