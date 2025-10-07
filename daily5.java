import java.util.Scanner;

public class daily5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Senior salary");
        int senior= sc.nextInt();
        System.out.println("Junior salary");
        int junior = sc.nextInt();
        float s = (senior*50)/100;
        float j = (junior*40)/100;
        float val = 6*s+ 5*j;
        System.out.printf("%.2f",val);

   
       
}}