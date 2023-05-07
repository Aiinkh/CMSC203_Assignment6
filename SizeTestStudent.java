import org.junit.Test;
import static org.junit.Assert.*;

public class SizeTestStudent {

    @Test
    public void testGetAbbreviation() {
        assertEquals("S", Size.SMALL.getAbbreviation());
        assertEquals("M", Size.MEDIUM.getAbbreviation());
        assertEquals("L", Size.LARGE.getAbbreviation());
    }

    
}
