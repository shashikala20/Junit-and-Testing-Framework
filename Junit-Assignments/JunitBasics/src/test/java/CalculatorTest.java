import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator cal = new Calculator();
		int expected = 3;
		int actual = cal.add(1, 2);
		assertEquals(expected, actual,"additioin test is completed");
		System.out.print("Addition test");
	}

}
