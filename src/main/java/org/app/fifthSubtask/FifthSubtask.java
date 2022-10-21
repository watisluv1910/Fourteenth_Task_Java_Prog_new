package org.app.fifthSubtask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FifthSubtask {

    public boolean isCorrect(final String input) {

        Pattern pattern = Pattern.compile("(\\w+)@(\\w+\\.?)(?:(\\w+)(\\.\\w+)*)?");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
