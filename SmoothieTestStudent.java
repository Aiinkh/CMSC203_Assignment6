import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SmoothieTestStudent {
    
    private Smoothie smoothie;
    
    @Before
    public void setUp() {
        smoothie = new Smoothie("Fruit Smoothie", Size.MEDIUM, 3, true);
    }
    
    @Test
    public void testCalcPrice() {
        assertEquals(5.5, smoothie.calcPrice(), 0.001);
        smoothie.setSize(Size.SMALL);
        assertEquals(4.0, smoothie.calcPrice(), 0.001);
        smoothie.setSize(Size.LARGE);
        assertEquals(7.0, smoothie.calcPrice(), 0.001);
        smoothie.setNumOfFruits(5);
        assertEquals(8.5, smoothie.calcPrice(), 0.001);
        smoothie.setProteinPowder(false);
        assertEquals(7.0, smoothie.calcPrice(), 0.001);
    }
    
    @Test
    public void testToString() {
        assertEquals("Fruit Smoothie, MEDIUM 3 Fruits Protein powder, $5.5", smoothie.toString());
        smoothie.setSize(Size.SMALL);
        assertEquals("Fruit Smoothie, SMALL 3 Fruits Protein powder, $4.0", smoothie.toString());
        smoothie.setSize(Size.LARGE);
        assertEquals("Fruit Smoothie, LARGE 3 Fruits Protein powder, $7.0", smoothie.toString());
        smoothie.setNumOfFruits(5);
        assertEquals("Fruit Smoothie, LARGE 5 Fruits Protein powder, $8.5", smoothie.toString());
        smoothie.setProteinPowder(false);
        assertEquals("Fruit Smoothie, LARGE 5 Fruits, $7.0", smoothie.toString());
    }
    
    @Test
    public void testEquals() {
        Smoothie s1 = new Smoothie("Fruit Smoothie", Size.MEDIUM, 3, true);
        Smoothie s2 = new Smoothie("Fruit Smoothie", Size.MEDIUM, 3, true);
        Smoothie s3 = new Smoothie("Berry Blast", Size.LARGE, 5, false);
        assertTrue(smoothie.equals(s1));
        assertTrue(smoothie.equals(s2));
        assertFalse(smoothie.equals(s3));
    }
    
    @Test
    public void testGettersAndSetters() {
        assertEquals(3, smoothie.getNumOfFruits());
        assertTrue(smoothie.getAddProtien());
        smoothie.setNumOfFruits(5);
        assertFalse(smoothie.getAddProtien());
        assertEquals(5, smoothie.getNumOfFruits());
        smoothie.setProteinPowder(true);
        assertTrue(smoothie.getAddProtien());
        assertEquals(0.5, smoothie.getFruitCost(), 0.001);
        assertEquals(1.5, smoothie.getProteinCost(), 0.001);
    }
}
