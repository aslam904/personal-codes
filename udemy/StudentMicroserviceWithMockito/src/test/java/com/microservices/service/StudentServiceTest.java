package com.microservices.service;

import org.junit.Test;
import org.mockito.Mockito;

public class StudentServiceTest {
	
	StudentService ss=Mockito.mock(StudentService.class);
	
	@Test
	public void setup() {
		Mockito.doNothing().when(ss).add(23, 55);

	}
	
	
}
