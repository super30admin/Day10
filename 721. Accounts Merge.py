"""
https://leetcode.com/problems/accounts-merge/
"""


class Solution:
    def accountsMerge(self, accounts: List[List[str]]) -> List[List[str]]:
        def dfs(index, temp_res):
            nonlocal visited
            if index in visited:
                return
            visited.add(index)
            for email in accounts[index][1:]:
                temp_res.add(email)
                ##child
                children = hashmap[email]
                for child in children:
                    dfs(child, temp_res)

        result = []
        hashmap = {}
        visited = set()
        if len(accounts) == 1:
            return accounts
        for i, account in enumerate(accounts):
            emails = account[1:]
            for email in emails:
                if email in hashmap:
                    hashmap[email].append(i)
                else:
                    hashmap[email] = [i]
        for i, account in enumerate(accounts):
            ### for each index and temp_result we do dfs
            temp_result = set()
            dfs(i, temp_result)
            if temp_result:
                result.append([account[0]] + sorted(list(temp_result)))
        return result
