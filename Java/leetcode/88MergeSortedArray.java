class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //확인을 시작할 인덱스 : 최종적으로 확정이 된 위치의 다음 인덱스
        int startIdx = 0;

        //nums2를 돌면서 각 요소들의 위치를 nums1에 배정해준다. -> O(m*n)
        for(int i = 0; i < nums2.length; i++){
            int num2 = nums2[i];

            //num2가 배정이 되었는지 확인하는 불린값.
            boolean isFinish = false;

            int lastIdx = m + i;
            //startIdx부터 까지에 num2가 들어갈 자리가 있는지 확인
            for(int j = startIdx; j < lastIdx; j++){
                //num2가 nums1[j]보다 작으면 그 자리에 num2를 배정.
                if(num2 <= nums1[j]){
                    //num2가 들어갈 공간을 만들어주기 위해서 끝에서부터 하나씩 뒤로 이동시킨다.
                    for(int k = lastIdx; k > j; k--){
                        nums1[k] = nums1[k-1];
                    }
                    nums1[j] = num2;
                    //이제 j번 위치부터 비교하면 된다.
                    startIdx = j;
                    isFinish = true;
                    break;
                }
            }
            //num2의 위치가 아직 배정되지 않았으면 lastIdx에 배정하고, 이제 그 위치부터 비교하면 된다.
            if(!isFinish){
                nums1[lastIdx] = num2;
                startIdx = lastIdx;
            }
        }   
    }
}
