package Level_2.skkang.flo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skkang on 2020. 4. 17..
 */
public class test_3 {

    public static void main(String[] args) {

        String[] words = {"apple", "applewatch", "applekwyboard"};
        String keyword = "apple";
        solution(words, keyword);

    }

    public static String[] solution(String[] words, String keyword) {

        ArrayList<String> list = new ArrayList<String>();

        int len = keyword.length();

        for(String word: words){
            String splitedWord = word.substring(0,len);
            if (splitedWord.equals(keyword)) list.add(word);
        }

        String[] answer = new String[list.size()];
        int size = 0;

        for(String word:list) {
            answer[size++] = word;
        }

        return answer;
    }
}

