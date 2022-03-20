package application;

public class Word {

    public interface Type {
        final public static char KANJI = 0;
        final public static char HIRAGANA = 1;
        final public static char KATAKANA = 2;
    }

    private String kanji = null;
    private String hiragana = null;
    private String katakana = null;
    private String chuugokugo = null;
    private char type;

    /**
     * Use Word.Type to select the word type, and the args order is "kanji -> hirakana = katakana -> chuugokugo"
     * @param type
     * @param args
     */
    public Word(char type, String ... args) {
        this.type = type;
        if (type == Type.KANJI) {
            this.kanji = args[0];
            this.hiragana = args[1];
            this.chuugokugo = args[2];
        }
        else if (type == Type.HIRAGANA) {
            this.hiragana = args[0];
            this.chuugokugo = args[1];
        }
        else if (type == Type.KATAKANA) {
            this.katakana = args[0];
            this.chuugokugo = args[1];
        }
    }

    public void printWord() {
        if (kanji != null) System.out.print(kanji);
        if (hiragana != null) System.out.print(hiragana);
        if (katakana != null) System.out.print(katakana);
        System.out.print(chuugokugo);

    }
}
