class Solution {
    public int pivotIndex(int[] arr) {
        int sum = 0;
     for(int x:arr) sum+=x;
        int leftsum = 0;
        int rightsum = sum;
        for(int i=0; i<arr.length; i++){
            rightsum = rightsum-arr[i];
            if(leftsum==rightsum){
                return i;
            }
            leftsum+=arr[i];
        }
        return -1;
    }
}