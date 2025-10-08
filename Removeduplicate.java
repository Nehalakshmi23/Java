import java.util.Scanner;
import java.util.Arrays;
public class Removeduplicate{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if(num==1){
            System.out.println(arr);
        }
        if(arr[0] != arr[1]){
            System.out.print(arr[0] + " ");
        }

        for(int i=1;i<num;i++){
            if(arr[i]!=arr[i-1]){
                System.out.print(arr[i] + " ");
            }

        }
        if(arr[num-1] != arr[num-1]){
            System.out.print(arr[num-1]);
        }

    }
}