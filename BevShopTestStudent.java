import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BevShopTestStudent {
    BevShop bevShop;

    @Before
    public void setUp() {
        bevShop = new BevShop() {

			@Override
			public boolean isValidTime(int time) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public int getMaxNumOfFruits() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEligibleForMore() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean isValidAge(int age) {
				// TODO Auto-generated method stub
				return false;
			}
            // Implement abstract methods here if needed
        };
    }

    @Test
    public void testValidTime() {
        assertTrue(bevShop.validTime(10)); // Time within valid range
        assertFalse(bevShop.validTime(5)); // Time below valid range
        assertFalse(bevShop.validTime(24)); // Time above valid range
    }

    @Test
    public void testValidAge() {
        assertTrue(bevShop.validAge(21)); // Age above minimum age for alcohol
        assertFalse(bevShop.validAge(18)); // Age below minimum age for alcohol
    }

    @Test
    public void testEligibleForMore() {
        bevShop.processAlcoholOrder("Beer", Size.MEDIUM);
        bevShop.processAlcoholOrder("Wine", Size.SMALL);
        assertTrue(bevShop.eligibleForMore()); // Order has less than 3 alcohol drinks
        bevShop.processAlcoholOrder("Vodka", Size.LARGE);
        assertFalse(bevShop.eligibleForMore()); // Order has 3 alcohol drinks
    }


    @Test
    public void testIsMaxFruit() {
        assertFalse(bevShop.isMaxFruit(3)); // Number of fruits within max limit
        assertTrue(bevShop.isMaxFruit(5)); // Number of fruits exceeds max limit
    }

    @Test
    public void testStartNewOrder() {
        bevShop.startNewOrder(11, Day.MONDAY, "John Doe", 25);
        assertEquals(1, bevShop.totalNumOfMonthlyOrders()); // New order added
        assertEquals(0, bevShop.getNumOfAlcoholDrink()); // No alcohol drinks in new order
    }

    @Test
    public void testProcessCoffeeOrder() {
        bevShop.startNewOrder(11, Day.MONDAY, "John Doe", 25);
        bevShop.processCoffeeOrder("Latte", Size.MEDIUM, true, false);
        Order order = bevShop.getOrderAtIndex(0);
        assertEquals(1, order.getBeverages().size()); // New coffee order added to current order
    }

    @Test
    public void testProcessSmoothieOrder() {
        bevShop.startNewOrder(11, Day.MONDAY, "John Doe", 25);
        bevShop.processSmoothieOrder("Berry Blast", Size.LARGE, 3, true);
        Order order = bevShop.getOrderAtIndex(0);
        assertEquals(1, order.getBeverages().size()); // New smoothie order added to current order
    }

    @Test
    public void testProcessAlcoholOrder() {
        bevShop.startNewOrder(11, Day.MONDAY, "John Doe", 25);
        bevShop.processAlcoholOrder("Beer", Size.MEDIUM);
        Order order = bevShop.getOrderAtIndex(0);
        assertEquals(1, order.getBeverages().size()); // New alcohol order added to current order
        assertEquals(1, bevShop.getNumOfAlcoholDrink()); // One alcohol drink in current order
    }

}

        
