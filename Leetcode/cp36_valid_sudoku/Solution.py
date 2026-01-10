class Solution:
    # Leetcode Problem: https://leetcode.com/problems/valid-sudoku/description/
    #
    # Time complexity: O(1) since the input length is always fixed
    # Space complexity: O(1)
    def is_each_row_valid(self, board: [list[list[str]]]) -> bool:
        for row in board:
            if not self.is_valid_unit(row):
                return False
        return True
    
    def is_each_col_valid(self, board: [list[list[str]]]) -> bool:
        for col in zip(*board):
            if not self.is_valid_unit(col):
                return False
        return True
    
    def is_each_square_valid(self, board: [list[list[str]]]) -> bool:
        for i in (0, 3, 6):
            for j in (0, 3, 6):
                square = [
                    board[x][y]
                    for x in range(i, i + 3) for y in range(j, j + 3)
                ]
                if not self.is_valid_unit(square):
                    return False
        return True
    
    def is_valid_unit(self, unit: list[str]) -> bool:
        nums = [num for num in unit if num != "."]
        return len(set(nums)) == len(nums)

    def isValidSudoku(self, board: list[list[str]]) -> bool:
        return (
            self.is_each_row_valid(board) and 
            self.is_each_col_valid(board) and 
            self.is_each_square_valid(board)
        )
