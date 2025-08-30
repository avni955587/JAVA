import java.util.*;
public class swap 
{
     public static void main(String[] args) {
        Scanner ar=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER 1 :  ");  //5
        int a=ar.nextInt();
        System.out.print("ENTER THE NUMBER 2 :  "); //3
        int b=ar.nextInt();
        ar.close();

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        a=a+b; // 5+3==8
        b=a-b; //8-3==5
        a=a-b; //8-5==3

         System.out.println("After Swapping: a = " + a + ", b = " + b);

     }

    
}
