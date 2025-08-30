import java.util.*;
public class oddjava
{
    public static void main(String[] args)
    {
      Scanner ar=new Scanner(System.in);
      System.out.println("ENTER THE NUMBER : ");
      int n=ar.nextInt();
      ar.close();
      for (int i = 1;i<=n;i++)
      {
        if (i%2 !=0)
        {
          System.out.println(i);
        }
      }
        
    }
}