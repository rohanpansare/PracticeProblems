import java.util.Scanner;

/**
 * Created by rohanpansare on 1/31/2017.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        int[] arr = fibonacci(num);
//        for(int i : arr){
//            System.out.println(i);
//        }
        System.out.println("Test" + fibonaccirecursive(num));
    }



    public static int[] fibonacci(int num){
        int arr[] = new int[num];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2; i<arr.length;i++){
            arr[i] = arr[i-1] + arr[i-2];
    }
        return arr;
    }
    public static int fibonaccirecursive(int num){
        if(num ==0){
            return 0;
        }
        if(num ==1){
            return 1;
        }
        return fibonaccirecursive(num-1) + fibonaccirecursive(num-2);

    }
}
