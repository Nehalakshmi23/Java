import java.util.Scanner;

public class daily3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        float a = (float)((x1+x2)/2);
        float b =(float)((y1+y2)/2);
        System.out.printf(a + "," +b);
        
    }
}