package CTCI;

import java.util.Scanner;

/**
 * Created by rohanpansare on 2/4/2017.
 */
public class OneAway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.nextLine();
        String second = sc.nextLine();
        //Need to write checks for 3 operations : Replace, Insert and delete.
        if(first.length() == second.length()){
            System.out.println(replaceTest(first,second));
        }
        else {
            if (first.length() - 1 == second.length()) {
                System.out.println(insertdeleteTest(second, first));
            } else if (first.length() + 1 == second.length()) {
                System.out.println(insertdeleteTest(first, second));
            }
        }
    }
    public static boolean replaceTest(String first, String second) {
        boolean flag = false;
        int i =0;
        for(i = 0 ; i < first.length() ; i++){
            if(first.charAt(i) != second.charAt(i)){
                if(flag){
                    return false;
                }
                flag = true;
            }
        }
        return true;
    }
    public static boolean insertdeleteTest(String first, String second){
        int index1 , index2;
        index1 =0 ; index2 =0 ;
        while(index1 < first.length() && index2<second.length()){
            if(first.charAt(index1) != second.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                else
                    index2++;
            }
            else{
                index1++;
                index2++;
            }
        }
        return true;
    }
}
