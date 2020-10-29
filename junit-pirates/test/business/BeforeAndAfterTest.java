package business;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAndAfterTest {

	@Test
	public void test1() {
		System.out.println("test1");
		assertTrue(true);
	}
	@Test
	public void test2() {
		System.out.println("test2");
		assertTrue(true);
	}
	@Test
	public void test3() {
		System.out.println("test3");
		assertTrue(true);
	}	
	//before test
		@Before
		public void beforeTest() {
		System.out.println("B4");
		assertTrue(true);
		
}
	//after test
		@After
		public void afterTest() {
		System.out.println("aftr");
		assertTrue(true);
		}
		//before and after test
		@BeforeClass
		public static void beforeAndAfterTest() {
		System.out.println("B4 Class");
		assertTrue(true);
				
		}
					
		}
