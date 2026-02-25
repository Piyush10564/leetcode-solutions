class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];

        int zeroCount = 0;
        int product = 1;

        // Calculate product of non-zero numbers & count zeros
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                product *= nums[i];
            }
        }

        for (int i = 0; i < n; i++) {

            // If more than 1 zero → all elements will be 0
            if (zeroCount > 1) {
                arr[i] = 0;
            }

            // If exactly 1 zero
            else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    arr[i] = product;
                } else {
                    arr[i] = 0;
                }
            }

            // If no zero → normal division
            else {
                arr[i] = product / nums[i];
            }
        }

        return arr;
    }
}