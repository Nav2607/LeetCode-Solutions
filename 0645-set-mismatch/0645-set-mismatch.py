class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        length = len(nums)
        check = [0] * (length+1)
        repeat, lost = 0, 0

        for num in nums:
            check[num] += 1
        
        for i in range(1, length+1):
            if check[i] == 2:
                repeat = i
            if check [i] == 0:
                lost = i
            
        return [repeat, lost]


      