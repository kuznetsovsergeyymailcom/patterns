package creators.abstractFactory.factories;

import creators.abstractFactory.interfaces.DeviceFactory;

public class Factory {

    public static DeviceFactory getDeviceFactoryBasedOnLang(String lang){
        switch (lang.toUpperCase()){
            case "RU": return new RUDeviceFactory();
            case "ENG": return new ENGDeviceFactory();
            default: throw new RuntimeException("Unknown/Unsupported lang");
        }
    }
}
