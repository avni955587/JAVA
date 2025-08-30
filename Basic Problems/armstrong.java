import java.util.*;
public class armstrong 
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
            s=s+(r*r*r);
            n=n/10;
        }
        if (t==s)
        {
             System.out.print("NO IS ARMSTRONG");

        }
        else{
                 System.out.print("NO IS NOT  ARMSTRONG");
        }

       
    }
    
    
}
