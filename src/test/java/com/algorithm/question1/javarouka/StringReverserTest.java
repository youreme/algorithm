package com.algorithm.question1.javarouka;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 *
 * createdAt 2016. 5. 1.
 * @since 1.0
 * @author javarouka
 */
public class StringReverserTest {
	
	private static Map<String, String> TEST_CASE_STR_ENTRIES = new HashMap<String, String>();
	static {
		TEST_CASE_STR_ENTRIES.put("hello,world", "dlrow,olleh");
		TEST_CASE_STR_ENTRIES.put("안녕,세계", "계세,녕안");
		TEST_CASE_STR_ENTRIES.put("님하 ㅇㅈ?, ㅇ ㅇㅈ", "ㅈㅇ ㅇ ,?ㅈㅇ 하님");
	}

	@Test
	public void testReverseBuilder() {
		for(Map.Entry<String, String> entry : TEST_CASE_STR_ENTRIES.entrySet()) {
			assertTrue(StringReverser.reverseBuilder(entry.getKey()).equals(entry.getValue()));
		}
	}

	@Test
	public void testReverseOther() {
		for(Map.Entry<String, String> entry : TEST_CASE_STR_ENTRIES.entrySet()) {
			assertTrue(StringReverser.reverseArray(entry.getKey()).equals(entry.getValue()));
		}
	}

	@Test
	public void testReverseStack() {
		for(Map.Entry<String, String> entry : TEST_CASE_STR_ENTRIES.entrySet()) {
			assertTrue(StringReverser.reverseStack(entry.getKey()).equals(entry.getValue()));
		}
	}

	@Test
	public void testReverseList() {
		for(Map.Entry<String, String> entry : TEST_CASE_STR_ENTRIES.entrySet()) {
			assertTrue(StringReverser.reverseList(entry.getKey()).equals(entry.getValue()));
		}
	}
}