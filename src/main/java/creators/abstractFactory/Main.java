package creators.abstractFactory;

import creators.abstractFactory.factories.Factory;
import creators.abstractFactory.interfaces.DeviceFactory;
import creators.abstractFactory.interfaces.KeyBoard;
import creators.abstractFactory.interfaces.Mouse;
import creators.abstractFactory.interfaces.Touchpad;

public class Main {

    public static void main(String[] args) {
        DeviceFactory factory = Factory.getDeviceFactoryBasedOnLang("eng");
        KeyBoard keyBoard = factory.getKeyBoard();
        Mouse mouse = factory.getMouse();
        Touchpad touchPad = factory.getTouchPad();

        keyBoard.println();
        mouse.Click();
        touchPad.track(23, 9);
    }
}
