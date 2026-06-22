class Solution:
    def findDisappearedNumbers(self, nums: List[int]) -> List[int]:
        ans = []
        for i in nums:
            nums[abs(i)-1] = -abs(nums[abs(i)-1])
        for j in range(len(nums)):
            if nums[j] > 0:
                ans.append(j+1)
        return ans
        