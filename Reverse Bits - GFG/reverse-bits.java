//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            Long X = Long.parseLong(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.reversedBits(X));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long reversedBits(Long X) {
        // code here
      String st = Long.toBinaryString(X);
      String ans =  String.format("%32s",st).replaceAll(" ","0");
      StringBuilder re = new StringBuilder(ans);
      re.reverse();
      String s =re.toString();
    long  l=  Long.parseLong(s,2);
      return l;
       
    }
};