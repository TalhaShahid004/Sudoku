
<div align="center">

# Sudoku Game


</div>

This repository contains a simple Sudoku game implemented in Java. The game allows users to input numbers to solve a 9x9 Sudoku puzzle, with built-in validation checks for row, column, and box constraints.

![image](https://github.com/user-attachments/assets/005d4fe0-7d1a-40b2-972f-0d8c04ea3906)


## Features

*   **Interactive Input**: The game takes user input linearly to fill the Sudoku board.
*   **Array-Based Board**: The Sudoku board is implemented using a 2D array, with 0's representing empty cells.
*   **Row, Column, and Box Validation**: Includes methods to verify the validity of numbers in each row, column, and 3x3 box.
*   **Overall Sudoku Validation**: An overall checker method to validate if the entire Sudoku puzzle is valid according to the rules.
*   **Neat Board Printing**: Displays the board with vertical and horizontal dividers to enhance readability.


## Installation

1.  Clone the repository to your local machine:

    ```bash
    git clone https://github.com/TalhaShahid004/Sudoku.git
    ```

2.  Navigate to the cloned directory:

    ```bash
    cd Sudoku
    ```

## How to Run

1.  Compile the Java source file:

    ```bash
    javac Sudoku.java
    ```

2.  Run the compiled class file:

    ```bash
    java sudoku.Sudoku
    ```

    The program will prompt you to input numbers for each empty cell on the Sudoku board sequentially.

## Dependencies

*   **Java Development Kit (JDK)**: Required to compile and run the Java code.
*   **Scanner Class**: The `java.util.Scanner` class is used for user input.


