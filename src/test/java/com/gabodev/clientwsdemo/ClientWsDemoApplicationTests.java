package com.gabodev.clientwsdemo;

import com.gabodev.clientwsdemo.numberClient.NumberClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@SpringBootTest
class ClientWsDemoApplicationTests {

	@Autowired
	private Jaxb2Marshaller marshaller;

	@Test
	public void testGetNumberToDollarsConverter() {
		NumberClient numberClient = new NumberClient();
		numberClient.setMarshaller(marshaller);
		numberClient.setUnmarshaller(marshaller);
	}

	@Test
	public void testGetNumberToWordsConverter() {
		NumberClient numberClient = new NumberClient();
		numberClient.setMarshaller(marshaller);
		numberClient.setUnmarshaller(marshaller);
	}
}