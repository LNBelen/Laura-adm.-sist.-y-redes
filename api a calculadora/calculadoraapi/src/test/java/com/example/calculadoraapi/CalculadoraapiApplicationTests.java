package com.example.calculadoraapi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class CalculadoraapiApplicationTests {
	CalculadoraapiApplication objcalcu = new CalculadoraapiApplication();


	@Test
	public void sumaTest(){
		assertEquals(objcalcu.calcular(82,88,0,1), "El resultado es: 170");
	}


	@Test
	public void divisionTest (){
		assertNotEquals(objcalcu.calcular(2,2,0,4), "El resultado es: 2");
	}

}
