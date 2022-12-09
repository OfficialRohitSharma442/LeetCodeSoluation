//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        // code here
        int counter = 1;
        for(int i=1; i<=n; i++){
            for(int j=n-i; j>0; j--){
                System.out.print(" ");
            }
            if(counter%2!=0){
            for(int k=1; k<=counter; k++){
                    System.out.print("*");
            }
            }
          counter = counter+2;
           
            System.out.println();
        }
    }
}