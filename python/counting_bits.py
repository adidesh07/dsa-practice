from typing import List

def countBits(n: int) -> List[int]:
    nums = [0]

    if not n:
        return nums

    while True:
        temp = nums[::]
        for num in temp:
            nums.append(num+1)
            if len(nums) > n:
                return nums
