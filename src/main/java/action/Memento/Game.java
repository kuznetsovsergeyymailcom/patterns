package action.Memento;

public class Game {
    private String level;
    private int ms;

    public Game(String level, int ms) {
        this.level = level;
        this.ms = ms;
    }

    public Save save(){
        return new Save(level, ms);
    }

    public void load(Save save){
        this.level = save.getLevel();
        this.ms = save.getMs();
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setMs(int ms) {
        this.ms = ms;
    }

    @Override
    public String toString() {
        return "Game{" +
                "level='" + level + '\'' +
                ", ms=" + ms +
                '}';
    }
}
