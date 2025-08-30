import java.util.*;
public class sunofnnum 
{
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);
        int n=ar.nextInt();
        ar.close();
        int i , s=0;
        for (i=1;i<=n;i++)
        {
           s=s+i;
        }
        System.out.println(s);
    }
}
