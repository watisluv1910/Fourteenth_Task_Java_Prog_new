package org.app.thirdSubtask;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ThirdSubtask {

    public void find(String input) {

        ArrayList<String> matches = new ArrayList<>();

        String regex = "[0-9]+[ ]*[+]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            matches.add(matcher.group());
        }

        System.out.println(matches);
    }
}
