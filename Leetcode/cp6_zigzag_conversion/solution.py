class Solution:
    def convert(self, s: str, numRows: int) -> str:
        # If number of rows is 1 then return the string as it is
        if numRows == 1:
            return s
        chars = list(s)
        m = len(chars)
        # Create a 2D matrix with all zeros and then update this matrix
        # in the zig zag manner where each integer in this matrix is an
        # index of the character in the chars list
        mat = [[0]*m for _ in range(numRows)]
        index = 1
        a = 0
        b = 0
        ans = ""
        while index <= m:
            # If row (a) is 0 then update the index numbers of characters in
            # the column for which the value of a is 0. 
            if a == 0:
                while a != numRows:
                    # Update the index in the 2D matrix only if the index is
                    # less than the length of characters. Note that, here the
                    # value of index starts from 1 but in the matrix the index
                    # will start from zero. So, later we will do index-1 to to
                    # get the actual character
                    if index <= m:
                        mat[a][b] = index
                        index += 1
                        a += 1
                        continue
                    break
                a -= 1
            # While a is not equal to 1 reduced the a by 1 and increase the b
            # by 1
            # break the loop when a is equal to 1 and then reduced a by 1 and
            # b by 1
            while a != 1:
                if index <= m:
                    b += 1
                    a -= 1
                    mat[a][b] = index
                    index += 1
                    continue
                break
            a -= 1
            b += 1
        for i in mat:
            for j in i:
                if j != 0:
                    ans += chars[j - 1]
        return ans
