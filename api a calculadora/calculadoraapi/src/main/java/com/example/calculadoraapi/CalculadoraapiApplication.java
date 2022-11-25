package com.example.calculadoraapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@RequestMapping("/calculadora")
public class CalculadoraapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculadoraapiApplication.class, args);
	}

	calculadora objcalcu = new calculadora();

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	@GetMapping(value = "/calcular")
	public String calcular(@RequestParam(name = "a") Integer ainteger,
						   @RequestParam(name = "b") Integer binteger,
						   @RequestParam(name = "c") Integer cinteger,
						   @RequestParam(name = "operacion") Integer operacion) {
		int res = 0;
		int a = ainteger;
		int b = binteger;
		int c = cinteger;

		if(operacion == 1){
			res = objcalcu.sumar(a,b);
		}
		if(operacion == 2){
			res = objcalcu.restar(a,b);
		}
		if(operacion == 3){
			res = objcalcu.multiplicar(a,b);
		}
		if(operacion == 4){
			res = objcalcu.dividir(a,b);
		}

		String restring = "El resultado es: "+res;

		if(operacion == 5){
			float af = a;
			float bf = b;
			float cf = c;
			String resolvente1 = Float.toString(objcalcu.cuadratica1(af,bf,cf));
			String resolvente2 = Float.toString(objcalcu.cuadratica2(af,bf,cf));
 			restring = "Las raices son: {  "+ resolvente1 + " ; " + resolvente2 + "  }";
		}

		return restring;
	}
}
