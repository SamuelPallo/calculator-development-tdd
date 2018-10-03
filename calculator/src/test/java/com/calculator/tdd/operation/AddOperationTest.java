package com.calculator.tdd.operation;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class AddOperationTest {

	@Mock
	IOperation operation;
	
	
	@Test
	public void testStringParsing() {
		operation = Mockito.mock(AddOperation.class);
		
	}
}
