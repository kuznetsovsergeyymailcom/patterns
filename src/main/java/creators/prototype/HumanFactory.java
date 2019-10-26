package creators.prototype;

import creators.prototype.model.Human;

public class HumanFactory {

    private Human human;

    public HumanFactory(Human human) {
        setPrototype(human);
    }

    private void setPrototype(Human human){
        this.human = human;
    }

    public Human getCopy(){
        return (Human) human.copy();
    }
}
