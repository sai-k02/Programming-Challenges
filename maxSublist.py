"""
[-2,1,-3,4,-1,2,1,-5,4]
[1]
[5,4,-1,7,8]

6
1
23
"""
def maxSubArray(nums):
        if(len(nums) == 1):
            biggestSum = nums[0]
            return biggestSum
        
        # find the largest sum
        biggestSum = nums[0]
        
        for p1 in range(0, len(nums)):
            iterSum = nums[p1]
            if(p1 == len(nums)-1):
                if iterSum > biggestSum:
                    biggestSum = iterSum
            else:
                for p2 in range(p1+1, len(nums)):           
                    iterSum += nums[p2]
                    if iterSum > biggestSum:
                        biggestSum = iterSum
            
                    
                    
        return biggestSum   
                

def main():
    print(maxSubArray([-2,1,-3,4,-1,2,1,-5,4]
))


main()