package application.word;

public class Word {
    private String kanji = "";
    private String hiragana = "";
    private String katakana = "";
    private String chuugokugo = "";
    private int type;

    /**
     * Use Word.Type to select the word type, and the args order is "kanji -> hirakana = katakana -> chuugokugo"
     * @param type
     * @param args
     */
    public Word(int type, String ... args) {
        this.type = type;
        switch (type) {
            case WordType.KANJI:
                this.kanji = args[0];
                this.hiragana = args[1];
                this.chuugokugo = args[2];
                break;
            case WordType.HIRAGANA:
                this.hiragana = args[0];
                this.chuugokugo = args[1];
                break;
            case WordType.KATAKANA:
                this.katakana = args[0];
                this.chuugokugo = args[1];
                break;
            default: break;
        }
    }

    public String getKanji() { return kanji; }
    public String getHiragana() { return hiragana; }
    public String getKatakana() { return katakana; }
    public String getChuugokugo() { return chuugokugo; }
    public int getType() { return type; }
}
