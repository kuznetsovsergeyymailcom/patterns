package creators.abstractFactory.interfaces;

public interface DeviceFactory {
    Mouse getMouse();
    KeyBoard getKeyBoard();
    Touchpad getTouchPad();
}
