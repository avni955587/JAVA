import java.util.*;
public class leapyera 
{
    public static void main(String[] args) 
    {
        Scanner ar=new Scanner(System.in);
        int year =ar.nextInt();
        ar.close();

        if ((year%4==0 && year%100!=0)|| year%400==0)
        {
          System.out.println("LEAP YEAR");
        }
        else{
            System.out.println("NOT ");
        }
    }
    
}


