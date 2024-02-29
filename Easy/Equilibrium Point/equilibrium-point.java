//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
   
    public static int equilibriumPoint(long arr[], int n) {
        int totalSum=0;
        for(int i=0;i<n;i++){
        //calculate total sum
        totalSum+=arr[i];
    }
    int leftSum=0;
    for(int i=0;i<n;i++){
        //update total sum by subtracting the current element
        totalSum-=arr[i];
        
        if(totalSum==leftSum){
            //return index if equilibrium point is found
            return i+1;
        }
        else{
            //upadtae left sum by adding the current element
            leftSum+=arr[i];
        }
    }
    //return -1 if equilibrium point is not found
    return -1;
        // Your code here
    }
}
