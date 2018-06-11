/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Maksim
 */
public class TestTest {
    
    
    
   
    @Test
    public void testTest() {
        
        
        int i=3;
	String n= "Входит";
	assertEquals(n,Task9.Test.test(i));
    }
@Test
    public void testTest1() {
        
       int i=6;
	String n= "не Входит";
	assertEquals(n,Task9.Test.test(i));
    }
    
    
}
