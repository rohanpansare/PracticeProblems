import java.util.Scanner;

/**
 * Created by rohanpansare on 1/26/2017.
 */
public class HammingDistance {
    public static int hammingDistance(int x, int y) {
       byte[] a;
       byte[] b;
       int count= 0;
       a = toBinary(x);
       b = toBinary(y);
       for(int i = 0 ; i < a.length;i++){
           if(a[i] != b[i]){
               count++;
           }
       }
       return count;
    }
    public static byte[] toBinary(int number) {
        byte[] binary = new byte[32];
        int index = 0; int copyOfInput = number;
        while (copyOfInput > 0) { binary[index++] = (byte) (copyOfInput % 2);
        copyOfInput = copyOfInput / 2; }
        return binary; }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(hammingDistance(x,y));
    }
}
