import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;
public class Main {
    public static int calc() throws FileNotFoundException{
        int score = 0;
        int index = 0;
        WordMatch [] game = new WordMatch[1000];
        File f= new File ("src/words.txt");
        Scanner s = new Scanner(f);
        while(s.hasNextLine() && index< game.length){
        String line= s.nextLine();
        int space1= line.indexOf(" ");
        int space2= line.indexOf(" ", space1+1);
        String secret= line.substring(0, space1 );
        String guess1= line.substring(space1+1, space2);
        String guess2= line.substring(space2+1);
        game[index] = new WordMatch(secret);
        score += game[index].scoreGuess(guess1)+game[index].scoreGuess(guess2);
        index++;
        }
        return score;
    }
    public static void main(String[] args) throws FileNotFoundException{
       System.out.println(calc());
    }
}