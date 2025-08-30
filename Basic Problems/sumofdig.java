import java.util.*;
public class sumofdig 
{
    public static void main(String[] args) 
    {
        Scanner ar =new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int n=ar.nextInt();
        ar.close();
        int r=0,s=0;
        
        while(n>0)
        {
            r=n%10;
            s=s+r;
            n=n/10;
        }

        System.out.println(s);
    }
    
}