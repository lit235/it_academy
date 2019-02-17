package _4_collections.hw_2;


import java.util.*;

/**
 * Задан текст на английском языке. Выделить все различные слова. Для каждого слова подсчитать частоту его встречаемости.
 * Слова, отличающиеся регистром букв, считать различными.
 * Воспользуйтесь для этой цели классом TreeMap<String, Integer>.
 */
public class UtilWord {
    private Map<String, Integer> mapWord;

    public UtilWord(String str) {
        countWord(str);
    }

    public void countWord(String str) {
        List<String> listWords = new ArrayList<>();
        this.mapWord = new TreeMap<>();
        if (str.length() != 0) {
            listWords.addAll(Arrays.asList(str.split("[^a-zA-Z]+")));
        }
        for (String word : listWords) {
            this.mapWord.put(word, this.mapWord.containsKey(word) ?
                    this.mapWord.get(word) + 1 : 1);
        }
    }

    public Map<String, Integer> getMapWord() {
        return mapWord;
    }
}
