package org.LpDql.MonExam.Exam;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestMyClass {

	MyClass str;
    MyClass service = Mockito.mock(MyClass.class);

    
    @Before
    public void setUp(){
        this.str = new MyClass();
    }   

	@After
	public void tearDown() throws Exception {
	}

	 
    
    @Test
    public void test() {
        assertEquals("Hello World!", str.hello());
        when(service.hello()).thenReturn("Hello World!");
        assertEquals("Hello World!", service.hello());
        verify(service).hello();
        verify(service,times(1)).hello();
    }

}
