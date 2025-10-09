class Node
{
	int rollNo;
	String name;
	float marks;
	Node next;
	Node(int rollNo, String name,float marks)
	{
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
		this.next=null;
	}
	
}
class LinkedList
{
	Node head;
	public void insert(int rollNo,String name,float marks)
	{
		Node n1= new Node(rollNo,name,marks);
		if(head==null)
		{
			head=n1;
			return;
		}
		Node temp=head;
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=n1;
	}
  public void show()
	{
		Node temp=head;
		System.out.print("Head->");
		while(temp!=null)
		{
			System.out.print(temp.rollNo+"\t"+temp.name+"\t"+temp.marks+"\t"+"->");
			temp=temp.next;
		}
		System.out.println("Null");
	}
}
public class StudentData
{
	public static void main(String s[])
	{
		LinkedList l1 = new LinkedList();
		l1.insert(9,"Aware Atharv",91);
		l1.insert(63,"Shubham Gaikwad",96);
		System.out.println("Student data is:");
		l1.show();
	}
}
