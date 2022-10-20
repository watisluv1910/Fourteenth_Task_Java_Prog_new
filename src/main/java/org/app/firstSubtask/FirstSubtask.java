package org.app.firstSubtask;

import org.app.MyInput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstSubtask {

    public boolean isString(String input) {

        String regex = "^(?i)a*b*c*d*e*f*g*h*i*j*k*l*m*n*o*p*q*r*s*t*u*v*w*x*y*z*[0-9]{5}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        return matcher.matches();
    }
}
