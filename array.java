import java.util.Scanner;

public class array{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int len = sc.nextInt();

        int arr[] = new int[len];

        for(int i=0;i<len;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=len-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}