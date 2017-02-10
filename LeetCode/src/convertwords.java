import java.io.*;
import java.util.*;

public class convertwords {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Map<String,kNode> dict = new LinkedHashMap<String,kNode>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0){
            kNode k = new kNode();
            String engWord = in.next();
            k.word = in.next();
            k.weight = in.nextInt();
            dict.put(engWord,k);
        }

        int m = in.nextInt();

        List<kNode> listOfTransWords = new ArrayList<kNode>();
        while(m-->0){
            String inp = in.next();
            if(dict.containsKey(inp))
                listOfTransWords.add(dict.get(inp));
        }
        Collections.sort(listOfTransWords);
        for(kNode k:listOfTransWords){
            System.out.print(k.word + " ");
        }

    }

    static class kNode implements Comparable<kNode>{
        String word;
        int weight;

        public int compareTo(kNode e){
            return e.weight - this.weight;
        }
    }
}