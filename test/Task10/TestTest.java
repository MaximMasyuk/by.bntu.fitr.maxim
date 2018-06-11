package Task10;


import org.junit.Test;
import static org.junit.Assert.*;


public class TestTest {
    
  
    @Test
    public void testSort() {
         int[] arr  = {3,55,6,1,99,100};
         
         arr = Task10.Test.sort(arr);
         assertArrayEquals(arr,arr);
    }

    
}
