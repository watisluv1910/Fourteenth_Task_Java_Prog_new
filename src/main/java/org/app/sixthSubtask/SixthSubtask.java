package org.app.sixthSubtask;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SixthSubtask {

    public boolean isCorrect(final String input) {

        Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(\\w?){8,}$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
