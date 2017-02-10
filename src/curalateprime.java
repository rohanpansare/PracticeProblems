/**
 * Created by rohanpansare on 2/6/2017.
 */
import java.io.*;
import java.util.*;
public class curalateprime {


/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */


        public static void main(String[] args) {
            ArrayList<Integer> res = printPrimes(120);
            for(int i : res){
                System.out.println(i);
            }
        }
        public static ArrayList<Integer> printPrimes(int num){
            ArrayList<Integer> result = new ArrayList<>();

            for(int i=1 ; i <=num ; i++){
                if(isPrime(i)){
                    result.add(i);
                }
            }
            return result;
        }

        public static boolean isPrime(int i){
            int fact=0;
            int j = 1;
            while(j <= i){
                if(i%j == 0){
                    fact++;
                }
                j++;
            }
            return (fact ==2);
        }
    }
/*
Your previous Plain Text content is preserved below:

Write a function that returns all the prime numbers less than or equal to X?


public int[]arr =
 */

