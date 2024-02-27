//{ Driver Code Starts
//Initial Template for Java
import java.util.stream.Collectors; 
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        Arrays.sort(arr);
        if(arr[n-1]!=arr[n-2])
        {
            return arr[n-2];
        }
        else
        {
            int i=3;
            for(int j=n-2;j>=0;j--)
            {
                if((n-i)>=0 && arr[j]!=arr[n-i])
                {
                    return arr[n-i];
                }
                i++;
            }
        }
        return -1;
        // code here
    }
}