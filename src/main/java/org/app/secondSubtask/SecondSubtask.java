package org.app.secondSubtask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SecondSubtask {

    public void getValues(String input) {

        String regex = "(?:(?:0|[1-9]\\d*),)?([1-9]\\d*(?:\\d{0,2})?\\s*(?:USD|EU|RUB))";

        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(input);

        while (m1.find()) {
            System.out.println(input.substring(m1.start(), m1.end()));
        }
    }
}
