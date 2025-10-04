import java.util.Scanner;
public class CustomerID2
{
	public static int binarySearch(int A[],int left,int right,int x)
	{
		int mid=0;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(A[mid]==x)
			{
				return mid;
			}
			else if(A[mid]>right)
			{
				right=mid-1;
			}
			else
			{
				left=mid+1;
			}
		}
		return -1;
	}
	public static int bubbleSort(int A[])
	{
		int temp=0;
		for(int i=0;i<A.length;i++)
		{
			for(int j=i+1;j<A.length;j++)
			{
				if(A[i]>A[j])
				{
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		return -1;
	}
	public static void main(String s[])
	{
		Scanner sc=new Scanner(System.in);
		int A[]=new int[8];
		System.out.println("Enter the customer id's:");
		for(int i=0;i<A.length;i++)
		{
			A[i]=sc.nextInt();
		}
		bubbleSort(A);
		System.out.println("Customer id list after sorting:");
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+"\t");
		}
		System.out.println();
		System.out.println("Enter the Customer id for search:");
		int x=sc.nextInt();
		int n=A.length;
		int result=binarySearch(A,0,n-1,x);
		if(result==-1)
		{
			System.out.println("Customer id not found:"+x);
		}
		else
		{
			System.out.println("Customer id found:"+x);
		}	
		sc.close();
	}
}
//binary search
