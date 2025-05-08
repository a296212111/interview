package com.example.sentencebreaker;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> defaultDict = new HashSet<>(Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man", "go"));
        String input1 = "ilikesamsungmobile";
        List<String> output1 = SentenceBreaker.wordBreak(input1, defaultDict);
        for (String line : output1) {
            System.out.println(line);
        }

        System.out.println();

        String input2 = "ilikeicecreamandmango";
        List<String> output2 = SentenceBreaker.wordBreak(input2, defaultDict);
        for (String line : output2) {
            System.out.println(line);
        }

        Set<String> customDict = new HashSet<>(Arrays.asList("i", "like", "apple"));
        String input3 = "ilikeapple";
        List<String> output3 = SentenceBreaker.wordBreak(input3, customDict);
        for (String line : output3) {
            System.out.println(line);
        }

        Set<String> combinedDict = new HashSet<>(defaultDict);
        combinedDict.addAll(customDict);
        String input4 = "ilikeapple";
        List<String> output4 = SentenceBreaker.wordBreak(input4, combinedDict);
        for (String line : output4) {
            System.out.println(line);
        }
    }
}    