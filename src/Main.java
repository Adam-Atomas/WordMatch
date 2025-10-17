//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     WordMatch game = new WordMatch("concentration");
     System.out.println(game.scoreGuess("cen"));
     System.out.println(game.scoreGuess("tration"));
     System.out.println(game.findBetterGuess("tration", "cen"));
     System.out.println(game.scoreGuess("con"));
     System.out.println(game.scoreGuess("cen"));
     System.out.println(game.findBetterGuess("con", "con"));
    }
}