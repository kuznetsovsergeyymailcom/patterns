package action.mediator.model;

import action.mediator.interfaces.Chat;
import action.mediator.interfaces.User;

import java.util.ArrayList;
import java.util.List;

public class TextChat implements Chat {

    Admin admin;
    List<User> users = new ArrayList<>();

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public void addUser(User user){
        users.add(user);
    }
    @Override
    public void sendMessage(String message, User user) {

        users.stream().forEach(i -> i.getMessage(message));
        admin.getMessage(message);
    }
}
