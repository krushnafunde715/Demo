import java.util.Scanner;
public class CustomerID1
{
	public static int search(int A[],int x)
	{
		for(int i=0;i<A.length;i++)
		{
			if(A[i]==x)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int A[]=new int[8];
		System.out.println("Enter the customer id list:");
		for(int i=0;i<A.length;i++)
		{
			A[i]=sc.nextInt();
		}
		System.out.println("Customer id list is:");
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+"\t");
		}
		System.out.println();
		System.out.println("Enter id for search:");
		int x=sc.nextInt();
		int result=search(A,x);
		if(result==-1)
		{
			System.out.println("Customer id not found:"+x);
		}
		else
			System.out.println("Customer id found:"+x);
		sc.close();
	}
}
//Linear search
