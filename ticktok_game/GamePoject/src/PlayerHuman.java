/* Class: Player
duty:  to manage the player functionally
       like:
       * send number to board
       * create player interface - manual or AI
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayerHuman {
    //Var
    RendererConsole renderer= new RendererConsole();
    public Board board_Local;

    // Player class constructor
    public PlayerHuman(Board board){
        this.board_Local=board;
    }
    //Fun
    void playTurn(Mark mark){
        System.out.println("turn of:"+mark);
        int[] inputNUM = getTwoNumbers();
        while (!board_Local.putMark(inputNUM[0], inputNUM[1], mark)){
            inputNUM = getTwoNumbers();
        }
    }
    public int[] getTwoNumbers() {

        int[] numbers = new int[2];
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Enter Row Col (separated by a space): ");
                numbers[0] = scanner.nextInt(); //row
                numbers[1] = scanner.nextInt(); // col
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.nextLine(); // clear the input buffer
            }
        }
        return numbers;
    }
}
