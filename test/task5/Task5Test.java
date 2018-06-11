package task5;

import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class Task5Test {
    
    
    @Test
    public void testTest() {
	int a= 2;
	int b= 1;
	int c= 1;
	boolean result = true;
	Ttiangle tr= new Ttiangle();
	if(tr.isTtiangle(a,b,c)!= result){
	    Assert.fail();
	}
    }

   
    
}
