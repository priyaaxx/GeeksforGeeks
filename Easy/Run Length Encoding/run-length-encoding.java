//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            String s;
            s = br.readLine();
            
            Solution obj = new Solution();
            String res = obj.encode(s);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String encode(String s) {
        StringBuilder sb = new StringBuilder();
        char lastChar = s.charAt(0);
        int count = 1;
        if(s.length() == 1) {
            sb.append(lastChar);
            sb.append(count);
            return sb.toString();
        }
        for(int i=1;i<s.length();i++) {
            if(s.charAt(i) != lastChar) {
                sb.append(lastChar);
                sb.append(count);
                lastChar = s.charAt(i);
                count = 1;
            } else {
                count++;
            }
            if(i == s.length() - 1) {
                sb.append(lastChar);
                sb.append(count);
            }
        }
        return sb.toString();
        // code here
    }
}
    