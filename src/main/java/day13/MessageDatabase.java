package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {

    private static List<Message> messages = new ArrayList<>();
//метод “отправляет” новое сообщение от пользователя u1 пользователю u2 с текстом text.
// Отправка в нашем контексте означает добавление сообщения в нашу “базу данных”.
    public static void addNewMessage(User u1, User u2, String text){
        messages.add(new Message(u1,u2,text));
    }
 //возвращает список всех сообщений в “базе данных”.
    public static List<Message> getMessages(){
        return messages;
    }
//этот метод должен вывести цепочку сообщений (диалог) пользователей u1 и u2.
    public static void showDialog(User u1, User u2){
        for (int i=0; i< messages.size();i++){
            if(u1.equals(messages.get(i).sender) && u2.equals(messages.get(i).receiver)){
                System.out.println(messages.get(i));
            } else if (u2.equals(messages.get(i).sender) && u1.equals(messages.get(i).receiver)){
                System.out.println(messages.get(i));
            }
        }

    }






}
