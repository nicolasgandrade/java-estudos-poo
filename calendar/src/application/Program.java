package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = Date.from(Instant.parse("2021-06-26T14:34:00Z"));
		
		System.out.println(sdf.format(d));
		
		//Iniciando o calendar
		Calendar cal = Calendar.getInstance();
		//Instanciando o calendário com a data requerida
		cal.setTime(d);
		
		//Adicionando tempo à data (4 horas)
		cal.add(Calendar.HOUR_OF_DAY, 4);
		
		//Atualizando a data d
		d = cal.getTime();
		System.out.println(sdf.format(d));
		
		//Capturando os minutos da data d:
		int minutes = cal.get(Calendar.MINUTE);
		System.out.println("Minutes: " + minutes);
		
		//Capturando o mês da data d:
		//ATENÇÃO: para o calendar, o mês comaça no valor 0, por isso, some +1;
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Month: " + month);

	}

}
