import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by rohanpansare on 2/9/2017.
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] findNums = {3,1,5,7,9,2,6};
        int[] nums = {1,2,3,5,6,7,9,11};
        int[] res = nextGreaterElement(findNums,nums);
        for(int i : res){
            System.out.print(i + " ");
        }
    }
    public static int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer,Integer> hm = new LinkedHashMap<>();
        int[] res = new int[findNums.length];
        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i],i);
        }
        for(int i = 0 ; i < findNums.length ; i++){
            if(hm.get(findNums[i]) == nums.length -1){
                res[i] = -1;
                continue;
            }
            for(int j = hm.get(findNums[i]) + 1 ; j < nums.length; j ++ ){
                if(nums[j] > findNums[i] ){
                    res[i] = nums[j];
                    break;
                }
                else{
                    res[i] = -1;
                }
            }
        }
        return res;
    }
}
