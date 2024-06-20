class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                if(i!=index){
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                }
            index++;
            }
        }
    }
}
