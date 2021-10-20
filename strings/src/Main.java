
public class Main {

	public static void main(String[] args) {

		//Formatação de strings:
		
		String original = "ahdhc aGYS jd Adjf DFDA   ";

		String s1 = original.toLowerCase();
		String s2 = original.toUpperCase();
		String s3 = original.trim();
		String s4 = original.substring(7);
		String s5 = original.substring(7, 12);
		
		System.out.printf("%s%n %s%n %s%n %s%n %s%n", s1, s2, s3, s4, s5);
	
	}
}