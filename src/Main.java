//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     WordMatch w = new WordMatch("concatenation");
     System.out.println(w.scoreGuess("ten"));
     System.out.println(w.scoreGuess("nation"));
     System.out.println(w.scoreGuess("ten", "nation");
     System.out.println(w.scoreGuess("con"));
     System.out.println(w.scoreGuess("cat"));
     System.out.println(w.scoreGuess("con", "cat"));
    }
}