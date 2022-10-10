class Solution {
    public void reverseString(char[] s) {
        
        for(int i=0; i<s.length/2; i++){
            char temp = s[i];
            char temp1 = s[s.length-1-i];
            s[i] = temp1;
            s[s.length-1-i]=temp;
        }
       
       
    }
}