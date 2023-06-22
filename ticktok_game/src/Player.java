import java.util.Scanner;

public class Player {
    private String name;
    public Player(String name){
        this.name=name;
    }
    void playTurn(){ // TODO Improve the function
        System.out.println("insert row col:");
        Scanner scanner = new Scanner(System.in);
        int[] input ={scanner.nextInt(),scanner.nextInt()};
        while(!(input[2]<Board.SIZE&&input[1]<Board.SIZE)){
            System.out.println("insert row col:");
            input[0]=scanner.nextInt();
            input[1]=scanner.nextInt();
        }
    }
}
