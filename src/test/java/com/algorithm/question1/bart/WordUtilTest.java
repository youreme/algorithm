package com.algorithm.question1.bart;

import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WordUtilTest {

	@Test
	public void testReverseWord() throws Exception {
		String reverseWord = WordUtil.reverseWord("Algorithm are awesome!", " ");
		assertEquals(reverseWord, "awesome! are Algorithm");

		reverseWord = WordUtil.reverseWord("Algorithm are awesome!", "o");
		assertEquals(reverseWord, "me! rithm are awes Alg");
	}

	@Test(expected = IllegalArgumentException.class)
	public void testReverseWord_argument_null() throws Exception {
		String reverseWord = WordUtil.reverseWord(null, null);
	}

	@Test
	public void testConvertStringListByDelim() throws Exception {
		List<String> stringList = WordUtil.convertStringListByDelim("Algorithm are awesome!", " ");

		assertEquals(stringList.size(), 3);
		assertEquals(stringList.get(0), "Algorithm");
		assertEquals(stringList.get(1), "are");
		assertEquals(stringList.get(2), "awesome!");
	}

	@Test
	public void testReverse() throws Exception {
		List<String> mockList = WordUtil.convertStringListByDelim("Algorithm are awesome!", " ");
		WordUtil.reverse(mockList);
		assertEquals(mockList.size(), 3);
		assertEquals(mockList.get(0), "awesome!");
		assertEquals(mockList.get(1), "are");
		assertEquals(mockList.get(2), "Algorithm");

		List<String> mockList2 = WordUtil.convertStringListByDelim("Algorithm are awesome! yes!", " ");
		WordUtil.reverse(mockList2);
		assertEquals(mockList2.size(), 4);
		assertEquals(mockList2.get(0), "yes!");
		assertEquals(mockList2.get(1), "awesome!");
		assertEquals(mockList2.get(2), "are");
		assertEquals(mockList2.get(3), "Algorithm");
	}

	@Test
	public void testToString() throws Exception {
		List<String> mockList = Lists.newArrayList("Algorithm","are","awesome!");
		String result = WordUtil.toString(mockList);
		assertEquals(result, "Algorithm are awesome!");
	}
}