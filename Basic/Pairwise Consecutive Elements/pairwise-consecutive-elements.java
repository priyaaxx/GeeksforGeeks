//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;

class elements
{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            Stack<Integer> st = new Stack<Integer>();
            int n = sc.nextInt();
            int temp = 0;
            for(int i = 0; i < n; i++)
            {
                temp = sc.nextInt();
                st.push(temp);
            }
            GFG gfg = new GFG();
            if(gfg.pairWiseConsecutive(st) == true)
            System.out.println("Yes");
            else
            System.out.println("No");
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

// your task is to complete the function
// function should return true/false or 1/0
class GFG
{
    // public static int peek()
    // {
    //     return 
    // }
    public static boolean pairWiseConsecutive(Stack<Integer> st)
    {
        
        // Your code here
       int l = st.size();
       if(l%2==0)
       {
            while(!st.empty())
            {
                int a = st.pop();
                if(a-1 == st.peek())
                {
                    int b = st.pop();
                }
                else
                {
                    return false;
                }
                
            }
       }
       else
       {
           st.pop();
           while(!st.empty())
            {
                int a = st.pop();
                if(a-1 == st.peek())
                {
                    int b = st.pop();
                }
                else
                {
                    return false;
                }
                
            }
       }
       return true;
      
	}
}