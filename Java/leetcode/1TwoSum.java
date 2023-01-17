class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0, j=1;
        Outer : for(i = 0; i < nums.length -1; i++){
            for(j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                    break Outer;
                }
            }
        }
        return new int[] {i, j};
    }
}