package Testing;

import org.junit.*;

public class CalcTest {
	CalcFunctions calc;

	@Before
	public void setup() {
		calc = new CalcFunctions();
	}

	@Test
	public void calcTest0() {
		Assert.assertEquals(10, CalcFunctions.add(5, 5));
	}

	@Test
	public void calcTest1() {
		Assert.assertEquals(10, CalcFunctions.subtract(15, 5));
	}
	@Test
	public void calcTest2() {
		Assert.assertEquals(10, CalcFunctions.multi(2, 5));

	}
}