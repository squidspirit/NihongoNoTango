package application;

public class Main {
    public static void main(String[] args) {
        new MainFrame();
        Word word = new Word(Word.Type.HIRAGANA, "わたし", "我");
        word.printWord();
    }
}
