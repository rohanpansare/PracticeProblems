package CTCI;

import java.util.Scanner;

/**
 * Created by rohanpansare on 2/4/2017.
 */
public class PalindromePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if(checkPalindrome(sc.nextLine())){
            System.out.println("The string is a permutation of a palindrome");
        }
        else {
            System.out.println("The string is not a permutation of a palindrome");
        }
    }
    public static boolean checkPalindrome(String input){
        char [] res = input.toCharArray();
        int xor=0;
        for(int i = 0; i < res.length ; i++){
            xor = (xor ^ res[i]);
        }
        if(xor ==0 || ((xor >= 97) && (xor <= 122))){
            return true;
        }
        return false;
    }
}
