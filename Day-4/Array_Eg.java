class Array_Eg{
	static int a[] = {5,4,3,9,1,7,9};
	static int sum = 0;
	static void sum_array(){
		for(int i=0;i<a.length;i++){
			sum = a[i]+sum;
		}
		System.out.println("Sum of array is : "+sum);
	}
	static void sum_average(){
		double average = (double)sum/(double)a.length;
		System.out.println("Average of array is : "+average);
	}
	public static void main(String[]args){
		Array_Eg.sum_array();
		Array_Eg.sum_average();
	}
}