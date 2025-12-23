import java.util.Scanner;
public class CharBubb {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char[] arr = new char[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.next().charAt(0);

        }
        for(int i=0;i<num -1;i++){
            for(int j=0;j<num-1-i;j++){
                if(arr[j] > arr[j+1]){
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                                }
            }
        }
        for(char i: arr){
            System.out.print(i + " ");
        }
    }
}
