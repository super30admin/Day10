"""
Brute Force: for each range check the number of vowels. TC: O(n^2) and SC: O(n)
Optimal: Use the prefix sum array, for a given index find the number of words that start and end with vowel till that
index. Then for a given query range (r, l): ans = prefix[l] - prefix[r-1], r-1 because we need to include the r as well.
TC: O(n) and SC: O(n)
"""
class Solution:
    def vowelStrings(self, words: List[str], queries: List[List[int]]) -> List[int]:
        n = len(words)
        words_ = [0 for _ in range(n)]
        prefix = [0 for _ in range(n)]
        vowels = ["a", "e", "i", "o", "u"]
        hset = set(vowels)

        ans = []
        for idx, word in enumerate(words):
            if word[0].lower() in hset and word[-1].lower() in hset:
                words_[idx] = 1

        prev = 0
        for idx, w in enumerate(words_):
            prefix[idx] = max(prev, prev + w)
            prev = prefix[idx]
        print(prefix)

        for q in queries:
            if q[0] == 0:
                count = prefix[q[1]]
            else:
                count = prefix[q[1]] - prefix[q[0] - 1]
            ans.append(count)

        return ans