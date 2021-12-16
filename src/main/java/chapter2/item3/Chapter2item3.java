package chapter2.item3;

public class Chapter2item3 {

    private int difficulty;

    private static final Chapter2item3 INSTANCE = new Chapter2item3();

    public static Chapter2item3 getInstance() {
        return INSTANCE;
    }

    private Chapter2item3() {
        difficulty = 0;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }
}
