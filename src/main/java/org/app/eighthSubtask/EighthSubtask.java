package org.app.eighthSubtask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EighthSubtask {

    public void buildDictionary(String inputText) {

        inputText = inputText.toLowerCase();

        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < inputText.length(); i++){

            char ch = inputText.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                map.compute(ch,
                        (character, integer) -> integer == null ? 1 : integer + 1);
            }
        }

        ArrayList<Map.Entry<Character, Integer>> entries =
                new ArrayList<>(map.entrySet());
        entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));

        System.out.println("Text dictionary is:");

        for(Map.Entry<Character, Integer> entry : entries) {
            System.out.println("Letter: " + entry.getKey() + ", frequency: " + entry.getValue());
        }
    }
}
