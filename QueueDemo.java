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
        QueueArray=new int [maxSize];
        front=0;
        rear=-1;
        count=0;
    }
    public void enQueue(int value)
    {
        if(rear==maxSize-1)
        {
            System.out.println("Queue is fulled");
        }
        else{
            rear=(rear+1)%maxSize;
            QueueArray[rear]=value;
            System.out.println(value+"is added in Queue");
            count++;
        }
    }
    public void deQueue()
    {
        if(rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("\n"+QueueArray[front]+"is served");
            front=(front+1)%maxSize;
            count--;
        }
        
    }
    public void display()
    {
        if(rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else{
            System.out.println("Queue elements are:");
            for(int i=0;i<count;i++)
            {
                int index= (front+i)%maxSize;
                System.out.print(QueueArray[index]+"\t");
            }
        }
    }
    
}
public class QueueDemo
{
	public static void main(String[] args) {
		Queue q1= new Queue(5);
		
		q1.enQueue(10);
		q1.enQueue(20);
		q1.enQueue(30);
		q1.enQueue(40);
		q1.enQueue(50);
		q1.enQueue(60);
		q1.display();
		q1.deQueue();
		q1.deQueue();
		q1.deQueue();
		q1.display();
	}
}
