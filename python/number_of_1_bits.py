def hammingWeight(n: int) -> int:
    count = 0
    for item in bin(n)[2::]:
        count += int(item)
    
    return count