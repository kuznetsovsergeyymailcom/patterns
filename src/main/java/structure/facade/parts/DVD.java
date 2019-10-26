package structure.facade.parts;

public class DVD {
    private Power power;
    private String dvd;

    public DVD(Power power){
        this.power = power;
    }

    public void loadDVD() throws Exception{
        if(!power.getPowerState())
            throw new Exception("dvd cannot be loaded because of power if switched of");

        dvd = "movie..............";
    }

    public Power getPower() {
        return power;
    }

    public void setPower(Power power) {
        this.power = power;
    }

    public String getDvd() {
        return dvd;
    }

    public void setDvd(String dvd) {
        this.dvd = dvd;
    }

    public void showDVD(){
        System.out.println(dvd);
    }
}
