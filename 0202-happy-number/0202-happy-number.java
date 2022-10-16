class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do{
           slow =  findsquir(slow);
            fast = findsquir(findsquir(fast));
        }while(slow!=fast);
        if(slow==1)
            return true;
        return false;
    }
    public static int findsquir(int n){
        int ans = 0;
        while(n!=0){
            int remander = n%10;
            ans += remander*remander;
            n = n/10;
        }
        return ans;
    }
}