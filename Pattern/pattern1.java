// * 
// * *
// * * *
// * * * *    


import java.util.*;
public class pattern1 {
    public static void main(String[] args) {
        Scanner ar=new Scanner(System.in);
        int n=ar.nextInt();
        ar.close();

        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
           {
            System.out.print("* ");
           }
           System.out.println();
        }
    }
}
