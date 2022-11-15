import java.util.Scanner;

public class MyTreeSetTest {

	public static void main(String[] args) {	
		ChemicalElement gold=new ChemicalElement(79,"Gold","Au",196.97f);
		ChemicalElement silver=new ChemicalElement(47,"Silver","Ag",107.87f);
		ChemicalElement radium=new ChemicalElement(88,"Radium","Ra",226.03f);
		ChemicalElement calcium=new ChemicalElement(20,"Calcium","Ca",40.08f);
		ChemicalElement tin=new ChemicalElement(50,"Tin","sn",118.711f);
		ChemicalElement lead=new ChemicalElement(82,"Lead","Pb",207.2f);
		ChemicalElement uranium=new ChemicalElement(92,"Uranium","U",238.29f);
		
		Scanner scan = new Scanner(System.in);
		
		MyTreeSet ts = new MyTreeSet();
		
		int choice = 0;
		
		do
		{
			System.out.println("1. Insert an element");
			System.out.println("2. Delete an element");
			System.out.println("3. Inorder traversal");
			System.out.println("4. PreOrder traversal");
			System.out.println("5. PostOrder traversal ");
			System.out.println("6. Exit");
			System.out.println("Enter choice");
			choice = scan.nextInt();
			
			   switch(choice) 
			   {
			   case 1: ts.insert();
			   break;
			   
			   case 3: ts.inOrder(ts.root);
			   break;
			   
			   case 6:break;
			   }
		}while(choice!=6);
			
		}
}	


class MyTreeSet{
	ChemicalElement root = null,temp;
	
	
	void insert() {
		create();
		if(root==null) {
			root=temp;
		}
		else {
			search(root);
		}
	}
	 void create() {
		 System.out.println("Enter atomic number:");
		 Scanner scan = new Scanner(System.in);
			int tempAtomicNumber = scan.nextInt();
			
			temp = new ChemicalElement();
			temp.atomicNumber = tempAtomicNumber;
			
			temp.left = null;
			temp.right= null;
	 }
	 																										//79
	 void search(ChemicalElement ce)																//47			//88
		{			//20				//47												//20		//50
			if((temp.atomicNumber > ce.atomicNumber) && (ce.right!=null))				//18	//23
				search(ce.right); //recursive call
			else if((temp.atomicNumber > ce.atomicNumber) && (ce.right==null))
				ce.right=temp; // assing the node

			else if((temp.atomicNumber < ce.atomicNumber) && (ce.left!=null)) 
				search(ce.left); //recursive call
			else if((temp.atomicNumber < ce.atomicNumber) && (ce.left==null)) 
				ce.left=temp; // assing the node
		}
		
		void inOrder(ChemicalElement ce) {
			if(root == null) {
				System.out.println("No elements to show in the tree");
				return ;
			}
			
			if(ce.left !=null) 
				inOrder(ce.left);
			
			System.out.println("DATA :"+ce);
			
			if(ce.right !=null) 
				inOrder(ce.right);
		}
}
		
		
		 
	 


