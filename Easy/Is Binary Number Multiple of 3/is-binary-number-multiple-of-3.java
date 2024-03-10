//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out=new PrintWriter(System.out);
            int t = Integer.parseInt(in.readLine().trim());
            while(t-->0)
                {
                    String s = in.readLine().trim();
                    Solution ob = new Solution();
                    out.println(ob.isDivisible(s));
                }
                out.close();
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isDivisible(String s) {
        int n = s.length();
        int oddSum = 0;  
        int evenSum = 0; 

        for (int i = 0; i < n; i++) {
            char bit = s.charAt(i);
            
            if (bit == '1') {
                if ((n - i) % 2 == 0) {
                    evenSum++;
                } else {
                    oddSum++;
                }
            }
        }
        if (Math.abs(oddSum - evenSum) % 3 == 0) {
            return 1;
        } else {
            return 0; 
        }
        // code here
    }
}