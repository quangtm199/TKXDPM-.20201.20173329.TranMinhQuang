package controller;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import controller.PlaceOrderController;

class ValidatePhoneNumberTest {
		private PlaceOrderController placeOrderController;
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	
	@ParameterizedTest
	@CsvSource({
		
		"0912321232,true",
		"0123456789,true",
		"0123456789,true",
		"asd123,false",
		"123456798a,false"
	})
	
	@Test
	 void test(String phone,boolean expected) {
		//when
		boolean isValided=placeOrderController.validatePhoneNumber(phone);
		//then
		assertEquals(expected,isValided);
	}

}
