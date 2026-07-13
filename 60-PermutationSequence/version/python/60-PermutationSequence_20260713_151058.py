# Last updated: 13/07/2026, 15:10:58
1class Solution:
2    def getPermutation(self, n: int, k: int) -> str:
3        numbers = [str(i) for i in range(1, n+1)]
4        k -= 1
5        result = []
6        factorial_dict = {"0":1,"1": 1,"2": 2, "3": 6, "4": 24, "5": 120, "6": 720, "7": 5040, "8": 40320, "9": 362880}
7        factorial = factorial_dict[str(n-1)]
8        for i in range(n-1, -1, -1):
9            idx = k // factorial
10            result.append(numbers.pop(idx))
11            k %= factorial
12            if i > 0:
13                factorial //= i
14        return "".join(result)
15