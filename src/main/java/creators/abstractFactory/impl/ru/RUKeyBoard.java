package creators.abstractFactory.impl.ru;

import creators.abstractFactory.interfaces.KeyBoard;

public class RUKeyBoard implements KeyBoard {
    @Override
    public void print() {
        System.out.print("Печатаем текст без переноса на новую строку");
    }

    @Override
    public void println() {
        System.out.println("Печатаем текст с переносом на новую строку");
    }
}
