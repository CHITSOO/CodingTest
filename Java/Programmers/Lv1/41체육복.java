import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int lost_num = lost.length; //옷이 없는 애들 수.

        Map<Integer, Boolean> map = new HashMap<>();
        for(int k : reserve){
            map.put(k, true);
        }

        Arrays.sort(lost);
        List<Integer> list = new ArrayList<>(); 
        for(int i = 0; i < lost.length; i++){
            int k = lost[i];
            if(map.containsKey(k)){
                map.remove(k); //이제 여분이 없으므로 map에서 remove.
                lost_num--; //옷이 생겼으니 안 잃어버린것!
            } else {
                list.add(k); //아직 옷이 없는 애들..
            }
        }

        for(int i = 0; i < list.size(); i++){
            int k = list.get(i);
            if(map.containsKey(k-1)){ //앞뒤애들중에 여벌이 있으면
                map.remove(k-1);
                lost_num--;
            } else if(map.containsKey(k+1)){
                map.remove(k+1);
                lost_num--;
            }
        }

        return n - lost_num;
    }
}