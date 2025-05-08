package com.example.sentencebreaker;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SentenceBreaker {
    public static List<String> wordBreak(String s, Set<String> wordDict) {
        List<String> result = new ArrayList<>();
        backtrack(s, wordDict, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(String s, Set<String> wordDict, int start, List<String> current, List<String> result) {
        if (start == s.length()) {
            result.add(String.join(" ", current));
            return;
        }
        for (int end = start + 1; end <= s.length(); end++) {
            String word = s.substring(start, end);
            if (wordDict.contains(word)) {
                current.add(word);
                backtrack(s, wordDict, end, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}    