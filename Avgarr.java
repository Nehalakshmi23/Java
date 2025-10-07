import java.util.Scanner;
public class Avgarr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        int sum=0;
        for(int i=0;i<num;i++){
            
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        float avg = (float)sum/num;
        System.out.print(avg);
    }
}