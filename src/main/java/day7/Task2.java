package day7;


import java.util.Random;

public class Task2 {

    String name;
    public static void main(String[] args) {

        Random random = new Random();

        Player player = new Player(random.nextInt(11)+90);
        Player player1 = new Player(random.nextInt(11)+90);

        Player player2 = new Player(random.nextInt(11)+90);
        Player player3 = new Player(random.nextInt(11)+90);

        Player player4 = new Player(random.nextInt(11)+90);
        Player player5 = new Player(random.nextInt(11)+90);

        /*player.info();
        Player player7 = new Player(random.nextInt(11)+90);
        Player player8 = new Player(random.nextInt(11)+90);
        player.info();*/


        for (int i = 0; i<110; i++){
          player.run();

        }
        player.info();

        for (int i = 0; i<110; i++){
            player2.run();

        }
        player2.info();




    }
}
