import java.util.ArrayList;

/**
 * Created by rohanpansare on 2/5/2017.
 */
public class Google {
    public static void main(String[] args) {
        System.out.println(solution(623315));
    }
    public static int solution(int X) {
        ArrayList<Integer> list = intToArr(X);
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size() - 1; i++) {
            ArrayList<Integer> list1 = new ArrayList<>(list);
            double a = list1.remove(i);
            double b = list1.remove(i);
            int res = (int) Math.ceil((a + b) / 2);
            list1.add(i, res);
            max = Integer.max(arrToInt(list1), max);
        }
        return max;
    }

    static ArrayList<Integer> intToArr(int x) {
        ArrayList<Integer> al = new ArrayList<>();
        while (x != 0) {
            int num = x % 10;
            al.add(0, num);
            x = x / 10;
        }
        return al;
    }

    static int arrToInt(ArrayList<Integer> al) {
        int number = 0;
        for (int i : al) {
            number = number * 10 + i;
        }
        return number;
    }
}
