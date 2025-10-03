import java.util.Scanner;
public class CustomerIDLS
{
    public static int search(int List[],int ID)
    {
        for(int i=0; i<List.length; i++)
        {
            if(List[i]==ID)
            {
                return ID;
            }
        }
        return -1;
    }
    public static void main(String s[])
    {
        Scanner sc=new Scanner(System.in);
        int List[]={1001,1002,1003,1004,1005,1006,1007,1008,1009,1010};
        System.out.println("Enter the ID for search:");
        int ID=sc.nextInt();
        int result=search(List,ID);
        
        if(result==-1)
        {
            System.out.println("Customer ID not found:"+ID);
        }
        else
        {
            System.out.println("Customer ID found:"+ID);
        }
    }
}
