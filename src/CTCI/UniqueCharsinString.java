package CTCI;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by rohanpansare on 2/3/2017.
 */
public class UniqueCharsinString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if(uniqueChars(s)) {
            System.out.println("String contains unique characters");
        }
        else
            System.out.println("String does not contains unique characters");
    }
    public static boolean uniqueChars(String input){
        Set<Character> hs = new HashSet<>();
        char[] chars = input.toCharArray();
        for(char i : chars){
            if(!hs.contains(i)){
                hs.add(i);
            }
            else{
                return false;
            }
        }
        return true;
    }
}
