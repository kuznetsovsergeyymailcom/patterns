package action.Memento;

public class File {

    Save save;

    public File(Save save) {
        this.save = save;
    }

    public void setSave(Save save) {
        this.save = save;
    }

    public Save getSave() {
        return save;
    }
}
