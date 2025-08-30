import java.util.*;
public class fibonacciseries 
{
    public static void main(String[] args) 
    {
        Scanner ar=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER :  ");
        int n=ar.nextInt();
        ar.close();

        int a=0,b=1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            
            int c = a + b; 
            a = b;            
            b = c;
        }
          System.out.println("gcgc");
    }
}
