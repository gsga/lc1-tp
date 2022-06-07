import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class App {
    public static void main(String[] args) throws Exception {
        int anio, mes, dia;
        try (Scanner teclado = new Scanner(System.in)) {
            boolean valido = false;
            do {
                System.out.println("\nMes (1-12): ");
                mes = teclado.nextInt();
                if (mes > 0 && mes < 13) {
                    valido = true;
                }

            } while (!valido);

            valido = false;
            do {
                System.out.println("\nDía (1-31): ");
                dia = teclado.nextInt();
                if (mes == 2 && dia < 29) {
                    valido = true;
                } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia < 31) {
                    valido = true;
                } else if ((mes == 1 || mes == 3 || mes == 5
                        || mes == 7 || mes == 8 || mes == 10 ||
                        mes == 12) && dia < 32) {
                    valido = true;
                }
                if (dia < 1) {
                    valido = false;
                }
            } while (!valido);

            valido = false;
            do {
                System.out.println("Año: ");
                anio = teclado.nextInt();
                if ((anio == 1582 && (mes > 10 || (mes == 10 && dia > 14))) || anio > 1582) {
                    valido = true;
                }

            } while (!valido);
        }
        System.out.println(dia + "/" + mes + "/" + anio);

        // String letraD = "";
        // TimeZone timezone = TimeZone.getDefault();
        // Calendar calendar = new GregorianCalendar(timezone);
        // calendar.set(anio, mes - 1, dia);
        // int nD = calendar.get(Calendar.DAY_OF_WEEK);
        // System.out.println("result", "diaSemana: " + nD + " dia:" + dia + " mes:" +
        // mes + "año:" + anio);
        // switch (nD) {
        // case 1:
        // letraD = "D";
        // break;
        // case 2:
        // letraD = "L";
        // break;
        // case 3:
        // letraD = "M";
        // break;
        // case 4:
        // letraD = "X";
        // break;
        // case 5:
        // letraD = "J";
        // break;
        // case 6:
        // letraD = "V";
        // break;
        // case 7:
        // letraD = "S";
        // break;
        // }

    }
}
