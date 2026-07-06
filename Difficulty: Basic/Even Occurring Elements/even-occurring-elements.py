class Solution:
    def findEvenOccurrences(self, arr):
        # code here
        from collections import Counter
        d =Counter(arr)
        even_arr= [key for key,val in d.items() if not val&1]
        return even_arr if len(even_arr) else [-1]


