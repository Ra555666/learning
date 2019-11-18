package CodeWars;

public class HowMuchILoveYou {
    public static String howMuchILoveYou(int nb_petals) {
        String[] levelsOfLove = {"I love you", "a little", "a lot", "passionately", "madly", "not at all"};
        return levelsOfLove[nb_petals % 6];
    }
}
