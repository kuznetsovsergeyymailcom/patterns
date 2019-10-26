package creators.abstractFactory.impl.en;

import creators.abstractFactory.interfaces.KeyBoard;

public class ENGKeyBoard implements KeyBoard {
    @Override
    public void print() {
        System.out.print("Printing text without new line moving");
    }

    @Override
    public void println() {
        System.out.println("Printing text with new line moving");
    }
}
