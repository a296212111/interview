package com.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringProcessor {

    public String removeConsecutiveChars(String input) {
        Pattern pattern = Pattern.compile("(.)\\1{2,}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            input = input.replaceAll("(.)\\1{2,}", "");
            matcher = pattern.matcher(input);
        }
        return input;
    }

    public String replaceConsecutiveChars(String input) {
        Pattern pattern = Pattern.compile("(.)\\1{2,}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String match = matcher.group();
            char prevChar = (char) (match.charAt(0) - 1);
            input = input.replace(match, String.valueOf(prevChar));
            matcher = pattern.matcher(input);
        }
        return input;
    }
}    