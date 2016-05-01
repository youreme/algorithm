package com.algorithm.question1.javarouka;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 *
 * createdAt 2016. 5. 2.
 * @since 1.0
 * @author javarouka
 */
public class WordReverserTest {

	private static Map<String, String> TEST_CASE_STR_ENTRIES = new HashMap<String, String>();
	static {
		TEST_CASE_STR_ENTRIES.put("Algorithm are awesome!", "awesome! are Algorithm");
		TEST_CASE_STR_ENTRIES.put("Algorithm     are      awesome!", "awesome!      are     Algorithm");
		TEST_CASE_STR_ENTRIES.put("Algorithm     are      awesome! OK", "OK awesome!      are     Algorithm");
	}

	@Test
	public void testReverseWordByArray() throws Exception {
		for(Map.Entry<String, String> entry : TEST_CASE_STR_ENTRIES.entrySet()) {
			assertTrue(WordReverser.reverseWordByArray(entry.getKey()).equals(entry.getValue()));
		}
	}

	@Test
	public void testReverseWordByStack() throws Exception {
		for(Map.Entry<String, String> entry : TEST_CASE_STR_ENTRIES.entrySet()) {
			assertTrue(WordReverser.reverseWordByStack(entry.getKey()).equals(entry.getValue()));
		}
	}
}