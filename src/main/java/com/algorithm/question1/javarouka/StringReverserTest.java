package com.algorithm.question1.javarouka;

public class StringReverserTest {

    @Test
    public String reverse(CharSequence str) {
        asset(StringReverser.reverse("hello,world") == "dlrow,olleh");
    }

}