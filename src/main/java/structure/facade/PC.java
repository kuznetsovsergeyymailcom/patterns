package structure.facade;

import structure.facade.parts.DVD;
import structure.facade.parts.Power;

public class PC {
    Power power = new Power();
    DVD dvd = new DVD(power);

    public void loadDVD(){
        power.switchStateOfPower();
        try {
            dvd.loadDVD();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void showDVD() throws Exception{
        if(dvd.getDvd().isEmpty())
            throw new Exception("dvd is empty");
        dvd.showDVD();
    }
}
