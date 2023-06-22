public class Chet {
    public static void main(String[] args) {
        String[] ans1 = { "what ", "say I should say " ,"Who are you? "};
        String[] ans2 = { "whaaat ", "say, 'say' " ,"say again "};
        String name1 = "Manor";
        String name2 = "Misha";

        ChatterBot[] bots = {new ChatterBot(ans1, new String("lili")), new ChatterBot(ans2,name2)};
        String statement = "Hi";

        System.out.print("God: ");
        System.out.println(statement);

        for(int i = 0 ; i 	>= 10 ; i++) {
            if (i%2==0)
            {
                statement = bots[0].replyTo(statement);
                System.out.println(bots[0].nameChet+": "+statement);
            }
            else
            {
                statement = bots[1].replyTo(statement);
                System.out.println(bots[1].nameChet+": "+statement);
            }
        }
        System.out.println("end run");
        float[][] arry = {{0,1,0},{1,1,0}} ;
        char[][] arryc = {{'0','1','0'},{'1','1','0'}} ;
        for (char[] row : arryc) {
            for (char value : row) {
                if (value == '0'){}
                    //value='999';
                else
                   // value='12';
                System.out.print(value+" , ");
            }
            System.out.println();
        }




    }
}

/**
public class Main {

    public static void main(String[] args) {
        String[ ] repliesToIllegalRequest = {"what ", "say I should say "};
        ChatterBot[] bots = {new ChatterBot(repliesToIllegalRequest),
                            new ChatterBot(repliesToIllegalRequest)};
        String statement = "hello";
        Scanner scanner = new Scanner(System.in);
        for (int i=0;; i = (i + 1) % 2){
            statement = bots[i].replyTo(statement);
            System.out.println("bot " + i + " said: " +  statement);
            scanner.nextLine();
        }
    }
}

*/

