package com.shigeharu.date.format;

import static org.junit.Assert.*;

import java.lang.reflect.Method;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HelloWorldTest {

	private static ArrayList<String> arrMethod = new ArrayList<String>();
	private static int count = 0;
	HelloWorld hello = new HelloWorld();
	{
		Method[] methods = HelloWorldTest.class.getMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			String strMethod = method.getName();
			if (strMethod.startsWith("test")) {
				arrMethod.add(strMethod);
			}
		}
	}
	@Before
	public void startTest() {
		System.out.println("Method: " + arrMethod.get(count) + " start!!");
	}
	@Test
	public void testSayHello_001() {
		String test = "Hello Maven";
		String result = hello.sayHello(test);
		assertEquals("結果1", test, result);
		System.out.println("OK!");
	}
	@Test
	public void testSayHello_002() {
		String test = "Hello World";
		String result = hello.sayHello(test);
		assertEquals("結果2", test, result);
		System.out.println("OK!");
	}
	@After
	public void endTest() {
		System.out.println("Method: " + arrMethod.get(count) + " end!!");
		count++;
	}

}
