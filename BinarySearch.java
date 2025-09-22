import java.util.Scanner;

public class BubbleSort
{

    static int binarySearch(int A[],int left, int right, int x)
    {
        int mid=0;
        while(left<=right)
        {
            mid= (left+right)/2;
            if(A[mid]==x)
            {
                return mid;
            }
            else if(A[mid]>x)
            {
                right= mid-1;
            }
            else
            {
                left= mid+1;
            }
        }
        return -1;
    }
    public static void main(String s[])
    {
       
        int A[]= {25,35,43,51,56,59,63};
        int x= 10;
        int n=A.length;
        int result= binarySearch(A,0,n-1,x);
        
        if(result==-1)
        {
            System.out.println("Array element not found:"+x);
        }
        else
        {
            System.out.println("Array element found:"+x);
        }
    }
}
