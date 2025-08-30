import java.util.*;
public class canVote 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[10];
       
       for(int i=0;i<10;i++)
       {
        System.out.print("Enter the age of student " +(i+1)+" : ");
        arr[i]=sc.nextInt();
       }

       for (int i=0;i<arr.length;i++)
       {
            if (arr[i]<0) System.out.println("Invaid Age");
            else if (arr[i]>=18) System.out.println("Eligible to Vote");
            else System.out.println("Not Eligible to Vote");
       }

       sc.close();

    }
    
}
