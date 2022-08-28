/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xinyu
 * Date: 2022-08-23
 * Time: 21:56
 */
public class Test {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int count=0;
        while(i<nums.length){
            if(nums[i]==1){
                i++;
                count++;
            }
            if(nums[i]==0){
                count=0;
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
