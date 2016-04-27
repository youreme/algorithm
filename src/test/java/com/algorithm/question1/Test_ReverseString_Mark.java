package com.algorithm.question1;

import org.junit.Assert;
import org.junit.Test;

public class Test_ReverseString_Mark {
	public ReverseString_Mark reverseString_Mark = new ReverseString_Mark();
	
	@Test
	public void reverseString_input_null() {
		// setup
		String input = null;
		
		// execute
		String result = this.reverseString_Mark.reverseString(input);
		
		// verify
		Assert.assertEquals(null, result);
	}
	
	@Test
	public void revserseString_input_one_size_input() {
		// setup
		String input = "a";
		
		// execute
		String result = this.reverseString_Mark.reverseString(input);
		
		// verify
		Assert.assertEquals("a", result);
	}
	
	@Test
	public void revserseString_input_one_size_input_whiteSpace() {
		// setup
		String input = " ";
		
		// execute
		String result = this.reverseString_Mark.reverseString(input);
		
		// verify
		Assert.assertEquals(" ", result);
	}
	
	@Test
	public void reverseString_input_one_whiteSpace() {
		// setup
		String input = " a";
		
		// execute
		String result = this.reverseString_Mark.reverseString(input);
		
		// verify
		Assert.assertEquals("a ", result);
	}
	
	@Test
	public void reverseString_input_whiteSpace() {
		// setup
		String input = "a c";
		
		// execute
		String result = this.reverseString_Mark.reverseString(input);
		
		// verify
		Assert.assertEquals("c a", result);
	}
	
	@Test
	public void reverseString_input_readMe() {
		// setup
		String input = "Algorithm are awesome!"; 
		
		// execute
		String result = this.reverseString_Mark.reverseString(input);
		
		// verify
		Assert.assertEquals("awesome! are Algorithm", result);
	}
}
