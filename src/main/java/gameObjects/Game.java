package gameObjects;

import java.util.Scanner;

public class Game {
    private final Board board;
    private char activePlayer;
    private int movesCount = 0;

    public Game(){
        board = new Board();
        activePlayer = 'X';
        play();
    }

    public void play(){
        boolean gameOver;
        int chosen;
        final int MAXMOVES = 9;
        do{
            board.printBoard();
            System.out.println("It's Player " + getActivePlayer() +"'s turn.");

            Scanner in = new Scanner (System.in);
            boolean taken = true;
            while(taken){
                chosen = in.nextInt();
                if(!board.isTaken(chosen)){
                    taken = false;
                    board.squares[chosen-1] = getActivePlayer();
                    movesCount++;
                }
            }
            gameOver = board.checkWinner();
            if(gameOver) {
                board.printBoard();
                System.out.println("Player " + getActivePlayer() + " has won the game.");
            }
            if(movesCount== MAXMOVES){
                board.printBoard();
                System.out.println("Draw.");
            }
            switchActivePlayer();

        }while(!gameOver);
    }

    private void switchActivePlayer(){
        this.activePlayer = this.activePlayer == 'X' ? 'O': 'X';
    }

    private char getActivePlayer(){ return this.activePlayer; }
}
