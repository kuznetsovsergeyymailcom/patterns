package creators.abstractFactory.impl.ru;

import creators.abstractFactory.interfaces.Mouse;

public class RUMouse implements Mouse {
    @Override
    public void Click() {
        System.out.println("кнопка мыши нажата один раз");
    }

    @Override
    public void doubleClick() {
        System.out.println("кнопка мыши нажата два раза");
    }

    @Override
    public void scroll(int direction) {

        if(direction < 0){
            System.out.println("скролим вниз");
        }else{
            System.out.println("скролим вверх");
        }
    }
}
