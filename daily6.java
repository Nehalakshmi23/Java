import java.util.Scanner;

public class daily6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("amount");
        int w= sc.nextInt();
        System.out.println("rateofintrest");
        int x = sc.nextInt();
        System.out.println("years");
        int y = sc.nextInt();
        System.out.println("SI");
        float si = (w*x*y)/100;
        System.out.printf("%.2f",si);
          System.out.println();
        float a = si+w;
        System.out.printf("%.2f",a);
        float dis = (si*2)/100;
        System.out.println();
        System.out.printf("%.2f",dis);
          System.out.println();
        System.out.printf("%.2f",a-dis);
       
   
       
}}