import java.util.Arrays;
import java.util.Scanner;

public class SearchingSortingTest2 {

	public static void main(String[] args) {
   int array[]= {10,90,50,65,20,4,60};
   
   
   for (int i=0;i<array.length;i++) {
	   System.out.println("array:"+array[i]);
   }
   System.out.println("Sorting....");
   Arrays.sort(array);
  System.out.println("Sorted...");
  
  for (int i=0;i<array.length;i++) {
	   System.out.println("array:"+array[i]);
  }
  
  int data=MyIOService.getInteger("Enter data to search:");
   int first=0;
   int last= array.length-1;
   int middle=(first+last)/2;
   
   
   
   while(first<=last) {
	   if(array[middle]<data) {
		   first=middle+1;
	   }
	   else if(array[middle]==data) {
		   System.out.println("Found the data: "+data+" at location "+(middle+1));
		   break;
	   }
	   else {
		   last=middle-1;
	   }
	   middle=(first+last)/2;
	   if(first>last) {
		   System.out.println("Data not found..");
	   }
   }
  
	}

}
