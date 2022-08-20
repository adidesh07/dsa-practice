from typing import List
import heapq

def lastStoneWeight(stones: List[int]) -> int:
    stones = [-n for n in stones]
    heapq.heapify(stones)

    while len(stones) > 1:
        st1 = heapq.heappop(stones)
        st2 = heapq.heappop(stones)

        if st1 < st2:
            heapq.heappush(stones, st1 - st2)

    if stones:
        return -stones[0]
    return 0
