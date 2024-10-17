def twoArePositive(a, b, c):
    positive_count = sum(1 for x in [a, b, c] if x > 0)
    return positive_count == 2
pass