package action.mediator;

import action.mediator.model.Admin;
import action.mediator.model.SimpleUser;
import action.mediator.model.TextChat;

public class Main {

    public static void main(String[] args) {
        TextChat textChat = new TextChat();

        Admin admin = new Admin(textChat);
        SimpleUser simpleUser1 = new SimpleUser(textChat);
        SimpleUser simpleUser2 = new SimpleUser(textChat);

        textChat.setAdmin(admin);
        textChat.addUser(simpleUser1);
        textChat.addUser(simpleUser2);

        admin.sendMessage("hello every one, welcome!!");
        simpleUser1.sendMessage("hello from user 1");
        simpleUser2.sendMessage("hello from user 2");

    }
}
