import java.util.Scanner;
public class LinearSearch
{
    public static int search(int A[],int x)
    {
        for(int i=0; i<A.length; i++)
        {
            if(A[i]==x)
            {
                return i;
            }
        }
        return-1;
    }



	public static void main(String[] args) 
	{
	   
	    Scanner sc= new Scanner(System.in);
	    int A[]={10,30,50,20,40,90,60,70,80};
	    System.out.println("Enter the element for search:");
	    int x=sc.nextInt();
	    int result=search(A,x);
	    
	    if(result==-1)
	    {
	        System.out.println("Element not found:"+x);
	    }
	    else
	    {
	        System.out.println("Element is found:"+x);
	    }
	}
}
