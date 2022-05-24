package tup.arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class ArraysApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArraysApplication.class, args);
	}

	@GetMapping("/copy")
	public String copy() {
		String msg = "";

		String[] copyFrom = {
				"Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
				"Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
				"Marocchino", "Ristretto" };

		String[] copyTo = new String[7];

		System.arraycopy(copyFrom, 4, copyTo, 0, 7);
		for (String coffee : copyTo) {
			msg += coffee + ", ";
		}

		return msg;
	}

	@GetMapping("/multi")
	public String multiDim() {
		String msg = "";

		String[][] names = {
				{ "Mr. ", "Mrs. ", "Ms. " },
				{ "Smith", "Jones" }
		};
		// Mr. Smith
		msg += names[0][0] + names[1][0] + "<br>";
		// Ms. Jones
		msg += names[0][2] + names[1][1];

		return msg;
	}

	@GetMapping("/")
	public String hola() {
		// declares an array of integers
		int[] anArray;

		// allocates memory for 10 integers
		anArray = new int[10];

		// initialize first element
		anArray[0] = 100;
		// initialize second element
		anArray[1] = 200;
		// and so forth
		anArray[2] = 300;
		anArray[3] = 400;
		anArray[4] = 500;
		anArray[5] = 600;
		anArray[6] = 700;
		anArray[7] = 800;
		anArray[8] = 900;
		anArray[9] = 1000;

		String msg = "";
		for (int i = 0; i < anArray.length; i++) {
			msg += "anArray[" + i + "]: " + anArray[i] + "<br>";
		}

		return msg;
	}
}
