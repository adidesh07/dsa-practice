from typing import List

def maxProfit(prices: List[int]) -> int:
    max_profit = 0
    
    m = 0
    n = 1
    while n < len(prices):
        if prices[n] < prices[m]:
            m = n
        else:
            max_profit = max(max_profit, prices[n] - prices[m])
        n += 1

    return maxProfit
