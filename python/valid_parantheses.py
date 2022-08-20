def isValid(s: str) -> bool:
    start = {'(': ')', '{': '}', '[': ']'}
    lastSymb = []

    for char in s:
        if char in start:
            lastSymb.append(start[char])
        else:
            if not lastSymb or not lastSymb[-1] == char:
                return False

            lastSymb.pop()

    return not lastSymb
