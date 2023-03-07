import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class CharWord {
    HashMap<Character, List<String>> charWordPair = new HashMap<Character, List<String>>();

    public void storeWords(List<String> words) {
        for (String word : words) storeWord(word);
    }

    public void storeWord(String word) {
        Character firstChar = word.charAt(0);
        if(charWordPair.containsKey(firstChar))
        {
            List<String> obtainedWordList = charWordPair.get(firstChar);
            obtainedWordList.add(word);
            Collections.sort(obtainedWordList);
            charWordPair.put(firstChar,obtainedWordList);

        }else if(!charWordPair.containsKey(firstChar)){
            List<String> newList = new ArrayList<>();
            newList.add(word);
            charWordPair.put(firstChar,newList);
        }
    }

    public void printKeys() {
        int i = -1;
        for (Character key : charWordPair.keySet()) System.out.println("Index: " + ++i + "Character Key " + key);
    }

    public void printKeyWithValues() {
        charWordPair.forEach((k,w)-> System.out.println("Key: "+k+" - Words "+w));

    }

    public void printWordByChar(Character charKey) {
        List<String> obtainedWords = charWordPair.getOrDefault(charKey, new ArrayList<>());
        for (String word : obtainedWords)
            System.out.println(" Key: " + charKey + " word: " + word);
    }

}
