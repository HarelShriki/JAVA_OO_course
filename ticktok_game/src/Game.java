public class Game {
    public static void main(String[] args)
    {
        Renderer renderer= new Renderer();
        Board board=new Board();
        Player ply=new Player("LILO");
        /* TODO
        String name = scanner.nextLine(); // Read a line of text from the user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        */


        renderer.renderBoard(board);
        board.putMark(Mark.X,1,1);
        renderer.renderBoard(board);
        ply.playTurn();
        System.out.println("end main!");

    }
}