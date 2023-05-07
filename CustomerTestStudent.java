import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CustomerTestStudent {

    private Customer customer;

    @Before
    public void setUp() {
        customer = new Customer("John Doe", 25);
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", customer.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(25, customer.getAge());
    }

    @Test
    public void testSetName() {
        customer.setName("Jane Doe");
        assertEquals("Jane Doe", customer.getName());
    }

    @Test
    public void testSetAge() {
        customer.setAge(30);
        assertEquals(30, customer.getAge());
    }

    @Test
    public void testToString() {
        assertEquals("John Doe, 25y/o", customer.toString());
    }

    @Test
    public void testCopyConstructor() {
        Customer copiedCustomer = new Customer(customer);
        assertEquals(customer.getName(), copiedCustomer.getName());
        assertEquals(customer.getAge(), copiedCustomer.getAge());
    }
}
