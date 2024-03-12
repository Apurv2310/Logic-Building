import java.util.*;
class NonDuplicates{
	public static void main(String[]args){
		int[] arr = {1,2,2,3,4,4,5};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]== arr[j]){
					arr[j]=0;
				}
			}
		}
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			if(arr[i] == 0){
				continue;
			}
			else	
				list.add(arr[i]);
		}
		System.out.println(list);
		
	}	
}