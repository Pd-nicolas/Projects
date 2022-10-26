public class Board {

    String table[][] = {{"1", "2", "3"},{"4", "5", "6"},{"7", "8", "9"}};

    public void printGame(){

        for(int line = 0; line < 3; line++){

            for (int column = 0; column < 3; column++){

                System.out.print("  " + table[line][column]);

            }

            System.out.println();

        }
    }

    public void play(int position, String player){

        for (int line = 0; line < 3; line++){

            for (int column = 0; column < 3; column++){

                if (position == 1){

                    table[0][0] = player;

                } else if (position == 2) {

                    table[0][1] = player;

                }else if (position == 3){

                    table[0][2] = player;

                }else if (position == 4){

                    table[1][0] = player;

                } else if (position == 5 ) {

                    table[1][1] = player;

                } else if (position == 6) {

                    table[1][2] = player;

                } else if (position == 7) {

                    table[2][0] = player;

                } else if (position == 8) {

                    table[2][1] = player;

                } else if (position == 9) {

                    table[2][2] = player;
                }
            }
        }
    }

    public String winner(int jogadas){

        String[] possibility = new String[8];

        String ganhador = "null";

        if (jogadas == 9){

            ganhador = "Tied";
        }

        possibility[0] = table[0][0] + table[0][1] + table[0][2];

        possibility[1] = table[1][0] + table[1][1] + table[1][2];

        possibility[2] = table[2][0] + table[2][1] + table[2][2];

        possibility[3] = table[0][0] + table[1][0] + table[2][0];

        possibility[4] = table[0][1] + table[1][1] + table[2][2];

        possibility[5] = table[0][2] + table[1][2] + table[2][2];

        possibility[6] = table[0][0] + table[1][1] + table[2][2];

        possibility[7] = table[0][2] + table[1][1] + table[2][0];

        for (int i = 0; i < possibility.length; i++){

            if(possibility[i].equals("XXX")){

                ganhador = "player 1";

            }else if (possibility[i].equals("OOO")){

                ganhador = "player 2";
            }
        }

        return ganhador;
    }

}
