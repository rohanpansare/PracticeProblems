package CTCI;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by rohanpansare on 2/9/2017.
 */
public class Anagrams {
    public static int numberNeeded(String first, String second) {
        Map<Character,Integer> hm = new HashMap<>();
        Map<Character,Integer> hm1 = new HashMap<>();
        char[] a = first.toCharArray();
        char[] b = second.toCharArray();
        int count = 0;
        for(int i = 0; i < a.length ; i++){
            if(hm.containsKey(a[i])){
                hm.put(a[i], hm.get(a[i]) + 1);
                continue;
            }
            hm.put(a[i],1);
        }
        for(int i = 0; i < b.length ; i++){
            if(!hm.containsKey(b[i]) && hm1.containsKey(b[i])){
                hm1.put(b[i], hm1.get(b[i]) + 1);
                continue;
            }
            else if(hm.containsKey(b[i])){
                hm.put(b[i], hm.get(b[i]) - 1);
                continue;
            }
            hm1.put(b[i],1);
        }
        for(Character c : hm.keySet() ){

            count = count + Math.abs(hm.get(c)) ;
        }
        for(Character d : hm1.keySet() ) {
            count = count + hm1.get(d);
        }

            return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
