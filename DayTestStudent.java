import org.junit.Test;
import static org.junit.Assert.*;

public class DayTestStudent {

    @Test
    public void testDayEnum() {
        // Test that the values of the enum are correct
        assertEquals("MONDAY", Day.MONDAY.name());
        assertEquals("TUESDAY", Day.TUESDAY.name());
        assertEquals("WEDNESDAY", Day.WEDNESDAY.name());
        assertEquals("THURSDAY", Day.THURSDAY.name());
        assertEquals("FRIDAY", Day.FRIDAY.name());
        assertEquals("SATURDAY", Day.SATURDAY.name());
        assertEquals("SUNDAY", Day.SUNDAY.name());

        // Test that the values can be compared to each other
        assertTrue(Day.MONDAY.compareTo(Day.TUESDAY) < 0);
        assertTrue(Day.WEDNESDAY.compareTo(Day.THURSDAY) < 0);
        assertTrue(Day.FRIDAY.compareTo(Day.SATURDAY) < 0);
        assertTrue(Day.SATURDAY.compareTo(Day.SUNDAY) < 0);
        assertTrue(Day.SUNDAY.compareTo(Day.MONDAY) > 0);
    }
}
