/* HUJI course Tick tock game By Harel.Sh
main function: Game
 */

public class Game {
    RendererConsole renderer;
    Board board;
    PlayerHuman player;
    private int MaxTurn;

    public Game (){
        renderer= new RendererConsole();
        board=new Board();
        player=new PlayerHuman(board);
        MaxTurn= (board.getBoardSize()*board.getBoardSize());
        System.out.println("The first player is X, lets play:");
        renderer.renderBoard(board);
    }

    public boolean runGame(Game game){
        System.out.println(game.board.getBoardStatus());
        while ((game.board.getBoardStatus() == Board.BoardStatus.IN_PROGRESS))
        {
            if (game.board.GetCntTurn()%2==0) {
                player.playTurn(Mark.X);
            } else
                player.playTurn(Mark.O);
            game.renderer.renderBoard(game.board);
            System.out.println(game.board.getBoardStatus());
        }
        System.out.println("end main!");
        return true;
    }


}
