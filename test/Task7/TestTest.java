
package Task7;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestTest {
    
   

    @Test
    public void testTest() {
	int i=3;
	String n= "Весна";
	assertEquals(n,Task7.Test.test(i));
         }
 @Test
    public void testTest1() {
	int i=1;
	String n= "Зима";
	assertEquals(n,Task7.Test.test(i));
         }
   
    @Test
    public void testTest2() {
	int i=7;
	String n= "Лето";
	assertEquals(n,Task7.Test.test(i));
         }
    @Test
    public void testTest3() {
	int i=9;
	String n= "Осень";
	assertEquals(n,Task7.Test.test(i));
         }
}
