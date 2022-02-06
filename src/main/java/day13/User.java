package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    String username;
    List<User> subscriptions;
    List<User> friendsList;

    public List<User> getFriendsList() {
        return friendsList;
    }

    public void setFriendsList(List<User> friendsList) {
        this.friendsList = friendsList;
    }



    public String getUsername() {
        return username;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }



    public User(String username) {
        this.username = username;
        this.subscriptions = new ArrayList<>();
        this.friendsList = new ArrayList<>();

    }

//подписывает пользователя на пользователя user
    public void subscribe(User user){
        this.subscriptions.add(user);
    }
//возвращает True, если пользователь подписан на
// пользователя user и False, если не подписан.
    public boolean isSubscribed(User user){
        if (this.subscriptions.contains(user)){
            return true;
        } else return false;

    }

    public void friendship(User user){
        this.friendsList.add(user);
    }

//возвращает True, если пользователь user является другом и False,
// если пользователь user не является другом. Подумайте, что такое дружба в контексте соц. сетей.
    public boolean isFriend(User user){
        if (this.friendsList.contains(user)){
            return true;
        } else return false;
    }
//отправляет сообщение с текстом text пользователю user. Здесь должен
// использоваться статический метод из MessageDatabase.
    public void sendMessage(User user, String text){

        MessageDatabase.addNewMessage(this, user, text);

    }

    @Override
    public String toString() {
        return username;
    }







}
