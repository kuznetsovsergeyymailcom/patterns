package structure.facade;

public class Main {

    public static void main(String[] args) {
        PC pc = new PC();
        pc.loadDVD();
        try {
            pc.showDVD();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
