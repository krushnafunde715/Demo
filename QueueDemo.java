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
    public void enQueue(int value)
    {
        if(rear==maxSize-1)
        {
            System.out.println("Queue is full cant add element");
        }
        else
        {
            rear=(rear+1)%maxSize;
            QueueArray[rear]=value;
            System.out.println(value+"is added");
            count++;
        }
        
    }
    public void deQueue()
    {
        if(rear==-1)
        {
            System.out.println("Queue is empty cant remove element");
        }
        else
        {
            System.out.println(QueueArray[front]+"is deleted");
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
        else
        {
            System.out.println("Queue elements are:");
            for(int i=0; i<count; i++)
            {
                int index=(front+i)%maxSize;
                System.out.print(QueueArray[index]+"\t");
            }
            System.out.println();
        }
    }
    public void maxValue()
    {
        if(rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            int max=QueueArray[front];
            for(int i=0; i<count; i++)
            {
                if(QueueArray[i]>=max)
                {
                    max=QueueArray[i];
                }
            }
            System.out.println(max+"is the maximum value");
        }
    }
    public void minValue()
    {
        if(rear==-1)
        {
            System.out.println("Queue is empty");
        }
        else
        {
            int min=QueueArray[front];
            for(int i=0; i<count; i++)
            {
                if(QueueArray[i]<=min)
                {
                    min=QueueArray[i];
                }
            }
            System.out.println(min+"is the minimum value");
        }
    }
    public boolean isFull()
    {
        return(rear==maxSize-1);
    }
    public boolean isEmpty()
    {
        return(rear==-1);
    }
}
class QueueDemo
{
    public static void main(String s[])
    {
        Queue c1= new Queue(5);
        c1.enQueue(10);
        c1.enQueue(50);
        c1.enQueue(30);
        System.out.println(c1.isFull());
        c1.enQueue(20);
        c1.enQueue(40);
        c1.enQueue(60);
        c1.maxValue();
        c1.minValue();
        c1.display();
        c1.deQueue();
        c1.deQueue();
        c1.deQueue();
        System.out.println(c1.isEmpty());
        c1.display();
    }
}

