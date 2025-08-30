import java.util.*;
public class factor 
{
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER THE NUMBER : ");
      int n=sc.nextInt();
      sc.close();
      int factor =0;
      for (int i=1;i<=n;i++)
      {
        if (n%i==0)
        {
            factor+=1;
        }
      }
      System.out.println(factor);
    }
}
