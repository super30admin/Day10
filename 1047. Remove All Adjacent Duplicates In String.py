class Solution:
    def removeDuplicates(self, s: str) -> str:
        string = []
        for c in s:  ## †ime O(length of string)
            ##if last character in string was c; it was duplicate
            if string and string[-1] == c:
                string.pop()
            else:
                string.append(c)  ###time O(length of string), Space i(len of string-number of duplicates)
        ###the output needs be a string
        return "".join(string)