package booking;
import log.EscrituraLog;
//
import java.util.Calendar;
//
public class Sala {

	String nombre;
	int[][] calendario;
	//private Peticion p = new Peticion();
	static int horaIn;
	static int horaFin;
	int [][] partes;
	//int [][] horaLimpia;

	public Sala(String nombre) {
		this.nombre = nombre;
		this.calendario = new int [30][24];
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int[][] getCalendario() {
		return calendario;
	}


	public void setCalendario(int[][] calendario) {
		this.calendario = calendario;
	}

	//d?as que tiene el mes
	public static int diasMes (int mes, int anyo) {
		int numDias = 0;
	    Calendar fecha = Calendar.getInstance();
	    fecha.set(anyo, mes, 0);
	    numDias = fecha.getActualMaximum(Calendar.DAY_OF_MONTH);
	    return numDias;
	}

	public void asignarLibre(boolean libre, int dia, int hora) {
		if (libre) calendario[dia-1][hora]=1;
		else EscrituraLog.escribir("mensaje de error al log");
	}
	public void asignarLibre2(int dia, int hora) {
		System.out.println(getCalendario().length);
		System.out.println(dia-1);
		System.out.println(hora);
		calendario[dia-1][hora]=1;
		System.out.println("Escrito: "+calendario[dia-1][hora]);
	}

	public boolean comprobarHorasLibres(int dia, int hora) {
		if (calendario[dia-1][hora]==0) {//-1 porque el array empieza desde el 0.
			System.out.println("hola");//TODO
			System.out.println(dia +" -------"+ hora);
			return true;//si est�libre, devuelvo true
		}
		else return false;
	}

}
