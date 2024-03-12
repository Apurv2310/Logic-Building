import java.util.*;
class CommonElem{
	public static void main(String[]args){
		int[] arr1 = {1,2,2,3,4,3,4,5};
		int[] arr2 = {3,4,5,32,2,3,4,1,6,7};
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr1.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr1[i]==arr2[j]){
					list.add(arr1[i]);
				}
			}
		}
		System.out.println(list);
		for(int i=0;i<list.size();i++){
			for(int j=i+1;j<list.size();j++){
				if(list.get(i) == list.get(j)){
					list.remove(j);
				}
				else
					continue;
			}
		}
		System.out.println(list);
	}
}