import java.util.*;
public class palindromen
{
     public static void main(String[] args) 
    {
        Scanner ar =new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int n=ar.nextInt();
        ar.close();
        int sum=0;
        for (int i=1;i<=n;i++)
        {
            int r=0,s=0,t=i;
        while(t>0)
        {
            r=t%10;
            s=r+(s*10);
            t=t/10;
        }

          

        if (s==i)
        {
             System.out.println(i);
             sum++;
        }
        
        } 
        System.out.print(sum);
             
}  
}
