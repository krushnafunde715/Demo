class Queue
{
	int maxSize;
	int QueueArray[];
	int front;
	int rear;
	int count;
	Queue(int size)
	{
		maxSize=size;
		QueueArray=new int[maxSize];
		front=0;
		rear=-1;
		count=0;
	} 	
	public void addEvent(int event)
	{
		if(rear==maxSize-1)
		{
			System.out.println("Event list is full allready");
		}
		else
		{
			rear=(rear+1)%maxSize;
			QueueArray[rear]=event;
			System.out.println(QueueArray[rear]+"event is added");
			count++; 
		}
	}
  	public void nextEvent()
	{
		if(count==0)
		{
			System.out.println("Event list is end");
		}
		else
		{
			System.out.println(QueueArray[front]+"event is process and remove");
			front=(front+1)%maxSize;
			count--;
		}
	}
	public void display()
	{
		if(count==0)
		{
			System.out.println("No current Event");
		}
		else
		{
			System.out.println("Event list is:");
			for(int i=0;i<count;i++)
			{
				int index=(front+i)%maxSize;
				System.out.print(QueueArray[i]+"\t");
			}
			System.out.println();
		}
	}
}
class Event
{
	public static void main(String s[])
	{
		Queue a1=new Queue(6);
		
		a1.addEvent(10);
		a1.addEvent(20);
		a1.addEvent(30);
		a1.addEvent(40);
		a1.addEvent(50);
		a1.addEvent(60);
		a1.addEvent(70);
		a1.display();
		a1.nextEvent();
		a1.nextEvent();
		a1.nextEvent();
		a1.nextEvent();
		a1.display();
	}
}
