package creators.abstractFactory.impl.en;

import creators.abstractFactory.interfaces.Touchpad;

public class ENGTouchPad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("moving to points х: " + deltaX + ", y: " + deltaY);
    }
}
