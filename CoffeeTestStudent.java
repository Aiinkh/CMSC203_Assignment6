import org.junit.Test;
import static org.junit.Assert.*;

public class CoffeeTestStudent {
    
    @Test
    public void testCalcPrice() {
        Coffee coffee1 = new Coffee("Coffee 1", Size.SMALL, false, false);
        assertEquals(1.99, coffee1.calcPrice(), 0.001);
        
        Coffee coffee2 = new Coffee("Coffee 2", Size.MEDIUM, true, false);
        assertEquals(3.49, coffee2.calcPrice(), 0.001);
        
        Coffee coffee3 = new Coffee("Coffee 3", Size.LARGE, true, true);
        assertEquals(5.98, coffee3.calcPrice(), 0.001);
    }
    
    @Test
    public void testEquals() {
        Coffee coffee1 = new Coffee("Coffee 1", Size.SMALL, false, false);
        Coffee coffee2 = new Coffee("Coffee 2", Size.SMALL, false, false);
        Coffee coffee3 = new Coffee("Coffee 1", Size.SMALL, true, false);
        
        assertTrue(coffee1.equals(coffee2));
        assertFalse(coffee1.equals(coffee3));
    }
    
    
}
