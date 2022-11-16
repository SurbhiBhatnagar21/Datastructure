import java.util.Scanner;
public class SearchingSortingTest {

	public static void main(String[] args) {
int array[]= {10,90,50,65,20,4,60};

for(int i=0;i<array.length;i++) {
	System.out.println("array:"+array[i]);
}

  int data = MyIOService.getInteger("Enter data to search");
  
  boolean found = false;
  for(int i=0;i<array.length;i++) {
	  if(data== array[i]) {
		  found=true;
		  break;
	  }
  }
  
  if(found==true) {
	  System.out.println("data found:"+data);
  }
  else {
	  System.out.println("data not found:"+data);
  }
	}

}

class MyIOService
{
	public static int getInteger(String msgToPrint) {
		System.out.println(msgToPrint);
		Scanner sc= new Scanner(System.in);
		int temp =sc.nextInt();
		return temp;
	}
}
