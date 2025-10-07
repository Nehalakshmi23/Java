import java.util.Scanner;
import java.util.Arrays;
public class Largestelementarr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int len = sc.nextInt();

        int arr[] = new int[len];

        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
            }
            
        for(int i=0;i<len-1;i++){
            if(arr[i]>arr[i+1]){ 
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1]= temp;}
        }
        System.out.println(arr[len -1]);
    }
}