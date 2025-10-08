import java.util.*;

public class rotate{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of string");
        int num = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int wlen = sc.nextInt();
        String[] words = str.split(" ");

        int n = words.length;
        wlen = wlen % n;
        String[] rotate = new String[n];
        for(int i=0;i<n;i++){
            rotate[i] = words[((i-wlen+n)%n)];

        }
        for(int i=0;i<n;i++){
            System.out.print(rotate[i] + " ");
        }
       
    }
} 
/*import java.io.*;  
import java.util.*;  
public class rotate 
{  
public static void main(String[] args) throws java.lang.Exception   
{    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    int shift = sc.nextInt();
    shift = shift%n;
    String[] arr = s.split(" ");
    String[] rotated = new String[arr.length];
    
  if(shift==0){
        System.out.println(s);
        return;
    }
    if(s.length()==0){
        System.out.println("NULL");
        return;
    }
    int len = arr.length;
    for(int i =0; i<arr.length; i++){
        int newI = (i-shift+len)%len;
        rotated[newI]=arr[i];
    }
    for(String k: rotated){
        System.out.print(k+" ");
    } 
    
}  
}*//