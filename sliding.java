import java.util.*;

public class sliding{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of array");
        int num = sc.nextInt();
        System.out.print("Enter"+num + "numbers");
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();

        }
       System.out.print("Size of the Sliding window");
       int slide = sc.nextInt();
       

       for(int i=0; i<=num-slide;i++){
        int MAX = Integer.MIN_VALUE;
        for(int j=i;j< i+slide;j++){
            if(arr[j] > MAX){
                MAX = arr[j];
            }
        }
        System.out.print(MAX + "");
       }
       sc.close();
    }
} 