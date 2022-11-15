
public class LinkedListConTest {
	
		public static void main(String[] args) {
			Kite k1 = new Kite("Red","Jack",50,true);
			Kite k2 = new Kite("Green","Jane",60,true);
			Kite k3 = new Kite("Blue","John",80,true);
			Kite k4 = new Kite("Yellow","Julie",90,true);
			Kite k5 = new Kite("Black","Jim",75,true);
			Kite k6 = new Kite("MAGENTA","STOKES",138,true);
			
			MyLinkedList myList = new MyLinkedList();
		}

}

		
		class MyLinkedList
		{
			Kite start,ptr,prev;

			void showList() {
				if(start==null) {
					System.out.println("List is empty");
				}
				else {
					System.out.println("List is not empty");
					ptr = start;
					while(ptr!=null) {
						System.out.println("DATA :"+ptr);
						ptr=ptr.next;
					}
				}
			}
			void insertKite(String ownerToFind,Kite newKite) {
				boolean found=false;
				
				if(start==null) {
					System.out.println("List is Empty....cannot add this object");
				}
				else if (start.owner.equals(ownerToFind)) {
					addAtBeginning(newKite);
				}
				else {
					ptr=start;
					while(ptr!=null) {
						if(ptr.owner.equals(ownerToFind)) {
							found=true;
							break;
						}
						prev=ptr;
						ptr=ptr.next;
						
					}
					if(found==true) {
						prev.next = newKite;
						newKite.next =ptr;
						System.out.println("Object INSERTED before....."+ownerToFind);
					}
					else {
						System.out.println("Object not Found..."+ownerToFind);
					}
				}
				}
					
			
			
			void searchKiteByLength(int lengthToSearch) {
				boolean found=false;
				if(start==null) {
					System.out.println("list is empty....nothing to search");
					ptr=start;
					while(ptr!=null) {
						if(ptr.length == lengthToSearch) {
							System.out.println("Kite Found :"+ptr);
							found=true;
							break;
						}
						ptr=ptr.next;
					}
					if(found!=true) {
						System.out.println("Kite not found... of this length : "+lengthToSearch);
					}
				}
					}
				
				
				void addAtBeginning(Kite newKite) {
					if(start!=null) {
						System.out.println("Kite is added at the beginning of this kite");
						newKite.next=start;
						start=newKite;
					}
					}
					
					void deleteNodeByOwner(String ownerName) {
						boolean found=false;
						
						if(start==null) {
							System.out.println("List is empty...nothing to delete");
						}
						else if(start.owner.equals(ownerName)) {
							prev =start;
							start=start.next;
							prev.next=null;
							System.out.println("Deleted owner from the Beginning");
					}
					else {
						ptr=start;
						//boolean found;
						while(ptr!=null)
						{
							//Object ownerName;
							if(ptr.owner.equals(ownerName)){
								found=true;
								break;
							}
							prev=ptr;
							ptr=ptr.next;
					}
						if(found==true) {
							prev.next=ptr.next;
							System.out.println("Internal Object deleted...by owner name.");
							ptr.next = null;
							ptr =null;
						}
						else {
							System.out.println("Owner name  NOT found....");
						}
					}
		}
		

		void deleteKite(Kite theKite) {
			boolean found=false;
		
			
			
			if(start==null) {
				System.out.println("List is empty..nothing to delete");
			}
			else if(start == theKite) {
				prev = start;
				start = start.next;
				prev.next=null;
				System.out.println("Deleted Kite from the begining...");
			}
			else {
				Kite ptr = start;//100
				while(ptr!=null)
				{
					if(ptr == theKite) {
						found=true;
						break;
					}
					prev = ptr; //100
					ptr = ptr.next;
				}
				if(found==true) {
					prev.next = ptr.next;
					System.out.println("Internal Object deleted...by Kite reference.");
					ptr.next = null;
					ptr =null;
				}
				else {
					System.out.println("Kite NOT found....");
				}
			}
		}
		
		
		void add(Kite newKite) { // addAtEnd
			
			if(start==null) {
				System.out.println("Adding first node...");
				start = newKite;
				//start.next = null;
			}
			else {		
				System.out.println("Adding internal node...");
				 ptr = start;
				
				while(ptr!=null) {
					System.out.println("Searching....");
					prev = ptr;
					ptr=ptr.next;
				}
				prev.next = newKite;
				newKite.next = null;
			}
		}
		
}

