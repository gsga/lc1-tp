package tup.tp5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tp5Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp5Application.class, args);
	}

	@GetMapping("/")
	public String hola() {

		String respuesta = "";

		String[] entradas = { "1", "2", "2", "7" };

		int cuantos = entradas.length;

		respuesta += "Cantidad de entradas: " + entradas.length;

		for (int i = 0; i < cuantos; i++) {
			respuesta += "<br> entrada[" + i + "]: " + entradas[i];
		}

		String anterior = entradas[0];

		for (int i = 1; i < cuantos; i++) {
			if (entradas[i].equals(anterior)) {
				respuesta += "Dos entradas seguidas iguales.";
			} else {
				anterior = entradas[i];
				respuesta += "<br> entradas distintas";

			}
		}

		long suma = 0L;
		double producto = 1;

		int prim = 20;
		int ulti = 100;

		for (int i = prim; i <= ulti; i++) {
			if (i % 2 == 0) {
				suma += i;
				producto *= i;
			}
		}

		respuesta = "Suma = " + suma + "<br>" + "Producto = " + producto;

		return respuesta;
	}

}
