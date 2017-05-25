package com.shigeharu.date.format;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testSayHello() {
		HelloWorld hello = new HelloWorld();
		String result = hello.sayHello();
		assertEquals("結果", "Hello Maven", result);
	}

}
