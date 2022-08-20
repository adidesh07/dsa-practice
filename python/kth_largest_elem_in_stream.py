from typing import List
import heapq

class KthLargest:
    def __init__(self, k: int, nums: List[int]):
        self.k = k
        self.nums = nums
        heapq.heapify(self.nums)
        while len(self.nums) > k:
            heapq.heappop(self.nums)

    def add(self, val: int) -> int:
        heapq.heappush(self.nums, val)

        if len(self.nums) > self.k:
            heapq.heappop(self.nums)
        
        return self.nums[0]


if __name__ == '__main__':
    a = KthLargest(3, [4, 5, 8, 2])
    print(a.add(3))
    print(a.add(5))
    print(a.add(10))
    print(a.add(9))
    print(a.add(4))
