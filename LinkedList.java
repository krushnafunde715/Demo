import java.lang.*;
class Node
{
	 int data;
	 Node next;
	
 	Node(int data)
 	{
  		this.data=data;
  		this.next=null;
 	}
}
class Linkedlist
{
 	Node head;
 	public void insert(int data)
 	{
  		Node n2= new Node(data);
  		if(head==null)
  		{
   			head=n2;
   			return;
  		}
  		Node temp=head;
	  	while(temp.next!=null)
	  	{
	   		temp=temp.next;
		  }
		 	temp.next=n2;
 	}

 	public void show()
	 {
		System.out.println("Linkedlist is.");
		if(head==null)
		{
	  	System.out.print("The linklist is empty");
	  	return;
		}
		Node temp=head;
		while(temp!=null)
		{
  		System.out.print(temp.data+"->");
  		temp=temp.next;
		}
		System.out.print("null");
	}
}
class Sample3
{
  public static void main(String s[])
  {
	   Linkedlist l1=new  Linkedlist();
    l1.insert(00);
    l1.insert(10);
    l1.insert(20);
   	l1.insert(30);
   	l1.insert(40);
	   l1.insert(50);
   	l1.insert(60);
	
	   l1.show();
  }
}