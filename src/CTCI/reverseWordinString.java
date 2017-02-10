package CTCI;

import java.util.Scanner;

/**
 * Created by rohanpansare on 2/4/2017.
 */
public class reverseWordinString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] inputs = in.nextLine().split(" ");
        StringBuffer sb = new StringBuffer();
        int count = inputs.length;
        for(String inp:inputs){
            StringBuffer tempSb = new StringBuffer(inp);
            if(inp != " "){
                sb.append(tempSb.reverse().toString());
            }	else{
                sb.append(tempSb.toString());
            }
            if(count != 0)
                sb.append(" ");
            count--;
        }
        String output = sb.toString();
        System.out.println(output);
    }
}
