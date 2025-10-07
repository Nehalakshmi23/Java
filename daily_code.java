import java.util.Scanner;

public class daily_code{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.print((num%10)+(num%1000));
        
    }
}