import java.util.Scanner;
public class Replace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int max = -1;
        for(int i= num-1;i >=0;i--){
            if(arr[i] > max){
                int temp = max;
                max = arr[i];
                arr[i] = temp;
            }
            else{
                arr[i] = max;
            }
        }
        for(int i =0;i<num;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}