package com.example.sentencebreaker;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SentenceBreakerTest {
    @Test
    void testWordBreak() {
        Set<String> dict = new HashSet<>(Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile"));
        String input = "ilikesamsungmobile";
        List<String> result = SentenceBreaker.wordBreak(input, dict);
        assertTrue(result.size() > 0);
    }
}    