package com.algorithm.question1.mark;

import org.junit.Assert;
import org.junit.Test;

import com.algorithm.question1.mark.ReverseSentence;

public class Test_ReverseSentence {
	public ReverseSentence reverseSentence = new ReverseSentence();
	
	@Test
	public void reverseSentence_input_null() {
		// setup
		String input = null;
		
		// execute
		String result = this.reverseSentence.reverseString(input);
		
		// verify
		Assert.assertEquals(null, result);
	}
	
	@Test
	public void reverseSentence_input_one_size_input() {
		// setup
		String input = "a";
		
		// execute
		String result = this.reverseSentence.reverseString(input);
		
		// verify
		Assert.assertEquals("a", result);
	}
	
	@Test
	public void reverseSentence_input_one_size_input_whiteSpace() {
		// setup
		String input = " ";
		
		// execute
		String result = this.reverseSentence.reverseString(input);
		
		// verify
		Assert.assertEquals(" ", result);
	}
	
	@Test
	public void reverseSentence_input_one_whiteSpace() {
		// setup
		String input = " a";
		
		// execute
		String result = this.reverseSentence.reverseString(input);
		
		// verify
		Assert.assertEquals("a ", result);
	}
	
	@Test
	public void reverseSentence_input_whiteSpace() {
		// setup
		String input = "a c";
		
		// execute
		String result = this.reverseSentence.reverseString(input);
		
		// verify
		Assert.assertEquals("c a", result);
	}
	
	@Test
	public void reverseSentence_input_readMe() {
		// setup
		String input = "Algorithm are awesome!"; 
		
		// execute
		String result = this.reverseSentence.reverseString(input);
		
		// verify
		Assert.assertEquals("awesome! are Algorithm", result);
	}
}
