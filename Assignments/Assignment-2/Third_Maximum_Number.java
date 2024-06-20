class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>secondMax && nums[i]<max){
                secondMax=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=thirdMax && nums[i]<secondMax && nums[i]<max){
                thirdMax=nums[i];
            }
        }
        if(thirdMax==Long.MIN_VALUE){
            return (int)max;
        }
        return (int)thirdMax;
    }
}
