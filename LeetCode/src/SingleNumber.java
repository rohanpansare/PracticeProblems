/**
 * Created by rohanpansare on 2/3/2017.
 */
public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0 ; i < nums.length ; i++){
            result = result ^ nums[i];
        }
        return result;
    }
}
