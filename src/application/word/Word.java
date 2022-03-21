package application.word;

public class Word {
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
        switch (type) {
            case Type.KANJI:
                this.kanji = args[0];
                this.hiragana = args[1];
                this.chuugokugo = args[2];
                break;
            case Type.HIRAGANA:
                this.hiragana = args[0];
                this.chuugokugo = args[1];
                break;
            case Type.KATAKANA:
                this.katakana = args[0];
                this.chuugokugo = args[1];
                break;
            default: break;
        }
    }
}
