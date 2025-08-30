import java.util.*;
public class ARMstrongn 
{
     public static void main(String[] args) 
    {
        Scanner ar =new Scanner(System.in);
        System.out.print("ENTER THE NUMBER : ");
        int n=ar.nextInt();
        ar.close();
       

        for (int i=1;i<=n;i++)
        {   
           int r=0,s=0;
           int temp=i;
        while(temp>0)
        {
            r=temp%10;
            s=s+(r*r*r);
            temp=temp/10;
        }
        if (s==i)
        {
             System.out.println(i);

        }
    }
       
    }
    
}
