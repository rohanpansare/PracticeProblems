package CTCI;

import com.intellij.openapi.vcs.history.VcsRevisionNumber;
import com.sun.jna.platform.win32.WinDef;

import java.util.*;

/**
 * Created by rohanpansare on 2/3/2017.
 */

//Do XOR for all the characters in both the strings which will finally return 0 if its a permutation.
public class CheckPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String f = sc.nextLine();
        String s = sc.nextLine();
        if(PermuationCheck(f ,s )) {
            System.out.println("Two strings are permutation of each other");
        }
        else
            System.out.println("Two strings are not permuations of each other");
    }
    public static boolean PermuationCheck(String first, String second ){
        if(first.length() != second.length()){
            return false;
        }
        Map<Character, Integer> hm1 = new HashMap<>();
        Map<Character, Integer> hm2 = new HashMap<>();
        for(int i = 0 ; i < first.length() ; i++){
            if(!hm1.containsKey(first.charAt(i))){
                hm1.put(first.charAt(i),1);
            }
            else
                hm1.put(first.charAt(i),hm1.get(first.charAt(i))+1);
        }
        for(int i = 0 ; i < second.length(); i++ ){
            if(!hm2.containsKey(second.charAt(i))){
                hm2.put(second.charAt(i),1);
            }
            else
                hm2.put(second.charAt(i),hm2.get(second.charAt(i))+1);
        }
        if(hm1.size() != hm2.size()){
            return false;
        }
        for(char c : hm1.keySet()){
            if(!hm2.containsKey(c) || hm1.get(c) != hm2.get(c)){
             return false;
            }
        }
        return true;
    }
}
