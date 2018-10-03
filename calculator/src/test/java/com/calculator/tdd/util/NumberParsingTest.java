package com.calculator.tdd.util;

import org.junit.Test;

public class NumberParsingTest {


	@Test(expected = NumberFormatException.class)
	public void testNumberFormatExceptionWithNumberInString() {
		NumberParser.parse("12ss");
	}
	
	@Test(expected = NumberFormatException.class)
	public void testNumberFormatExceptionWithoutNumberInString() {
		NumberParser.parse("test");
	}
	
	@Test
	public void testParseNumberforAddOperation() {
		NumberParser.parseComplexString("12+24");
	}
	
	@Test
	public void testParseSingleIntNumber( ) {
		
	}
}
