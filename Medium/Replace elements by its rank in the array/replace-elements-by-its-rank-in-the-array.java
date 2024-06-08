//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    while (T-- > 0) {
      int n = sc.nextInt();
      int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
      }
      Solution obj = new Solution();
      int ans[] = obj.replaceWithRank(a,n);
      for(int e : ans)
      System.out.print(e+" ");
      System.out.println();
    }
  }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
     // code here

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<N;i++)
        {
            pq.add(arr[i]);
        }
        
       HashMap<Integer, Integer> map = new HashMap<>();
       int rank = 0;
       int prev = -1;
       while(!pq.isEmpty())
       {
           int el = pq.poll();
           if(prev!=el)
           {
               rank++;
               map.put(el, rank);
               prev = el;
           }
           else
           {
               map.put(el, rank);
           }
       }
       for(int i=0;i<N;i++)
       {
           arr[i] = map.get(arr[i]);
       }
       return arr;
  }
}
     