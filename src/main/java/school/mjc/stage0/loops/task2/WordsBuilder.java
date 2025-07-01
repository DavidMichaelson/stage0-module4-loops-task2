package school.mjc.stage0.loops.task2;

import java.sql.SQLOutput;

public class WordsBuilder {
    public void buildPhrase(char... chars) {

        StringBuilder text = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            text.append(chars[i]);
        }

        System.out.println(text.toString());
    }

    public static void main(String[] args) {
        WordsBuilder builder = new WordsBuilder();
        builder.buildPhrase('L', 'A', 'B', 'A', 'S');
    }
}
