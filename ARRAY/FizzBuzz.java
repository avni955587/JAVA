import java.util.*;
public class FizzBuzz{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int size=sc.nextInt();
        System.out.println("Enter the number");
        int arr[]=new int[size];

     
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }

       for (int i=0;i<size;i++)
       {
        if (arr[i]%3==0 && arr[i]%5!=0) System.out.println("Fizz");
        else if (arr[i]%5==0 && arr[i]%3!=0) System.out.println("Buzz");
        else if(arr[i]%3==0 && arr[i]%5==0)System.out.println("FizzBuzz");
        else System.out.println(arr[i]);
       }
       sc.close();

    }
}
