class SecondLargestElem{
	public static void main(String[]args){
		int[] arr = {5,3,21,645,234,234,565,1,2};
		int max = arr[0];
		int second_max=0;
		for(int i=1;i<arr.length;i++){
			if(max<arr[i]){
				second_max=max;
				max = arr[i];
			}
			else if(second_max<arr[i])
				second_max = arr[i];
		}
		System.out.println("Second Largest Element is : "+second_max);
	}
}