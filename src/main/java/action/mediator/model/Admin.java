package action.mediator.model;

import action.mediator.interfaces.Chat;
import action.mediator.interfaces.User;

public class Admin implements User {

    Chat chat;

    public Admin(Chat chat) {
        this.chat = chat;
    }

    @Override
    public void sendMessage(String message) {
        chat.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println("Admin user received message: '" + message + "'");
    }
}
