package org.jacoco.examples.java.gradle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.*;


public class HelloWorldTest {

	private HelloWorld subject;

	@BeforeEach
	public void setup() {
		subject = new HelloWorld();
	}

    //@Disabled("Disable to reduce coverage - TESTING")	
	@Test
	public void testGetMessage() {
		assertEquals("Hello World!", subject.getMessage(false));
	}

    @Test
    public void testGetMessageBigger(){
        assertEquals("Hello Universe!", subject.getMessage(true));
    }   

    @Test
    public void testFail(){
        assertFalse(false);
    }
	
}
