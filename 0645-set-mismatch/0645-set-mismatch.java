class Solution {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int duplicate=-1;
        int n= nums.length;
        int sum=(n*(n+1))/2;
        int sum2=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                duplicate = nums[i];
            } 
        }
      for(int i=0;i<nums.length;i++){
        sum2 += nums[i];
      }
      int missing = sum - sum2 + duplicate;

        return new int[]{duplicate,missing};
    }
}