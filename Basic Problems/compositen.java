import java.util.*;
public class compositen {
    public static void main(String[] args) {
        
     Scanner ar=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER :  ");
        int n=ar.nextInt();
        ar.close();
        int sum=0;

        for (int i=2;i<=n;i++)
       {
         int count=0;
         
        for (int j=1;j<=i;j++)
        {
            if (i%j==0)
            {
              count++;
            }
        }
         if (count !=2)
        {
            System.out.println(i);
            sum=sum+1;

        }

       }
      
            System.out.println("total composite numbers "+sum);
        }
}
