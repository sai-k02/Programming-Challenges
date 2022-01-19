import heapq
"""

Given an array of integers arr where each element is at most k places away from its sorted position, code an efficient function sortKMessedArray that sorts arr. For instance, for an input array of size 10 and k = 2, an element belonging to index 6 in the sorted array will be located at either index 4, 5, 6, 7 or 8 in the input array.

Analyze the time and space complexities of your solution.

input:  arr = [1, 4, 5, 2, 3, 7, 8, 6, 10, 9], k = 2

output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

"""

# this solution is using heapq/priorityque
# time complexity O(n log n)
# space complexity O(1)
def sort_k_messed_array(arr, k):
  tempArr = arr[0:k]
  heapq.heapify(tempArr)
  index = 0
  while(index+k < len(arr)):
    heapq.heappush(tempArr, arr[index+k])
    arr[index] = heapq.heappop(tempArr)
    index += 1
    
  while(len(tempArr) > 0):
    arr[index] = heapq.heappop(tempArr)
    index+=1

  return arr
     
  
arr = sort_k_messed_array([1, 4, 5, 2, 3, 7, 8, 6, 10, 9], 2)
print(arr)