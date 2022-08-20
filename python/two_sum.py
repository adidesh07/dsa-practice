from typing import List

def twoSum(nums: List[int], target: int) -> List[int]:
    hmap = {}
    
    n = 0
    while n < len(nums):
        if not hmap.get(target-nums[n], "N") == "N":
            return [hmap.get(target-nums[n]), n]
        
        hmap[nums[n]] = n
        n+=1