package Searching;

public class LinearSearch {
	
 static int linearSearch(int arr[],int key) {
	 for(int i=0;i<arr.length;i++) {
		 if(arr[i] == key) 
			 return i;
	 }
	 
	 return -1;
 }
 
 
 public static void main(String as[]) {
	 int arr[] = {1,3,7,2,5,9,21,20,6}; 
	 int key = 21;
	 
	 int result = linearSearch(arr,key);
	 
	 System.out.println("Key -> "+key+" Found at position "+result);
	 
 }
}
