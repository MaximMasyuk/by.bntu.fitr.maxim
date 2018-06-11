/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task6;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author student
 */
public class TestTest {
    
   
    @Test
    public void testTest() {
	int a = 21;
	int b = 2;
	int c = 2;
	assertEquals(a,Task6.Test.test(a, b, c));
    }
@Test
    public void testTest1() {
	int a = 2;
	int b = 21;
	int c = 3;
	assertEquals(b,Task6.Test.test(a, b, c));
    }
    @Test
    public void testTest3() {
	int a = 2;
	int b = 4;
	int c = 12;
	assertEquals(c,Task6.Test.test(a, b, c));
    }
    
    
}
