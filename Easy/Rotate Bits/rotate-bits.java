//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int d = sc.nextInt();
            
            Solution ob = new Solution();
            
            ArrayList<Integer> res = ob.rotate (n, d);
            System.out.println(res.get(0));
            System.out.println(res.get(1));
            
           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    
    ArrayList<Integer> rotate(int N, int D)
    {
        // your code here
         ArrayList<Integer> result = new ArrayList<>();
        
        // Ensure D is in the range [0, 15] to handle 16-bit binary representation.
        D = D % 16;

        // Convert N to its binary representation as a 16-bit string.
        String binaryN = String.format("%16s", Integer.toBinaryString(N)).replace(' ', '0');

        // Perform the left rotation by shifting bits to the left.
        String rotatedLeft = binaryN.substring(D) + binaryN.substring(0, D);

        // Perform the right rotation by shifting bits to the right.
        String rotatedRight = binaryN.substring(16 - D) + binaryN.substring(0, 16 - D);

        // Convert the binary strings back to decimal integers.
        int leftRotation = Integer.parseInt(rotatedLeft, 2);
        int rightRotation = Integer.parseInt(rotatedRight, 2);

        result.add(leftRotation);
        result.add(rightRotation);

        return result;
    }
}