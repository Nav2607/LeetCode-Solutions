class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++){
            int counter = 0;
            for (int j = 0; j < len; j++){
                if (i != j && nums[i] > nums[j]){
                    counter++;
                }
            }
            arr[i] = counter;
        }

        return arr;
    }
}