class Solution {
    public boolean containsDuplicate(int[] nums) {
        //정렬 후. O(nlogn)
        Arrays.sort(nums);

        //하나씩 돌면서 이전과 같으면 true반환. O(n)
        int p = nums[0];
        for(int i = 1; i < nums.length; i++){ 
            if(p == nums[i]) return true;
            else p = nums[i];
        }
        //끝까지 돌았는데 같은 값이 없으면 false 반환
        return false;
    }
}