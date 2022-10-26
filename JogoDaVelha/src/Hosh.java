import java.util.Scanner;
public class Hosh {
    public static void main(String[] args) {
        Board game = new Board();

        Scanner scan = new Scanner(System.in);

        int position;


        for (int i = 0; i < 9; i++){

            System.out.println("play " + i);

            game.printGame();

            System.out.println("Player 1, get a position");

            position = scan.nextInt();

            game.play(position, "X");

            game.printGame();

            if (!game.winner(i).equals("null")){

                System.out.println("The winner is player 1");

                break;

            }

            System.out.println("player 2. get a position");

            position = scan.nextInt();

            game.play(position, "O");

            game.winner(position);

            if (!game.winner(i).equals("null")){

                System.out.println("The winner is player 2");

                break;

            }

        }
    }
}
