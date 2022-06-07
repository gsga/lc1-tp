import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TimeZone;

public class App {
    public static void main(String[] args) throws Exception {
        int anio, mes, dia;
        boolean flag = false;
        if (flag) {
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
        } else {
            anio = 2022;
            mes = 1;
            dia = 3;
        }

        String letraDia = "";
        TimeZone timezone = TimeZone.getDefault();
        Calendar calendar = new GregorianCalendar(timezone);
        calendar.set(anio, mes - 1, dia);
        int diaDeLaSemana = calendar.get(Calendar.DAY_OF_WEEK);
        // System.out.println(diaDeLaSemana);
        // int firstDOW = calendar.getFirstDayOfWeek();
        // System.out.println(firstDOW);
        // System.out.println(Calendar.SUNDAY);
        // System.out.println(Calendar.MONDAY);

        switch (diaDeLaSemana) {
            case 1:
                letraDia = "Dom";
                break;
            case 2:
                letraDia = "Lun";
                break;
            case 3:
                letraDia = "Mar";
                break;
            case 4:
                letraDia = "Mié";
                break;
            case 5:
                letraDia = "Jue";
                break;
            case 6:
                letraDia = "Vie";
                break;
            case 7:
                letraDia = "Sáb";
                break;
        }

        String nombreMes = "";
        switch (mes) {
            case 1:
                nombreMes = "enero";
                break;
            case 2:
                nombreMes = "febrero";
                break;
            case 3:
                nombreMes = "marzo";
                break;
            case 4:
                nombreMes = "abril";
                break;
            case 5:
                nombreMes = "mayo";
                break;
            case 6:
                nombreMes = "junio";
                break;
            case 7:
                nombreMes = "julio";
                break;
            case 8:
                nombreMes = "agosto";
                break;
            case 9:
                nombreMes = "septiembre";
                break;
            case 10:
                nombreMes = "octubre";
                break;
            case 11:
                nombreMes = "noviembre";
                break;
            case 12:
                nombreMes = "diciembre";
                break;
        }

        System.out.println(letraDia + ", " + dia
                + " de " + nombreMes + " de " + anio);
        int semanaDelAnio = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("Semana del año: " + semanaDelAnio);

        int minimalDaysInFirstWeek = calendar.getMinimalDaysInFirstWeek();
        System.out.println(minimalDaysInFirstWeek);
    }
}
