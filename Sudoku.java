package sudoku;
import java.util.*;

public class Sudoku {
    public static void main(String[] args) {
        userInput();
        sudokuChecker();
    }

    private static int[][] board = 
         {{5, 3, 0, 0, 7, 0, 0, 0, 0},   
          {6, 0, 0, 1, 9, 5, 0, 0, 0},   
          {0, 9, 8, 0, 0, 0, 0, 6, 0},   
          {8, 0, 0, 0, 6, 0, 0, 0, 3},   
          {4, 0, 0, 8, 0, 3, 0, 0, 1},   
          {7, 0, 0, 0, 2, 0, 0, 0, 6},   
          {0, 6, 0, 0, 0, 0, 0, 0, 0},   
          {0, 0, 0, 4, 1, 9, 0, 0, 5},   
          {0, 0, 0, 0, 8, 0, 0, 7, 9}   
       };
    
    public static void printBoard(int[][] board){
        //allows to print board in a neater manner

        //prints vertical dividers
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 0){
                    if (j%3 == 0 && j != 0) {
                        System.out.print(" | ");
                        System.out.print(" _ ");
                    }else{
                        System.out.print(" _ ");
                    }
                }else{
                    if (j%3 == 0 && j != 0) {
                        System.out.print(" | ");
                        System.out.print(" " + board[i][j] + " ");
                    }else{
                        System.out.print(" " + board[i][j] + " ");
                    }
                }
            }
            //prints horizontal dividers
             if ((i+1)%3 == 0 && i != 0 && i != 8) {
                System.out.println("");
                System.out.println("---------------------------------");
            }else{
                System.out.println(""); 
             }
        }
        
        System.out.println("");
    }
    
     public static void userInput(){
        Scanner input = new Scanner(System.in);
        
        printBoard(board);
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 0){
                     System.out.print("What number from 1-9 would you like to input in row " + (i+1) + " and column " + (j+1) + ": ");
                     //Do input. while input not correct != true input checker
                     board[i][j] = input.nextInt();
            }
                printBoard(board);
            }
            rowChecker(i);
        }
    }
     
    public static boolean sudokuChecker(){ 
        boolean valid = false;
        int count = 0;

        for (int i = 0; i < 9; i++) {
            if (rowChecker(i) == true && columnChecker(i) == true && boxChecker(i) == true) {
                count++;
            }
        }
        
        if (count == 9) {
            valid = true;
            System.out.println("Your sudoku is valid!");
        }else{
            System.out.println("Invalid sudoku. Try again.");
        }
        
        return valid;
    }
    
    // returns true if valid
    public static boolean rowChecker(int a){ 
        boolean check = true; 

        //if board[i][j] is in the rest of board[i][j]
        for (int i = 0; i < 9 && check == true; i++) {
            for (int j = i+1; j < 9 && check == true; j++) {
                if (board[a][i] == board[a][j]) {
                    check = false;
                    break;
                }
            }
        }
        
        return check;        
    }
    
    public static boolean columnChecker(int a){
        boolean check = true; 

        //if board[i][j] is in the rest of board[i][j]
        for (int i = 0; i < 9  && check == true; i++) {
            for (int j = i+1; j < 9 && check == true; j++) {
                if (board[i][a] == board[j][a]) {
                    check = false; 
                }
            }
        }
        
        return check;        
    }
    
    public static boolean boxChecker(int a){
        boolean check = true;
        
        int count = 0;
        int[] tempArray = new int[9];
        int[][] coordinates = {{0,0},{0,3},{0,6},{3,0},{3,3},{3,6},{6,0},{6,3},{6,6}};
        
        int xPos = coordinates[a][0];
        int yPos = coordinates[a][1];
        
        for (int i = xPos; i < xPos+3; i++) {
            for (int j = yPos; j < yPos+3; j++) {
                tempArray[count] = board[i][j];
                count++;
            }
        }
        
        for (int i = 0; i < 9; i++) {
            for (int j = i+1; j < 9; j++) {
                if (tempArray[i] == tempArray[j]) {
                    check = false;
                    break;
                }
            }
        }
        
        return check;
    }
}

