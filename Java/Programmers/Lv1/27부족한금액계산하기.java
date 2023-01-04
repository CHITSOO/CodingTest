class Solution {
    public long solution(int price, int money, int count) {
        long mon= (long)money;
        for(int i = 0; i < count; i++)
            mon -= price*(i+1);
        
        return mon >= 0 ? 0  : -mon;
    }
}