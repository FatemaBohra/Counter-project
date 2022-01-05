import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {
	
	Counter counter; //declares counter for testing

	@BeforeEach
	void setUp() throws Exception {
		this.counter = new Counter();//initialize counter before every test method.
	}

	@Test
	void testIncrement() {
		//calling the increment the first time should return 1
		assertTrue(this.counter.increment() == 1);
		
		//calling the increment again should return 2
		assertTrue(this.counter.increment() == 2);
		
		//call the increment the third time
		this.counter.increment();//not testing it this time
		
		assertFalse(this.counter.getCount() == 2, "should not return 2 after calling increment third time");
		
		//expects 3 when calling get count.
		assertEquals(3, this.counter.getCount());
		
		//calling the increment again should return 4 and not 3.
		assertNotEquals(3, this.counter.increment());
	}

	@Test
	void testDecrement() {
		//calling decrement first time should return -1.
		assertEquals(-1, this.counter.decrement());
		
		//calling decrement again should return -2.
		assertTrue(this.counter.decrement() == -2);
		
		//call decrement a third time
		this.counter.decrement();
		
		assertFalse(this.counter.getCount() == -2, "should not return -2 after calling increment third time");
		
		//calling get count should return to -3.
		assertTrue(this.counter.getCount() == -3);
	}

}
