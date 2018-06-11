/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task8;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maksim
 */
public class TestTest {
    
    

    
    @Test
    public void testFib() {
       int n=3;
	int i=2 ;
	assertEquals(i,Task8.Test.fib(n));
    }
@Test
    public void testFib1() {
       int n=10;
	int i=55 ;
	assertEquals(i,Task8.Test.fib(n));
    }
    
}
