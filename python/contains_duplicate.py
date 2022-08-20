from typing import List

def containsDuplicate(nums: List[int]) -> bool:
    return not len(nums) == len(set(nums))
