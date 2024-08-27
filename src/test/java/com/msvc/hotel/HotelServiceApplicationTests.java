package com.msvc.hotel;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HotelServiceApplicationTests {

	@Test
	void contextLoads() {
		int expected = 10;
		int actual = 5 + 5;
		assertEquals(expected, actual, "El resultado debe ser 10");
	}

}
