package day7;



public class Player {

    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    static int countPlayers;
    private Integer stamina;

    public Player(int stamina){
        if (countPlayers <6){
            countPlayers++;
        }
        this.stamina = stamina;
        System.out.println(this.stamina);
    }


    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStamina() {
        return stamina;
    }

    public static void setCountPlayers(int countPlayers) {
        Player.countPlayers = countPlayers;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }


    void run(){
        if (stamina == 0) {
            return;
        } else stamina--;
        if (stamina == 0)
            countPlayers--;

    }
    void info(){
        if (countPlayers < 6){
            switch (countPlayers){
                case 0:
                    System.out.println("Команды неполные. На поле еще есть 6 свободных мест.");
                    break;
                case 1:
                    System.out.println("Команды неполные. На поле еще есть 5 свободных мест.");
                    break;
                case 2:
                    System.out.println("Команды неполные. На поле еще есть 4 свободных места.");
                    break;
                case 3:
                    System.out.println("Команды неполные. На поле еще есть 3 свободных места.");
                    break;
                case 4:
                    System.out.println("Команды неполные. На поле еще есть 2 свободных места.");
                    break;
                case 5:
                    System.out.println("Команды неполные. На поле еще есть 1 свободное место.");
                    break;

            }

            //System.out.println("Команды неполные. На поле еще есть " + (6-countPlayers) + " свободных мест.");    решение без учета падежей

        } else System.out.println("На поле нет свободных мест.");
    }
}
