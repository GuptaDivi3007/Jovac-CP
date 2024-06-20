class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean isOnePresent=false;

        for(int i=0;i<nums.length;i++){
            if(nums[i]<=0 || nums[i]>nums.length){
                nums[i]=1;
            }
            else if(nums[i]==1){
                isOnePresent=true;
            }
        }
        if(isOnePresent==false){
            return 1;
        }
        for(int i=0;i<nums.length;i++){
            int index=Math.abs(nums[i])-1;
            if(nums[index]>0){
                nums[index]*=-1;
            }
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans=i+1;
                break;
            }
        }
        if(ans==0){
            return nums.length+1;
        }
        else return ans;
    }
}
