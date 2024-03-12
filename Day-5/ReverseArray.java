class ReverseArray{
	public static void main(String[]args){
		int[] arr = {1,2,3,4,5};
		System.out.println("Originl Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	
		// Reverse Array 
		System.out.println("\nReverse Array : ");
		 for(int i=(arr.length-1);i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}	
}