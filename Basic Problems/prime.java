import java.util.Scanner;
public class prime 
{
    public static void main(String[] args) 
    {
        Scanner ar=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER :  ");
        int n=ar.nextInt();
        ar.close();
        int count=0;
        
        for (int i=1;i<=n;i++)
        {
            if (n%i==0)
            {
              count++;
            }
        }
        
        if (count==2)
        {
            System.out.println("PRIME");

        }
        else{
            System.out.println("NOT PRIME");
        }
    }
    
}
