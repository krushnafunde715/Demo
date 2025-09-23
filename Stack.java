class Stack
{
    int maxSize;
    int stackArray[];
    int top;
    Stack(int size)
    {
        maxSize=size;
        stackArray= new int[maxSize];
        top=-1;
    }
    public void push(int value)
    {
        if(top==maxSize-1)
        {
            System.out.println("Stack overflow");
        }
        else
        {
            stackArray[++top]=value;
            System.out.println(value+"is pushed in stack");
        }
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        else
        {
            System.out.println(stackArray[top]+"is popped");
            return stackArray[top--];
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
                System.out.print(stackArray[i]+"\t");
            }
        }
    }
    public int top()
    {
        if(top==-1)
        {
            System.out.println("\n"+"Stack is empty");
        }
        else
        {
            System.out.println("\n"+"Top element is:" +stackArray[top]);
        }   
        return -1;
        
    }
    boolean isEmpty()
    {
        return(top==-1);
    }
    boolean isFull()
    {
        return(top==maxSize-1);
    }
    public void minValue()
    {
        int min=stackArray[0];
        for(int i=0; i<=top; i++)
        {
            if(stackArray[i]<=min)
            {
                min=stackArray[i];
            }
        }
        System.out.println("Minimum value is:"+min);
    }
    public void maxValue()
    {
        int max=stackArray[0];
        for(int i=0; i<=top; i++)
        {
            if(stackArray[i]>=max)
            {
                max=stackArray[i];
            }
        }
        System.out.println("Maximum value is:"+max);
    }
    
}
class StackDemo
{
    public static void main(String s[])
    {
        Stack sc= new Stack(5);
        sc.push(10);
        sc.push(20);
        sc.push(30);
        sc.pop();
        sc.push(50);
        sc.push(40);
        sc.display();
        sc.top();
        System.out.println(sc.isEmpty());
        System.out.println(sc.isFull());
        sc.minValue();
        sc.maxValue();
    }
}
