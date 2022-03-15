class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # define our hashmap
        hashmap = {
            
        }

        # iterate through our nums
        for i, n in enumerate(nums):
            # define difference 
            difference = target - n 
            if(difference in hashmap):
                return [hashmap[difference],i]
            else:
                hashmap[n]=i