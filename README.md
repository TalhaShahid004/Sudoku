# Sudoku
This is a simple Suduko game made using Java. The user can linearly input numbers to solve the board. 

The program uses a 9x9 array-based board in which 0's represent empty cells. The userInput method then uses a nested loop to traverse the board and take number inputs for empty cells. 

I have added row, column, and box checker methods to verify the validity of numbers in each row, column, or box respectively. These methods return a boolean value indicating whether the sudoku puzzle is valid regarding the sudoku rules. 

Finally, the sudokuChecker method checks the entire puzzle for validity. It also returns a boolean value. 
