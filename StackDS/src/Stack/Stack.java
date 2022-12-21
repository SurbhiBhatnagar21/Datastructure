package Stack;

import java.util.EmptyStackException;

public class Stack {
	private ListNode top;
	private int length;
	
	public class ListNode{
		private ListNode next;
	    private int data;
		public ListNode(int data) {
			super();
			this.data = data;
		}
	}
	    public Stack() {
		super();
		top = null;
		length = 0;
	}
       public int length() {
    	   return length;
       }
      public boolean IsEmpty() {
    	  return length==0;
      }
      public void push(int data) {
    	  ListNode newNode=new ListNode(data);
    	  newNode.next=top;
    	  top=newNode;
    	  length++;
      }
      public int pop() {
    	  if(IsEmpty()) {
    		  throw new EmptyStackException();
    	  }
    	  int temp=top.data;
    	  top=top.next;
    	  length--;
    	  return temp;
      }
      public int peek() {
    	  if(IsEmpty()) {
    		  throw new EmptyStackException();
    	  }
    	  return top.data;
    		  
    	  
      }
    	  public static void main(String[] args) {
		Stack S = new Stack();
		S.push(10);
	    S.push(20);
	    S.push(30);
	    
	    System.out.println(S.peek());
		S.pop();
		System.out.println(S.peek());
		S.pop();
		System.out.println(S.peek());
		
		
	}

}
