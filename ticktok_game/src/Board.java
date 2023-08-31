
import java.util.InputMismatchException;
import java.util.Scanner;

enum Mark {BLANK, X, O};

public class Board {
    public static final int SIZE =3 ;
    public static final int WIN_STREAK =3 ;
    private Mark [][] BoardVal=new Mark[SIZE][SIZE];
    enum BoardStatus {IN_PROGRESS, DRAW, X_WIN, O_WIN, END};
    private BoardStatus gameStatus_current;
    private int cntTurn_current;

    public Board(){//Board constructor
        // set Mark.BLANK in Board
        for (int irow =0; irow<BoardVal.length;irow++){
            for (int icol =0; icol<BoardVal.length;icol++)
                BoardVal[irow][icol]=Mark.BLANK;
        }
        gameStatus_current = BoardStatus.IN_PROGRESS;
        cntTurn_current=0;
    }
    //Fun:
    public int getBoardSize(){return SIZE;}

    public boolean putMark(int row, int col, Mark mark) {
        row = row/10-1;
        col = col-1;
        if ((0<=row&&row<SIZE)&&(0<=col&&col<SIZE)) {
            if (getMark(row, col) == Mark.BLANK) {
                BoardVal[row][col] = mark;
                cntTurn_current++;
                calcGameStatus(row, col,mark,cntTurn_current);
                return true;
            } else {
                System.out.println("Insert good position val!");
                cntTurn_current++;
                return false;
            }
        }
        else
            return false;
    }

    public void calcGameStatus(int row, int col, Mark mark, int cnt) {
       if (cnt<=SIZE*SIZE)
       {
           //check up down
            int up_down=countMarkDirection(row, col, 1,0, mark)+countMarkDirection(row, col, -1,0, mark)-1;
            //check right left
            int right_left=countMarkDirection(row, col, 0,1, mark)+countMarkDirection(row, col, 0,-1, mark)-1;
            //check diagonal / right
            int diagonal_right=countMarkDirection(row, col, 1,1, mark)+countMarkDirection(row, col, -1,-1, mark)-1;
            //check diagonal / left
            int diagonal_left=countMarkDirection(row, col, -1,1, mark)+countMarkDirection(row, col, 1,-1, mark)-1;


            if (up_down>=WIN_STREAK || right_left >=WIN_STREAK || diagonal_right >=WIN_STREAK || diagonal_left >=WIN_STREAK)
            {
                if (mark == Mark.O){
                    gameStatus_current= BoardStatus.O_WIN;
                    return;
                }
                else if (mark == Mark.X){
                    gameStatus_current= BoardStatus.X_WIN;
                    return;
                }
            }
       }
       if (cnt==SIZE*SIZE)
           gameStatus_current=BoardStatus.DRAW;
       else
           gameStatus_current= BoardStatus.IN_PROGRESS;



    }
    private int countMarkDirection(int row, int col, int rowDelta, int colDelta, Mark mark) {
        int count = 0;
        while(row < SIZE && row >= 0 && col < SIZE && col >= 0 && BoardVal[row][col] == mark) {
            count++;
            row += rowDelta;
            col += colDelta;
        }
        return count;
    }
    public Mark getMark(int row, int col){
        return BoardVal[row][col];
    }
    public BoardStatus getBoardStatus(){
        return gameStatus_current;
    }
    public  int GetCntTurn(){
        return cntTurn_current;
    }
}
