class Solution {
    public int lengthOfLongestSubstring(String s) {
        int []arr=new int[256];
        int start=0;
        int end=0;
        int maxWindow=0;

        while(end<s.length()){

            // grow
            int index=s.charAt(end);
            arr[index]++;

            // shrink
            while(arr[index]==2){
                int r_index=s.charAt(start);
                arr[r_index]--;
                start++;
            }

            // task
            int curr_size=end-start+1;
            maxWindow=Math.max(curr_size,maxWindow);

            end++;
        }
        return maxWindow;
    }
}
