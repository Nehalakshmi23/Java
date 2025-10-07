import java.util.Scanner;

public class daily2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int split = sc.nextInt();
        
        System.out.print("The number of team in each team" + (num/split)+ "and left out"+(num%split));
        
    }
}