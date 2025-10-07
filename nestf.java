import java.lang.System;
import java.util.Scanner;

class nestf{
    public static void main(String args[])
    {
      

       for (int i=1;i<=3;i=i+1)
       {
        for (int j=1;j<=3;j=j+1)
        {
            System.out.println("neha");
        }
         
       }

        for (int i=1;i<=3;i=i+1)
       {
        for (int j=1;j<=3;j=j+1)
        {
            System.out.print("*");
        }
        
          System.out.println("");
       }


          for (int i=1;i<=3;i=i+1)
       {
        for (int j=1;j<=i;j=j+1)
        {
            System.out.print("*");
        }
        
         System.out.println("");
       }

    }

}