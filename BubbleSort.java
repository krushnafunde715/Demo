import java.util.Scanner;

public class BubbleSort
{
    static int bubbleSort(int A[])
    {
        int temp=0;
        for(int i=0; i<A.length; i++)
        {
            for(int j=i+1; j<A.length; j++)
            {
                if(A[i]>A[j])
                {
                    temp= A[i];
                    A[i]= A[j];
                    A[j]= temp;
                }
            }
        }
        return 0;
    }
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int A[]= new int[5];
        System.out.println("Enter array elements:");
        for(int i=0; i<A.length; i++)
        {
            A[i]= sc.nextInt();
        }
        bubbleSort(A);
        System.out.println("New array after sort:");
        for(int i=0; i<A.length; i++)
        {
            System.out.print(A[i] +"\t");
        }
    }
}
