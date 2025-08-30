import java.util.*;
public class numCheck 
{
    public static void main(String[] args) {
        Scanner ar=new Scanner(System.in);

        int arr[]=new int[5];
        System.out.println("Enter the numbers");

        for (int i=0;i<5;i++)
        {
            arr[i]=ar.nextInt();
        }

         for (int i=0;i<arr.length;i++)
        {
            if (arr[i]<0) System.out.println(arr[i]+" is Negative");
            else if (arr[i]==0)  System.out.println(arr[i]+" is Zero");
            else 
            {
                if (arr[i]%2==0) System.out.println(arr[i]+" is Even and Positive");
                else System.out.println(arr[i]+" is Odd and Positive");
            }
        }
        ar.close();

    }
    
}
