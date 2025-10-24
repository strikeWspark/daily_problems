/* Time: O(n) Space: O(1) */ 
class Day2 {
    public int maximumDifference(int[] nums) {
        int max = 0;
        int res = -1, premin = nums[0];
        for(int i =0;i<nums.length;i++){
            if(nums[i] > premin){
                res = Math.max(res, nums[i] - premin);
            }else{
                premin = nums[i];
            }
        }
        return res;
    }
   
}