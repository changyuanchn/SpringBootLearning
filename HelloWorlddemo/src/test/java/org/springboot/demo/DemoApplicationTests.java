package org.springboot.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springboot.demo.controller.HelloWorldController;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void testHi() {
		assertEquals("Hello World", new HelloWorldController().hi());
	}

}
