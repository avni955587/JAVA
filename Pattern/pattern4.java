//* * * 
// * *
//  *


import java.util.*;
public class pattern4 {
    public static void main(String[] args) {
        Scanner ar=new Scanner(System.in);
        int n=ar.nextInt();
        ar.close();

        for (int i=0;i<n;i++)
        {
            for (int j=0;j<n;j++)
           {
            if(i>j){
                 System.out.print(" ");
            }
            else{
                      System.out.print("* ");
            }
       
           }
           System.out.println();
        }
    }
}
