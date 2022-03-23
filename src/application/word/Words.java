package application.word;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

final public class Words {
    public static ArrayList<Word> words = new ArrayList<>();

    public static void readWords() {
        String line = new String();
        String[] str = new String[5];
        try (BufferedReader reader = new BufferedReader(new FileReader(new File("WordsList.csv"), StandardCharsets.UTF_8))) {
            while ((line = reader.readLine()) != null) {
                str = line.split(",");
                switch(Integer.parseInt(str[0])) {
                    case WordType.KANJI:
                        words.add(new Word(WordType.KANJI, str[1], str[2], str[4]));
                        break;
                    case WordType.HIRAGANA:
                        words.add(new Word(WordType.HIRAGANA, str[2], str[4]));
                        break;
                    case WordType.KATAKANA:
                        words.add(new Word(WordType.KATAKANA, str[3], str[4]));
                        break;
                    default: break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void saveWords() {
        try (FileWriter writer = new FileWriter(new File("WordsList.csv"), StandardCharsets.UTF_8)) {
            words.forEach(word -> {
                try {
                    writer.write(String.valueOf(word.getType()) + ",");
                    writer.write(word.getKanji() + ",");
                    writer.write(word.getHiragana() + ",");
                    writer.write(word.getKatakana() + ",");
                    writer.write(word.getChuugokugo() + "\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
