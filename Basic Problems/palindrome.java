import java.util.*;
public class palindrome 
{
    public static void main(String[] args) 
    {
        Scanner ar =new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int n=ar.nextInt();
        ar.close();
        int r=0,s=0,t=n;
        
        while(n>0)
        {
            r=n%10;
            s=r+(s*10);
            n=n/10;
        }
        if (t==s)
        {
             System.out.print("NO IS PALINDROME");

        }
        else{
                 System.out.print("NO IS NOT  PALINDROME");
        }

    
}
}
