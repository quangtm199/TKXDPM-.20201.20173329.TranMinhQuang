package controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateNameTest {
	private PlaceOrderController placeOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	@ParameterizedTest
	@CsvSource({
		
		"nguyenlm,true",
		"nguyen012349,true",
		"$#nguyen,false",
		"null,false",
		
	})
	@Test
	 void test(String name,boolean expected) {
		//when
		boolean isValided=placeOrderController.validateName(name);
		//then
		assertEquals(expected,isValided);
	}


}
