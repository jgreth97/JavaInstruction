package business;

import static org.junit.Assert.*;

import org.junit.Test;

public class PirateTest {

	@Test
	public void testPirateCreate() {
		Pirate p1 = new Pirate("Captain Hook");
		assertEquals("Captain Hook", p1.getName());
		assertEquals(4, p1.getLimbsRemaining());
		assertFalse(p1.isDead());
	}
	@Test
	public void testOctoPirateCreate() {
		Pirate p1 = new Pirate("OctoPirate",8);
		assertEquals(8, p1.getLimbsRemaining());
	}
	@Test(timeout =1000)
		public void testInfiniteLoop() {
		int i =0;
		while (true) {
			System.out.println(i+"Inf loop");
			i++;
		
		
		
		}
}
}