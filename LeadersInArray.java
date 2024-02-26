class LeadersInArray{
    //Function to find the leaders in the array.
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> list = new ArrayList <>();
        int max= arr[n-1];
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]>=max)
            {
                list.add(arr[i]);
            }
            max=Math.max(max, arr[i]);
        }
        Collections.reverse(list);
        return list;
        // Your code here
    }
}
