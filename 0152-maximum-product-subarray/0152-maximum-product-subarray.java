class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
         max=Math.max(nums[i],max*nums[i]);
         min=Math.min(nums[i],min*nums[i]);
         result=Math.max(max,result);
           
          
        }
        return result;
    }
}