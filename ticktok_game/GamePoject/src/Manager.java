import java.util.Scanner;
public class Manager {
    private Scanner in = new Scanner(System.in);
    public Manager(){
        welcome();
    }
    private void welcome (){
        System.out.println("Welcome to TICKTOCK game");
    }
    public String PlayerName(){
        System.out.println("new player insert name:");
        String name =in.nextLine();
        System.out.println("the player name is: " + name);
        return name;
    }
    public int[] insertTick(){
        System.out.println("Insert row/col: ");
        int[] a = {in.nextInt(),in.nextInt()};
        return a;
    }
}
