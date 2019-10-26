package action.Memento;

// Паттерн хранитель
public class Main {
    public static void main(String[] args) {
        Game game = new Game("LEVEL_1",123000);
        Save save = game.save();
        File file = new File(save);

        System.out.println(game);

        game.setLevel("LEVEL_3");
        game.setMs(3000);
        System.out.println(game);

        Save save1 = file.getSave();

        game.load(save1);
        System.out.println(game);

    }
}
