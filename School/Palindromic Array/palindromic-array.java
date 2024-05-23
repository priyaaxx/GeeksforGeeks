//{ Driver Code Starts
import java.util.*;
class PalindromicArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ;i < n; i++)
				a[i]=sc.nextInt();
			GfG g = new GfG();
			System.out.println(g.palinArray(a , n));
		}
	}
}
// } Driver Code Ends


/*Complete the Function below*/
class GfG
{
	public static int palinArray(int[] a, int n)
    {
        //add code here.
        for(int i=0;i<a.length;i++)
        {
            boolean pal = palindrome(a[i]);
            if(pal == false)
            {
                return 0;
            }
        }
        return 1;
        
    }
    public static boolean palindrome(int a)
    {
        String s = Integer.toString(a);
        String rev="";
        int l = s.length();
        for(int i=0;i<l;i++)
        {
            char ch = s.charAt(i);
            rev = ch + rev;
        }
        if(rev.equals(s))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}