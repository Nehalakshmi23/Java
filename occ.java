import java.util.*;
public class occ{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int [] arr = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int count =1;
        Arrays.sort(arr);
        for(int i=0;i<num -1;i++){
           if(arr[i] == arr[i+1]){
                    count++;
                }
            else{
                System.out.println(arr[i] + "-"+ count);
                count=1;
            }
                
            }
            System.out.println((num -1) +" - "+ count);
        }
        
        
    }
