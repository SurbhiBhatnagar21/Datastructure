package DoublyLinkedList;

public class DoublyLL {
	MySong start=null,ptr,temp,nn;
	void addSong(MySong newsong) {
		if( start==null) 
			
		{
			System.out.println("Juke box is empty");
			start=newsong;
			start.prev=null;
			start.next=null;
		}
		else if(start.next==null)
		{
			start.next=newsong;
			newsong.prev=start;
			newsong.next=null;
			System.out.println("Added first Song");
		}
		else
		{
			ptr=start.next;
			while(ptr.next!=null)
			{
				ptr=ptr.next;
			}
			ptr.next=newsong;
			newsong.prev=ptr;
			newsong.next=null;
			System.out.println("Added the internal Song");
		}
		
		
		
	}
	void showAllSongs() {
		if(start==null) {
			System.out.println("juke box is empty");
		}
		else {
			ptr=start;
			while(ptr!=null) {
				System.out.println("DATA:"+ptr);
				ptr=ptr.next;
			}
		}
	}
	
	void insertSong() {
		ptr=start.next;
		while(ptr.next!=null) {
			if(ptr.year==1997) {
				nn.next=ptr;
				nn.prev=temp;
				temp.next=nn;
				ptr.prev=nn;
				
			}
			temp=ptr;
			ptr=ptr.next;
			
			
			
		}
		
	}

}
