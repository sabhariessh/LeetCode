# Last updated: 15/07/2026, 12:03:44
class Solution:
    def getPermutation(self, n: int, k: int) -> str:
        numbers = [str(i) for i in range(1, n+1)]
        k -= 1
        result = []
        factorial_dict = {"0":1,"1": 1,"2": 2, "3": 6, "4": 24, "5": 120, "6": 720, "7": 5040, "8": 40320, "9": 362880}
        factorial = factorial_dict[str(n-1)]
        for i in range(n-1, -1, -1):
            idx = k // factorial
            result.append(numbers.pop(idx))
            k %= factorial
            if i > 0:
                factorial //= i
        return "".join(result)
