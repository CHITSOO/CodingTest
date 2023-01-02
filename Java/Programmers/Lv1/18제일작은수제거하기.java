class Solution {
    public int[] solution(int[] arr) {
        if(arr.length <= 1) return new int[] {-1};

        int[] answer = new int[arr.length - 1];

        int minIdx = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                minIdx = i;
            }
        }
        System.arraycopy(arr, 0, answer, 0, minIdx);
        System.arraycopy(arr, minIdx + 1, answer, minIdx, arr.length - minIdx - 1);
        return answer;
    }
}
