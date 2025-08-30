import java.util.*;
public class searhindex 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array");
        int size =sc.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter the number");
        int num=sc.nextInt();
        for (int i=0;i<size;i++)
        {
            System.out.println("Enter the value: "+i+"=");
            arr[i] =sc.nextInt();
        }
        sc.close();
        for (int i=0;i<size;i++)
        {
            if(num==arr[i]) System.out.println(i);
        }
    }
}
