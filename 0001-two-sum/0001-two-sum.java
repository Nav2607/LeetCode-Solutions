class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                if (nums[i] + nums[j] == target && i != j) {
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }

        return indices;
    }
}