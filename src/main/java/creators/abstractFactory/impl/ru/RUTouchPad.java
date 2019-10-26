package creators.abstractFactory.impl.ru;

import creators.abstractFactory.interfaces.Touchpad;

public class RUTouchPad implements Touchpad {
    @Override
    public void track(int deltaX, int deltaY) {
        System.out.println("Двигаемся от к точкам х: " + deltaX + ", y: " + deltaY);
    }
}
