/**
 * Represents a counter, with methods.
 * @author fatemabohra
 *
 */
public class Counter {
	
	//instance variable
	
	/**
	 * Stores internal count.
	 */
	int count;//default to 0
	
	//methods
	
	/**
	 * Increments internal count.
	 * @return new value of internal count
	 */
	public int increment() {
		this.count++;
		
		return this.count;
	}
	
	/**
	 * decrement internal count.
	 * @return new value of internal count
	 */
	public int decrement() {
		this.count--;
		
		return this.count;
	}	
	
	/**
	 * Returns the current value of count.
	 * @return the count
	 */
	
	public int getCount() {
		return this.count;
	}

}
