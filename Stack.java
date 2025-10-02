class StackDemo
{
    int maxSize;
    int StackArray[];
    int top;
    
    Stack(int size)
    {
        maxSize=size;
        StackArray= new int[maxSize];
        top=-1;
    }
    public void push(int value)
    {
        if(top==maxSize-1)
        {
            System.out.println("Stack is overflow");
        }
        else{
            StackArray[++top]=value;
            System.out.println(value+"is pushed");
            
        }
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is underflow");
            return -1;
        }
        else
        {
            System.out.println(StackArray[top]+"is popped");
            return(top--);
        }
    }
    public void display()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Stack elements are:");
            for(int i=0; i<=top; i++)
            {
                System.out.print(StackArray[i]+"\t");
            }
            System.out.println();
        }
    }
    public void maxValue()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            int max=StackArray[top];
            for(int i=0; i<=top; i++)
            {
                if(StackArray[i]>=max)
                {
                    max=StackArray[i];
                }
            }
            System.out.println(max+"is the max value in the stack");
        }
    }
    public void minValue()
    {
        if(top==-1)
        {
            System.out.println("Stack is empty");
        }
        else
        {
            int min=StackArray[top];
            for(int i=0; i<=top; i++)
            {
                if(StackArray[i]<=min)
                {
                    min=StackArray[i];
                }
            }
            System.out.println(min+"is the minimum value in the stack");
        }
    }
    public boolean isFull()
    {
        return(top==maxSize-1);
    }
    public boolean isEmpty()
    {
        return(top==-1);
    }
}
public class Stack
{
	public static void main(String[] args) {
		StackDemo s1= new StackDemo(5);
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		System.out.println(s1.isFull());
		s1.push(40);
		s1.push(15);
		s1.push(60);
		s1.display();
		s1.maxValue();
		s1.minValue();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		s1.pop();
		System.out.println(s1.isEmpty());
		s1.pop();
	}
}
