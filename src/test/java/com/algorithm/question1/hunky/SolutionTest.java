package com.algorithm.question1.hunky;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;

/**
 * Created by youreme on 2016. 4. 27..
 */
public class SolutionTest {
    @Test
    public void testDefault() {
        final String input = "Algorithm are awesome!";
        final String expected = "awesome! are Algorithm";

        String actual = Solution.reverseWord(input);
        Assert.assertThat(actual, is(expected));
    }

    @Test
    public void testAWord() {
        final String input = "Algorithm";
        final String expected = "Algorithm";

        String actual = Solution.reverseWord(input);
        Assert.assertThat(actual, is(expected));
    }
}
