package CTCI;

import com.siyeh.ig.bugs.IteratorNextDoesNotThrowNoSuchElementExceptionInspection;

import java.util.Scanner;

/**
 * Created by rohanpansare on 2/4/2017.
 */
public class replaceSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(word);
        char[] reverse = replaceSpace(word.toCharArray(),16);
        for(char c : reverse){
            System.out.print(c);
        }
    }
    public static char[] replaceSpace(char [] word, int truelength){
        int countspaces = 0;
        int index;
        for(int i =0 ; i < truelength ; i++){
            if(word[i] == ' '){
                countspaces++;
            }
        }
        index = truelength + countspaces*2;
        if(truelength < word.length) word[truelength] = '\0';
        for(int i = truelength - 1; i >=0; i--){
            if(word[i] == ' '){
                word[index -1] = '0';
                word[index -2] = '2';
                word[index -3] = '%';
                index = index -3;
            }
            else {
                word[index - 1] = word[i];
                index--;
            }
        }
        return word;
    }
}
