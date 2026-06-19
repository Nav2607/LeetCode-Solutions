class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                if (i != j && nums[i] > nums[j]){
                    arr[i]++;
                }
            }
        }
        return arr;
    }
}