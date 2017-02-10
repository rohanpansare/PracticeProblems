import java.util.*;

class SumOfOddDivisors{


        static long countSum(int[] input) {
    int totalSum = 0;
    for (int inp : input) {
        int sum = 0;
        for (int i = 1; i <= inp; i += 2) {
            if (inp % i == 0) {
                sum += i;
            }
        }
        totalSum += sum;
    }
    return totalSum;
}

}