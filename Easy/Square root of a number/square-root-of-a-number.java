//{ Driver Code Starts
import java.util.Scanner;

class SquartRoot
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			long a = sc.nextInt();
			Solution obj = new Solution();
			System.out.println(obj.floorSqrt(a));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete
this function*/

// Function to find square root
// x: element to find square root
class Solution
{
     long floorSqrt(long x)
	 {
		// Your code here
		long startVal = 1;
        long endVal = x;
        long target = 0;
        
        while (startVal <= endVal) {
            long midVal = (startVal + endVal) / 2;
            
            if (midVal * midVal == x) {
                return midVal;
            } else if (midVal * midVal > x) {
                endVal = midVal - 1;
            } else {
                startVal = midVal + 1;
                target = midVal;
            }
        }
        
        return target;
	 }
}
