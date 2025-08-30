import java.util.*;
public class factorial
{
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER THE NUMBER : ");
      int n=sc.nextInt();
      sc.close();
      int f=1;
      for (int i=1;i<=n;i++)
      {
        f=f*i;
      }
      System.out.println(f);
    }
    
}
