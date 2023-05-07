import org.junit.Test;
import static org.junit.Assert.*;

public class AlcoholTestStudent {
    
    @Test
    public void testCalcPrice() {
        Alcohol a1 = new Alcohol("Beer", Size.MEDIUM, true);
        assertEquals(5.99 + 0.5 + 0.6, a1.calcPrice(), 0.01);
        
        Alcohol a2 = new Alcohol("Wine", Size.LARGE, false);
        assertEquals(8.99 + 2 * 0.75, a2.calcPrice(), 0.01);
    }
    
    @Test
    public void testEquals() {
        Alcohol a1 = new Alcohol("Beer", Size.MEDIUM, true);
        Alcohol a2 = new Alcohol("Beer", Size.MEDIUM, true);
        assertTrue(a1.equals(a2));
        
        Alcohol a3 = new Alcohol("Beer", Size.MEDIUM, false);
        assertFalse(a1.equals(a3));
    }
}
