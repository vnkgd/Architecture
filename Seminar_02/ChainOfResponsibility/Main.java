package ChainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("user100","983747", "Russia");
        User user2 = new User("user200","qwerty", "Canada");
        User user3 = new User("user300","8732", "USA");
        user3.setBlocked(true);

        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);

        for(User u : userList){
            //Реализована последовательность обязанностей
            User userAuthorized = new CheckAuthorization(new CheckBlock(new CheckLocation(u).check()).check()).check();
            System.out.println();
        }
    }
}
