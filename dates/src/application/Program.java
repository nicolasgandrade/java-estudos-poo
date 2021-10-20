package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		//Especifica que o horário é de greenwich;
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date x1 = new Date(); //Essa notação retorna a data atual;
		Date x2 = new Date(System.currentTimeMillis()); //Essa também;

		Date a1 = new Date(0L); //Data que recebe 0 milisegundos, ou seja, mostra
		//a data definida pela oracle como primeira data (1970);
		//Como o PC tá com o horário de SP, ele tira 3 horas;
		
		//Para mostrar 5 horas da manhã daquele dia, por exemplo, coloca-se o eq. em milis.
		Date a2 = new Date(1000L * 60L * 60L * 5L);//3 horas a menos pq estamos em SP;
		
		Date y1 = sdf1.parse("26/06/2004");
		Date y2 = sdf2.parse("26/06/2021 16:26:00");

		System.out.println(y1);
		System.out.println(sdf2.format(y1));
		System.out.println(sdf2.format(y2));
		System.out.println(sdf2.format(x1));
		System.out.println(sdf2.format(x2));
		System.out.println(sdf2.format(a1));
		System.out.println(sdf2.format(a2));
		System.out.println("----------------------------------");
		System.out.println(y1);
		System.out.println(sdf3.format(y1));
		System.out.println(sdf3.format(y2));
		System.out.println(sdf3.format(x1));
		System.out.println(sdf3.format(x2));
		System.out.println(sdf3.format(a1));
		System.out.println(sdf3.format(a2));
		
		
		//Padrão ISO 8601 e classe Instant:
		Date y3 = Date.from(Instant.parse("2021-06-26T16:48:42Z"));
		//O T representa Time, e o Z evidencia que é uma data no padrão UTC;
		
		//Perceba que ainda assim imprimirá 3 horas a menos por conta do horário da máquina;
		System.out.println(sdf2.format(y3));
		
		
		
	}

}
