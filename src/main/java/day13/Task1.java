package day13;



public class Task1  {
    public static void main(String[] args) throws InterruptedException {

        User user1 = new User("Anastsiya");
        User user2 = new User("George");
        User user3 = new User("Oleg");
        user1.sendMessage(user2, "Привет!");

        user1.sendMessage(user2, "Давно тебя не видно!");

        user2.sendMessage(user1, "Здаров!");

        user2.sendMessage(user1, "да в работе весь");

        user2.sendMessage(user1, "ващще жесть");

        user3.sendMessage(user1, "Здаров насть!");

        user3.sendMessage(user1, "Вечером на треню?");

        user3.sendMessage(user1, "Как обычно идем?");

        user1.sendMessage(user3, "хаюшки");

        user1.sendMessage(user3, "да конечно");

        user1.sendMessage(user3, "в семь на углу");

        user3.sendMessage(user1, "Отлично");

        user3.sendMessage(user1, "Воды возьми");

        user3.sendMessage(user1, "постараюсь не опоздать");



        MessageDatabase.showDialog(user1,user3);



    }
}
