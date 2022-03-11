import java.util.InputMismatchException;
import java.util.Scanner;

	public class Midterm {

	    public static void main(String[] args) {
	        Scanner play= new Scanner(System.in);
	        System.out.println("Main Menu");
	        System.out.println("TicTacToe Classic: Press 1 ");
	        System.out.println("TicTacToe 4x4: press 2");
	        System.out.println("To view replays, press 3");
	        System.out.println("to change the theme press 4");
	        int decision = play.nextInt();
		 while(decision > 4|| decision <1) {
	        	System.out.println("Please choose another option:");
	        	System.out.println("TicTacToe Classic: Press 1 ");
		        System.out.println("TicTacToe 4x4: press 2");
		        System.out.println("To view replays, press 3");
		        System.out.println("to change the theme press 4");
		        decision= play.nextInt();
	        }
	        if( decision == 1) {

	            char [] [] classicGameBoard = {{' ', '|', ' ', '|', ' '},
	                    {'-', '+', '-', '+', '-'},
	                    {' ', '|', ' ', '|', ' '},
	                    {'-', '+', '-', '+', '-'},
	                    {' ', '|', ' ', '|', ' '}};

	            newBoard(classicGameBoard);

	            int turn= 0;		
	            char symbol = ' ';
	            try {
	                System.out.println("Please enter a number 1-9");
	                while(checkWinner(classicGameBoard) ==false)	{	
	                    int player= play.nextInt();
	                    moveMaker(classicGameBoard,player, symbol, turn);
	                    turn++;
	                }}
	            catch(IllegalArgumentException e){
	                System.out.println("Number format was Invalid");

	            }

	            catch(Exception e) {
	                System.out.println("error occured");
	            }
	        }
	        else if (decision == 2){
	            char [][] gameBoardPlus = {{' ', '|', ' ', '|', ' ', '|', ' '},
	                    {'-', '+', '-', '+', '-', '+', '-'},
	                    {' ', '|', ' ', '|', ' ', '|', ' '},
	                    {'-', '+', '-', '+', '-', '+', '-'},
	                    {' ', '|', ' ', '|', ' ', '|', ' '},
	                    {'-', '+', '-', '+', '-', '+', '-'},
	                    {' ', '|', ' ', '|', ' ', '|', ' '}};
	            newBoardPlus(gameBoardPlus);	
	            int turn = 0;
	            char symbol = ' ';
	            try {
	                while(checkWinnerPlus(gameBoardPlus) == false) {
	                    int player = play.nextInt();
	                    moveMakerPlus(gameBoardPlus, player, symbol, turn);
	                    turn++;
	                }}
	            catch(InputMismatchException e) {
	                System.out.println("Please renter a number");
	            }

	        }
	    }

	    public static void newBoard(char[][] classicGameBoard) {
	        for (char[] row : classicGameBoard) {
	            for(char c : row ) {
	                System.out.print(c);
	            }
	            System.out.println();
	        }

	    }

	    public static void moveMaker(char[][] gameBoard,int placement, char symbol, int turn) {
	        if(turn == 0|| turn == 2|| turn == 4||turn ==6||turn == 8) {
	            symbol='X';

	        }
	        if (turn==1|| turn==3||turn==5|| turn==7){
	            symbol='O';
	        }
	        if(turn==9) {
	            System.out.println("Game ended in a tie");
	            System.exit(1);
	        }

	        switch(placement) {
	            case 1:
	                gameBoard[0][0] = symbol;
	                newBoard(gameBoard);
	                break;
	            case 2:
	                gameBoard[0][2] = symbol;
	                newBoard(gameBoard);
	                break;
	            case 3:
	                gameBoard[0][4] = symbol;
	                newBoard(gameBoard);
	                break;
	            case 4:
	                gameBoard[2][0] = symbol;
	                newBoard(gameBoard);
	                break;
	            case 5:
	                gameBoard[2][2] = symbol;
	                newBoard(gameBoard);
	                break;
	            case 6:
	                gameBoard[2][4] = symbol;
	                newBoard(gameBoard);
	                break;
	            case 7:
	                gameBoard[4][0] = symbol;
	                newBoard(gameBoard);
	                break;
	            case 8:
	                gameBoard[4][2] = symbol;
	                newBoard(gameBoard);
	                break;
	            case 9:
	                gameBoard[4][4] = symbol;
	                newBoard(gameBoard);
	                break;
	        }

	        
	    }
	    public static boolean checkWinner(char[][] gameBoard) {
	        if(gameBoard[0][0]=='X' && gameBoard[0][2]=='X' && gameBoard[0][4]=='X') {
	            System.out.println("Player 1 Wins!!!");
	            return true;
	        }
	        if(gameBoard[0][0]=='O' && gameBoard[0][2]=='O' && gameBoard[0][4]=='O') {
	            System.out.println("Player 2 Wins!!!");
	            return true;
	        }
	        if(gameBoard[0][0]=='X' && gameBoard[2][0]=='X' && gameBoard[4][0]=='X') {
	            System.out.println("Player 1 Wins!!!");
	            return true;
	        }
	        if(gameBoard[0][0]=='O' && gameBoard[2][0]=='O' && gameBoard[4][0]=='O') {
	            System.out.println("Player 2 Wins!!!");
	            return true;
	        }
	        if(gameBoard[0][0]=='X' && gameBoard[2][4]=='X' && gameBoard[4][4]=='X') {
	            System.out.println("Player 1 Wins!!!");
	            return true;
	        }
	        if(gameBoard[0][0]=='O' && gameBoard[2][4]=='O' && gameBoard[4][4]=='O') {
	            System.out.println("Player 2 Wins!!!");
	            return true;
	        }

	        if(gameBoard[2][0]=='X' && gameBoard[2][2]=='X'&& gameBoard[2][4]=='X'){
	            System.out.println("Player 1 Wins!!!");
	            return true;
	        }
	        if(gameBoard[2][0]=='O' && gameBoard[2][2]=='O'&& gameBoard[2][4]=='O'){
	            System.out.println("Player 2 Wins!!!");
	            return true;
	        }

	        if(gameBoard[4][0]=='X' && gameBoard[2][2]=='X' && gameBoard[0][4]=='X') {
	            System.out.println("Player 1 wins!!!");
	            return true;
	        }
	        if(gameBoard[4][0]=='O' && gameBoard[2][2]=='O' && gameBoard[0][4]=='O') {
	            System.out.println("Player 2 Wins!!!");
	            return true;
	        }
	        if(gameBoard[4][0]=='X' && gameBoard[4][2]=='X' && gameBoard[4][4]=='X') {
	            System.out.println("Player 1 Wins!!!");
	            return true;
	        }
	        if(gameBoard[4][0]=='O' && gameBoard[4][2]=='O' && gameBoard[4][4]=='O') {
	            System.out.println("Player 2 Wins!!!");
	            return true;
	        }
	        if(gameBoard[0][4]=='X' && gameBoard[2][4]=='X' && gameBoard[4][4]=='X') {
	            System.out.println("Player 1 Wins!!!");
	            return true;
	        }
	        if(gameBoard[0][4]=='O' && gameBoard[2][4]=='O' && gameBoard[4][4]=='O') {
	            System.out.println("Player 2 Wins!!!");
	            return true;
	        }
	        else
	            return false;

	    }

	    public static void newBoardPlus(char[][] gameBoardPlus) {
	        for (char[] row : gameBoardPlus) {
	            for(char c : row ) {
	                System.out.print(c);
	            }
	            System.out.println();
	        }
	    }

	    public static void moveMakerPlus(char[][] gameBoardPlus,int placement1, char symbol, int turn) {
	        
	        if(turn == 0|| turn == 2|| turn == 4||turn ==6||turn == 8|| turn == 10 || turn == 12 || turn == 14 || turn == 16) {
	            symbol='X';
	        }
	        if(turn == 1|| turn == 3|| turn == 5||turn ==7 || turn == 9 || turn == 11 || turn == 13 || turn == 15){
	            symbol='O';
	        }

	        switch(placement1) {
	            case 1:
	                gameBoardPlus[0][0] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 2:
	                gameBoardPlus[0][2] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 3:
	                gameBoardPlus[0][4] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 4:
	                gameBoardPlus[0][6] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 5:
	                gameBoardPlus[2][0] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 6:
	                gameBoardPlus[2][2] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 7:
	                gameBoardPlus[2][4] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 8:
	                gameBoardPlus[2][6] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 9:
	                gameBoardPlus[4][0] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 10:
	                gameBoardPlus[4][2] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 11:
	                gameBoardPlus[4][4] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 12:
	                gameBoardPlus[4][6] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 13:
	                gameBoardPlus[6][0] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 14:
	                gameBoardPlus[6][2] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 15:
	                gameBoardPlus[6][4] = symbol;
	                newBoard(gameBoardPlus);
	                break;
	            case 16:
	                gameBoardPlus[6][6] = symbol;
	                newBoard(gameBoardPlus);
	                break;

	        }
	    }

	    public static boolean checkWinnerPlus(char[][] gameBoardPlus) {
	        if(gameBoardPlus[0][0]=='X' && gameBoardPlus[0][2]=='X' && gameBoardPlus[0][4]=='X' && gameBoardPlus[0][6]== 'X') {
	            System.out.println("Player 1 wins!!!");
	            return true;
	        }
	        if(gameBoardPlus[0][0]=='O' && gameBoardPlus[0][2]=='O' && gameBoardPlus[0][4]=='O'&& gameBoardPlus[0][6] == 'O') {
	            System.out.println("Player 2 wins!!!");
	            return true;
	        }
	         if(gameBoardPlus[2][0]=='X' && gameBoardPlus[2][2]=='X' && gameBoardPlus[2][4]=='X' && gameBoardPlus[2][6]== 'X') {
	            System.out.println("Player 1 wins!!!");
	            return true;
	        }
	        if(gameBoardPlus[2][0]=='O' && gameBoardPlus[2][2]=='O' && gameBoardPlus[2][4]=='O'&& gameBoardPlus[2][6] == 'O') {
	            System.out.println("Player 2 wins!!!");
	            return true;
	        }
	         if(gameBoardPlus[4][0]=='X' && gameBoardPlus[4][2]=='X' && gameBoardPlus[4][4]=='X' && gameBoardPlus[4][6]== 'X') {
	            System.out.println("Player 1 wins!!!");
	            return true;
	        }
	        if(gameBoardPlus[4][0]=='O' && gameBoardPlus[4][2]=='O' && gameBoardPlus[4][4]=='O'&& gameBoardPlus[4][6] == 'O') {
	            System.out.println("Player 2 wins!!!");
	            return true;
	        }
	         if(gameBoardPlus[6][0]=='X' && gameBoardPlus[6][2]=='X' && gameBoardPlus[6][4]=='X' && gameBoardPlus[6][6]== 'X') {
	            System.out.println("Player 1 wins!!!");
	            return true;
	        }
	        if(gameBoardPlus[6][0]=='O' && gameBoardPlus[6][2]=='O' && gameBoardPlus[6][4]=='O'&& gameBoardPlus[6][6] == 'O') {
	            System.out.println("Player 2 wins!!!");
	            return true;
	        }
	         if(gameBoardPlus[0][0]=='X' && gameBoardPlus[2][0]=='X' && gameBoardPlus[4][0]=='X' && gameBoardPlus[6][0]== 'X') {
	            System.out.println("Player 1 wins!!!");
	            return true;
	        }
	        if(gameBoardPlus[0][0]=='O' && gameBoardPlus[2][0]=='O' && gameBoardPlus[4][0]=='O'&& gameBoardPlus[6][0] == 'O') {
	            System.out.println("Player 2 wins!!!");
	            return true;
	        }
	         if(gameBoardPlus[0][2]=='X' && gameBoardPlus[2][2]=='X' && gameBoardPlus[4][2]=='X' && gameBoardPlus[6][2]== 'X') {
	            System.out.println("Player 1 wins!!!");
	            return true;
	        }
	        if(gameBoardPlus[0][2]=='O' && gameBoardPlus[2][2]=='O' && gameBoardPlus[4][2]=='O'&& gameBoardPlus[6][2] == 'O') {
	            System.out.println("Player 2 wins!!!");
	            return true;
	        } if(gameBoardPlus[0][0]=='X' && gameBoardPlus[0][2]=='X' && gameBoardPlus[0][4]=='X' && gameBoardPlus[0][6]== 'X') {
	            System.out.println("Player 1 wins!!!");
	            return true;
	        }
	        if(gameBoardPlus[0][4]=='O' && gameBoardPlus[2][4]=='O' && gameBoardPlus[4][4]=='O'&& gameBoardPlus[6][4] == 'O') {
	            System.out.println("Player 2 wins!!!");
	            return true;
	            
	        } if(gameBoardPlus[0][4]=='X' && gameBoardPlus[2][4]=='X' && gameBoardPlus[4][4]=='X' && gameBoardPlus[6][4]== 'X') {
	            System.out.println("Player 1 wins!!!");
	            return true;
	        } if(gameBoardPlus[0][4] == 'X' && gameBoardPlus[2][4] == 'X' && gameBoardPlus[4][4] == 'X' && gameBoardPlus[6][4] == 'X') {
	        	System.out.println("Player 2 wins!!!");
	        	return true;
	          
	        } if(gameBoardPlus[0][6]=='X' && gameBoardPlus[2][6]=='X' && gameBoardPlus[4][6]=='X' && gameBoardPlus[6][6]== 'X') {
	            System.out.println("Player 1 wins!!!");
	            return true;
	        }

	        if(gameBoardPlus[0][0]=='O' && gameBoardPlus[2][2]=='O' && gameBoardPlus[4][4]=='O'&& gameBoardPlus[6][6] == 'O') {
	            System.out.println("Player 2 wins!!!");
	            return true;
	        } if(gameBoardPlus[0][0]=='X' && gameBoardPlus[2][2]=='X' && gameBoardPlus[4][4]=='X' && gameBoardPlus[6][6]== 'X') {
	            System.out.println("Player 1 wins!!!");
	            return true;
	        }

	        if(gameBoardPlus[0][6]=='O' && gameBoardPlus[2][4]=='O' && gameBoardPlus[4][2]=='O'&& gameBoardPlus[6][0] == 'O') {
	            System.out.println("Player 2 wins!!!");
	            return true;
	        } if(gameBoardPlus[0][6]=='X' && gameBoardPlus[2][4]=='X' && gameBoardPlus[4][2]=='X' && gameBoardPlus[6][0]== 'X') {
	            System.out.println("Player 1 wins!!!");
	            return true;
	        }

	        else
	            return false;
	    }

	}


