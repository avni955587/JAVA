import java.util.*;
public class swapnowu3var 
{
    public static void main(String[] args) {
        Scanner ar=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER 1 :  ");
        int a=ar.nextInt();
        System.out.print("ENTER THE NUMBER 2 :  ");
        int b=ar.nextInt();
        ar.close();

        System.out.println("Before Swapping: a = " + a + ", b = " + b);


        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping: a = " + a + ", b = " + b);


    }
    
}
