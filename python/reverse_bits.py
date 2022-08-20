def reverseBits(n: int) -> int:
    reversed_int = 0

    for i in range(32):
        temp = (n >> i) & 1
        reversed_int = reversed_int | (temp << (31-i))

    return reversed_int
