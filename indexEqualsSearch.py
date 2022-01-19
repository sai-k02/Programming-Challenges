"""

Given a sorted array arr of distinct integers, write a function indexEqualsValueSearch that returns the lowest index i for which arr[i] == i. Return -1 if there is no such index. Analyze the time and space complexities of your solution and explain its correctness.
 
index_equals_value_search
Time Complexity: O(n)
Space Complexity: O(1)

index_equals_value_search_two
Time Complexity: O(n)
Space Complexity: O(1)

# index_equals_value_search_binary
Time Complexity: 0(log(n))
Space Complexity: O(1)
"""
def index_equals_value_search(arr):
  # define smallest value index
  smallest_value_index = -1
  
  # loop to find the smallest possible value index
  itr = 0
  while(True):
    if(arr[itr]<=0):
      itr += 1
    else:
      break
  
  # set the smallest value to itr
  smallest_value_index = itr
  
  # check to see if the value and the index is the same 
  if(smallest_value_index == arr[smallest_value_index]):
    return smallest_value_index
  else:
    return -1



 
def indexEqualsValueSearch(arr):
  # define preliminary pointers 
  start = 0
  end = len(arr)-1
  
  while (start <= end):
    mid=(start+end)//2
    
    if(arr[mid]-mid<0):
      start = mid+1
    # conditions for moving end
    elif (arr[mid] - mid == 0) and ((mid ==0) or (arr[mid-1] - (mid-1)<0) ):
        return  mid
    # conditions for printing/returning the val
    else:
      # move end
      end = mid -1
    
  return -1


