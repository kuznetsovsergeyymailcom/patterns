package creators.abstractFactory.impl.en;

import creators.abstractFactory.interfaces.Mouse;

public class ENGMouse implements Mouse {
    @Override
    public void Click() {
        System.out.println("Mouse button clicked ones");
    }

    @Override
    public void doubleClick() {
        System.out.println("Mouse button clicked twice");
    }

    @Override
    public void scroll(int direction) {

        if(direction < 0){
            System.out.println("scrolling down");
        }else{
            System.out.println("scrolling up");
        }
    }
}
