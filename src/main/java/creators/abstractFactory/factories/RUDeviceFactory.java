package creators.abstractFactory.factories;

import creators.abstractFactory.impl.ru.RUKeyBoard;
import creators.abstractFactory.impl.ru.RUMouse;
import creators.abstractFactory.impl.ru.RUTouchPad;
import creators.abstractFactory.interfaces.DeviceFactory;
import creators.abstractFactory.interfaces.KeyBoard;
import creators.abstractFactory.interfaces.Mouse;
import creators.abstractFactory.interfaces.Touchpad;

public class RUDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new RUMouse();
    }

    @Override
    public KeyBoard getKeyBoard() {
        return new RUKeyBoard();
    }

    @Override
    public Touchpad getTouchPad() {
        return new RUTouchPad();
    }
}
