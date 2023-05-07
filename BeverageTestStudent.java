import org.junit.Test;
import static org.junit.Assert.*;

public class BeverageTestStudent {

    @Test
    public void testCalcPrice() {
        Beverage beverage = new Coffee("Latte", Size.MEDIUM, true, false);
        double price = beverage.calcPrice();
        assertEquals(4.0, price, 0.001);
    }

    @Test
    public void testToString() {
        Beverage beverage = new Smoothie("Mango", Size.LARGE, 0, true);
        String expected = "Mango, LARGE";
        assertEquals(expected, beverage.toString());
    }

    @Test
    public void testEquals() {
        Beverage beverage1 = new Alcohol("Vodka", Size.MEDIUM, true);
        Beverage beverage2 = new Alcohol("Vodka", Size.MEDIUM, true);
        assertTrue(beverage1.equals(beverage2));
    }

    @Test
    public void testGetBevName() {
        Beverage beverage = new Coffee("Cappuccino", Size.SMALL, false, false);
        String expected = "Cappuccino";
        assertEquals(expected, beverage.getBevName());
    }

    @Test
    public void testGetType() {
        Beverage beverage = new Smoothie("Strawberry Banana", Size.MEDIUM, 0, false);
        Type expected = Type.SMOOTHIE;
        assertEquals(expected, beverage.getType());
    }

    @Test
    public void testGetSize() {
        Beverage beverage = new Coffee("Americano", Size.LARGE, false, false);
        Size expected = Size.LARGE;
        assertEquals(expected, beverage.getSize());
    }

    @Test
    public void testGetBasePrice() {
        Beverage beverage = new Smoothie("Blueberry", Size.SMALL, 0, false);
        double expected = 2.0;
        assertEquals(expected, beverage.getBasePrice(), 0.001);
    }

    @Test
    public void testGetSizePrice() {
        Beverage beverage = new Coffee("Espresso", Size.SMALL, false, false);
        double expected = 1.0;
        assertEquals(expected, beverage.getSizePrice(), 0.001);
    }

    @Test
    public void testSetName() {
        Beverage beverage = new Alcohol("Whiskey", Size.MEDIUM, false);
        beverage.setName("Rum");
        String expected = "Rum";
        assertEquals(expected, beverage.getBevName());
    }

    @Test
    public void testSetType() {
        Beverage beverage = new Smoothie("Pineapple", Size.MEDIUM, 0, true);
        beverage.setType(Type.SMOOTHIE);
        Type expected = Type.SMOOTHIE;
        assertEquals(expected, beverage.getType());
    }

    @Test
    public void testSetSize() {
        Beverage beverage = new Coffee("Mocha", Size.SMALL, false, false);
        beverage.setSize(Size.MEDIUM);
        Size expected = Size.MEDIUM;
        assertEquals(expected, beverage.getSize());
    }

}
