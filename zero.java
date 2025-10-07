import java.util.*;

public class zero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();

        }
        int count=0;
        for(int i=0;i<num;i++){
            if(arr[i]==0){
                count++;
            }

        }
        int index=0;
        for(int i=0;i<num;i++){
            if(arr[i]!=0){
                arr[index++] = arr[i];
            }
        }
    int n= num-count;
        for(int i=n;i<num;i++){
                arr[i] = 0;
        }
        System.out.print(Arrays.toString(arr));
        
    }
}