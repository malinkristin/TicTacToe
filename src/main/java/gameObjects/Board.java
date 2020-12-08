package gameObjects;

public class Board{
    public final char[] squares;

    public Board(){
        squares = new char[]{'1','2','3','4','5','6','7','8','9'};
    }

    public void printBoard(){
        System.out.println("[" +squares[0] + "] [" + squares[1] + "] [" + squares[2] + "]");
        System.out.println("[" +squares[3] + "] [" + squares[4] + "] [" + squares[5] + "]");
        System.out.println("[" +squares[6] + "] [" + squares[7] + "] [" + squares[8] + "]");
    }

    public boolean checkWinner(){
        return squares[0] == 'X' && squares[1] == 'X' && squares[2] == 'X'
                || squares[3] == 'X' && squares[4] == 'X' && squares[5] == 'X'
                || squares[6] == 'X' && squares[7] == 'X' && squares[8] == 'X'
                || squares[0] == 'X' && squares[3] == 'X' && squares[6] == 'X'
                || squares[1] == 'X' && squares[4] == 'X' && squares[7] == 'X'
                || squares[2] == 'X' && squares[5] == 'X' && squares[8] == 'X'
                || squares[0] == 'X' && squares[4] == 'X' && squares[8] == 'X'
                || squares[2] == 'X' && squares[4] == 'X' && squares[6] == 'X'
                || squares[0] == 'O' && squares[1] == 'O' && squares[2] == 'O'
                || squares[3] == 'O' && squares[4] == 'O' && squares[5] == 'O'
                || squares[6] == 'O' && squares[7] == 'O' && squares[8] == 'O'
                || squares[0] == 'O' && squares[3] == 'O' && squares[6] == 'O'
                || squares[1] == 'O' && squares[4] == 'O' && squares[7] == 'O'
                || squares[2] == 'O' && squares[5] == 'O' && squares[8] == 'O'
                || squares[0] == 'O' && squares[4] == 'O' && squares[8] == 'O'
                || squares[2] == 'O' && squares[4] == 'O' && squares[6] == 'O';
    }

    public boolean isTaken(int square){
        if(this.squares[square-1] == 'X' || this.squares[square-1] == 'O'){
            System.out.println("This one's taken. Choose another square.");
            return true;
        }else{
            return false;
        }
    }
}
