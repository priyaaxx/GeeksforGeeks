//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
        String word="";
        String str="";
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(ch!='.')
            {
                word=word+ch;
            }
            else
            {
                str=ch+word+str;
                word="";
            }
            if(i==S.length()-1)
            {
                str=word+str;
            }
            
        }
        return str;
        // code here 
    }
}