import java.util.Scanner;
import java.util.Arrays;
public class Removedupliarr{
public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int[] arr = new int[num];
    for(int i=0;i<num;i++){
        arr[i] = sc.nextInt();
        }
    Arrays.sort(arr);
    for(int i=0;i<num-1;i++){
        if(arr[i] != arr[i+1]){
            System.out.print(arr[i] + " ");
        }
    }
    System.out.print(arr[num-1]);
    }
}