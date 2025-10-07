import java.util.Scanner;

public class Arraysort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
       boolean sorted = true;
        for(int i=0;i<num -1;i++){
            if(arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("Yes");

        }
        else{
            System.out.println("NO");
        }
    }
}

