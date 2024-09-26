"""
ALL THE FAULT LOCATIONS OF PARANTHESIS IF THE STRING HAS ALPHABETS
"""


class Solution:
    def minRemoveToMakeValid(self, s: str) -> str:
        stack = []  ###On coz of stack
        dictionary = {")": "(", "}": "{", "]": "["}
        rep = []
        flag = True
        # faults=[]
        for index, paranthesis in enumerate(s):
            if paranthesis in dictionary.values():
                stack.append((paranthesis, index))
            elif not paranthesis.isalpha() and stack and dictionary[paranthesis] == stack[-1][0]:
                stack.pop()
            else:
                if paranthesis.isalpha():
                    continue
                rep.append((index, paranthesis))
                flag = False
        if stack == [] and flag == True:
            print(flag)
        print("rep is", rep)
        print("stack is", stack)
        print(rep + stack)

"""
ALL THE FAULT LOCATIONS OF PARANTHESIS IF THE STRING DOES NOT HAVE ALPHABETS
"""
class Solution:
    def isValid(self, s: str) -> bool:
        """
        Tc: O(n)
        SC: O(n)
        """
        stack=[] ###On coz of stack
        dictionary={")":"(", "}":"{", "]":"["}
        rep=[]
        flag=True
        # faults=[]
        for index, paranthesis in enumerate(s):
            if paranthesis in dictionary.values():
                stack.append((paranthesis, index))
            elif stack and dictionary[paranthesis]==stack[-1][0]:
                stack.pop()
            else:
                # print("we here")
                rep.append((index, paranthesis))
                flag=False
        if stack==[] and flag==True:
            return flag
        print(rep+stack)
        return False
