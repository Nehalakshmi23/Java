import java.util.HashMap;
public class Hash {
    public static void main(String[] args){
        String text = "apple orange banana apple apple orange banana";
        String[] words = text.split(" ");
        HashMap<String,Integer> wordcount = new HashMap<>();
        for(String word: words){
            int count = wordcount.getOrDefault(word,0);
            wordcount.put(word,++count);
        }
        System.out.println(wordcount);
    }
}
