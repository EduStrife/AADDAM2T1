package booking;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import booking.ValidarBooking;
import booking.Sala;

public class test {

	public static void main(String[] args) throws ParseException {
		
		//int [][] horaLimpia = new int [4][2];
		//System.out.println(horaLimpia.length);//saca el 4
		
		//SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		//System.out.println(ValidarBooking.getDiaSemana(sdf.parse("2018-1-21")));
		
		System.out.println("dia");
		System.out.println(Sala.getDia(21, 01, 2018));
		
		System.out.println(Sala.getDay(21, 1, 2018));
		/*int mes, anyo, numDias = 0;
	    mes = 6;
	    anyo = 2018;
	    Calendar fecha = Calendar.getInstance();
	    fecha.set(anyo, mes, 0);
	    numDias = fecha.getActualMaximum(Calendar.DAY_OF_MONTH);
	    System.out.println("\nEl mes " + mes + " del a�o " + anyo + " tiene " + numDias + " d�as.");*/
		
		//Fecha actual en formato completo:
        //Tue Sep 23 01:18:48 CEST 2014
        /*Date fechaActual = new Date();
        System.out.println(fechaActual);
        System.out.println("---------------------------------------------");
        
        //Formateando la fecha:
        DateFormat formatoHora = new SimpleDateFormat("HH:mm:ss");
        DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Son las: "+formatoHora.format(fechaActual)+" de fecha: "+formatoFecha.format(fechaActual));
        
        //Fecha actual desglosada:
        Calendar fecha = Calendar.getInstance();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int hora = fecha.get(Calendar.HOUR_OF_DAY);
        int minuto = fecha.get(Calendar.MINUTE);
        int segundo = fecha.get(Calendar.SECOND);

        System.out.println("Fecha Actual: "+ dia + "/" + (mes) + "/" + año);
        System.out.printf("Hora Actual: %02d:%02d:%02d %n", hora, minuto, segundo);
        System.out.println("-------------Fecha desglosada----------------");
        System.out.println("El año es: "+ año);
        System.out.println("El mes es: "+ mes);
        System.out.println("El d�a es: "+ dia);
        System.out.printf("La hora es: %02d %n", hora);
        System.out.printf("El minuto es: %02d %n", minuto);
        System.out.printf("El segundo es: %02d %n", segundo);
		//*/
		
//		Sala sala1 = new Sala("string", 30);
		
	}

}
