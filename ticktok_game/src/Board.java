enum Mark {BLANK, X, O};

public class Board {
    private enum GameStatus {DRAW, IN_PROGRESS, X_WIN, O_WIN};
    public static final int SIZE =3 ;
    public static final int WIN_STREAK =3 ;
    private Mark [][] BoardVal=new Mark[SIZE][SIZE];

    //Fun
    public Board(){
        for (int irow =0; irow<BoardVal.length;irow++){
            for (int icol =0; icol<BoardVal.length;icol++)
                BoardVal[irow][icol]=Mark.BLANK;
        }
    }
    public int getBoardSize(){return SIZE;}
    public boolean putMark(Mark mark,int row, int col)
    {
        if(getMark(row,col)==Mark.BLANK){
            BoardVal[row][col]=mark;
            return true;
        }
        else
            return false;
    }
    public GameStatus getGameStatus()
    {
        return GameStatus.IN_PROGRESS;
    }
    public Mark getMark(int row, int col){
        return BoardVal[row][col];
    }

}
