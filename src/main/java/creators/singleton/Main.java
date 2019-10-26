package creators.singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class Main {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("First instance: "+singleton.hashCode());

        singleton = Singleton.getInstance();
        System.out.println("Second instance: "+singleton.hashCode());

    }
}
