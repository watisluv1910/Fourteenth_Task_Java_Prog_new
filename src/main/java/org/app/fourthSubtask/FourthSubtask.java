package org.app.fourthSubtask;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FourthSubtask {

    public boolean isCorrect(final String input) {

        Pattern pattern = Pattern.compile(
                "^(0[1-9]|[12]\\d|3[01])/([0][1-9]|1[0-2])/((?:19|[2-9]\\d)\\d{2})$"
        );
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.matches();

        if (result) {

            Integer day = Integer.parseInt(matcher.group(1));
            Integer month = Integer.parseInt(matcher.group(2));
            Integer year = Integer.parseInt(matcher.group(3));

            if (day > 28 && month == 2 && !isLeapYear(year)) {
                return false;
            }
        }
        return matcher.matches();
    }

    private static boolean isLeapYear(int year) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, year);
        return cal.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;
    }
}
