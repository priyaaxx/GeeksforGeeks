//{ Driver Code Starts
//Initial template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function template for Java

class Solution
{
    // public static void swap(int []arr ,int a , int b){
    //     int temp = arr[a] ; 
    //     arr[a] = arr[b] ;
    //     arr[b] = temp ;
    // }
    
    public static void sort012(int a[], int n)
    {
         
        
        // int l = 0 ; 
        // int r = n -1 ;
        // int i = 0 ;
        
        // while( i <= r){
            
        //     if(a[i] == 2){
                
        //         swap(a ,i , r);
        //         r--;
        //         i--;
        //     }
        //     else if(a[i] == 0 ){
                
        //         swap(a ,i , l);
        //         l++ ;
        //     }
            
        //     i++;
        // }
        Arrays.sort(a);
         
    }
}

//{ Driver Code Starts.

class GFG {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
        while(t-->0){
            int n = Integer.parseInt(br.readLine().trim());
            int arr[] = new int[n];
            String inputLine[] = br.readLine().trim().split(" ");
            for(int i=0; i<n; i++){
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            Solution ob=new Solution();
            ob.sort012(arr, n);
            StringBuffer str = new StringBuffer();
            for(int i=0; i<n; i++){
                str.append(arr[i]+" ");
            }
            System.out.println(str);
        }
    }
}


// } Driver Code Ends