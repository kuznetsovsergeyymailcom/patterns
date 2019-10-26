package creators.prototype;

import creators.prototype.model.Human;

public class Main {

    public static void main(String[] args) {

        Human human = new Human(13, "best human");
        HumanFactory factory = new HumanFactory(human);

        Human copy = factory.getCopy();
        System.out.println(copy);
    }
}
