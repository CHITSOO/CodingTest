import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int len = arr.length;
        for(int i = 0; i < len-1; i++){
            if(arr[i] != arr[i+1]) list.add(arr[i]);
        }
        if(arr[len-1] == arr[len-2]) list.add(arr[len-2]);
        else list.add(arr[len-1]);

        return list.stream().mapToInt(i->i).toArray();
    }
}
