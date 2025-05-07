package com.example;

public class Main {
    public static void main(String[] args) {
        StringProcessor processor = new StringProcessor();
        String input1 = "aabcccbbad";
        String result1 = processor.removeConsecutiveChars(input1);
        System.out.println("移除连续相同字符后的结果: " + result1);

        String input2 = "abcccbad";
        String result2 = processor.replaceConsecutiveChars(input2);
        System.out.println("替换连续相同字符后的结果: " + result2);
    }
}    