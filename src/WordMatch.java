public class WordMatch {
    private String secret;

    public WordMatch(String word){

    }

    public int scoreGuess(String guess){
        int score = 0;
        for (int i = 0; i <= secret.length() - guess.length(); i++) {
            if (secret.substring(i, i + guess.length()).equals(guess)) {
                score++;
            }
            return 0;
        }
        return score * guess.length() * guess.length();
    }

    public String findBetterGuess(String guess1, String guess2){
        return null;
    }
}
