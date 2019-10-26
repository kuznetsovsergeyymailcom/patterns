package creators.abstractFactory.factories;

import creators.abstractFactory.impl.en.*;
import creators.abstractFactory.interfaces.DeviceFactory;
import creators.abstractFactory.interfaces.KeyBoard;
import creators.abstractFactory.interfaces.Mouse;
import creators.abstractFactory.interfaces.Touchpad;

public class ENGDeviceFactory implements DeviceFactory {
    @Override
    public Mouse getMouse() {
        return new ENGMouse();
    }

    @Override
    public KeyBoard getKeyBoard() {
        return new ENGKeyBoard();
    }

    @Override
    public Touchpad getTouchPad() {
        return new ENGTouchPad();
    }
}
