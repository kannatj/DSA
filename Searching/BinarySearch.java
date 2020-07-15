package Searching;

public class BinarySearch {
	
  static int search(int arr[], int k) {
	  
	  
	  int start = 0;
	  int end = arr.length-1;
	  //int result_index = -1;
	  
	  while(start <= end) {
		  int mid = start + (end - start)/2;
		  
		  if(arr[mid] == k)
			  return  mid;
		  
		  if(arr[mid] < k )
			  start = mid+1;
		  else
			  end = mid-1;
		  
	  }
	   
	  return -1;
  }
  
  
  public static int searchRec(int arr[],int start,int end,int key) {
	  
	  if(start==end) {
		  if(arr[start] == key)
			  return start;
		  else
			  return -1;
	  }
	  else {
		   int mid = start + (end - start)/2;
		   
		   if(arr[mid] == key)
			    return mid;
		   
		   if(arr[mid] < key)
			   return searchRec(arr,mid+1,end,key);
		   
		   else 
			   return searchRec(arr,start,mid-1,key);
	  }
	  
  }
  
  public static void main(String as[]) {
	  
	 int arr[] = {1,4,6,12,20,24,27,29,32,39,42};
	 int result = searchRec(arr,0,arr.length-1,20);
	 
	  System.out.println("Value found at index "+ result);

  }

}
