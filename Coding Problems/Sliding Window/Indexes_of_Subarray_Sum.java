class Solution
{
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> list=new ArrayList<>();
        
        int curr_sum=0;
        int start=0;
        for(int end=0;end<n;end++){
            
            // growing phase
            curr_sum=curr_sum+arr[end];
            
            // shrinking phase
            while(curr_sum>s && start<end){
                curr_sum=curr_sum-arr[start];
                start++;
            }
            
            // checking phase
            if(curr_sum==s){
                list.add(start+1);
                list.add(end+1);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
}
