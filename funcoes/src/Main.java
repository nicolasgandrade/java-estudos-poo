
public class Main {

	public static void main(String[] args) {

		/** SIntaxe de funções: */
		
		int a = 4;
		int b = 8;
		int c = 3;
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		} 
		else if (y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		
		return aux;
		
	}
	
	public static void showResult(int x) {
		System.out.println(x);
	}
	
}
