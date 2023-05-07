import org.junit.Test;
import static org.junit.Assert.*;

public class TypeTestStudent {

    @Test
    public void testEnumValues() {
        assertNotNull(Type.COFFEE);
        assertEquals("COFFEE", Type.COFFEE.name());
        
        assertNotNull(Type.SMOOTHIE);
        assertEquals("SMOOTHIE", Type.SMOOTHIE.name());
        
        assertNotNull(Type.ALCOHOL);
        assertEquals("ALCOHOL", Type.ALCOHOL.name());
    }
}
