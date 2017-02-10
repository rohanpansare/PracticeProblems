import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * Introduction

A shop sells chocolates at a specified price per chocolate.

Each chocolate comes in 1 wrapper. You can exchange a specified number of wrappers for 1 new chocolate.

Tintimon wants to help his friends calculate how many chocolates each of them can get given how much money each has to spend on chocolates.

Wrappers cannot be transferred from one friend to another.

Help him write a program to calculate how many chocolates his friends can get.


Input Specifications

The first line contains N, the price per chocolate in dollars (0 < N < 1000)
The second line contains M, the number of wrappers that can be exchanged for a new chocolate (N < M < 1001)
The third line contains P, where P is the total number of friends (0 < P < 1000)
Then follows P lines of input, each containing Q, where Q is the amount of money that the friend has to spend on chocolates (0 < Q < 1,000,000)

Output Specifications

Based on the input, print out on P lines, the number of chocolates each friend can get. The ordering here should follow the order seen in the input.
 */
public class Chocolatefix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());
        int wrappers =Integer.parseInt(br.readLine());
        int friends = Integer.parseInt(br.readLine());
        int[] frarray = new int[friends];

        for(int i = 0; i < friends; i++){
            frarray[i] = Integer.parseInt(br.readLine());;
        }
        for(int i = 0; i < friends; i++){
            int tempWrapper = 0;
            int sum = 0;
            sum = sum + frarray[i] / price;
            tempWrapper = tempWrapper + frarray[i] / price;
            for(int j = 0; j < 100; j++){
                int temp = tempWrapper % wrappers;
                tempWrapper = tempWrapper / wrappers;
                sum = sum + tempWrapper;
                tempWrapper = tempWrapper + temp;
            }

            System.out.println(sum);
        }
    }
//    public static class Scanner {
//        BufferedReader br;
//        StringTokenizer st;
//
//        public Scanner(Reader in) {
//            br = new BufferedReader(in);
//        }
//
//        public Scanner() { this(new InputStreamReader(System.in)); }
//
//        String next() {
//            while (st == null || !st.hasMoreElements()) {
//                try {
//                    st = new StringTokenizer(br.readLine());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//            return st.nextToken();
//        }
//
//        int nextInt() { return Integer.parseInt(next()); }
//        long nextLong() { return Long.parseLong(next()); }
//        double nextDouble() { return Double.parseDouble(next()); }
//
//        // Slightly different from java.util.Scanner.nextLine(),
//        // which returns any remaining characters in current line,
//        // if any.
//        String readNextLine() {
//            String str = "";
//            try {
//                str = br.readLine();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            return str;
//        }
//    }
}