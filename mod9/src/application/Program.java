package application;

public class Program {

	public static void main(String[] args) {
		// Primeira forma 
		int x = 10;
		Integer y = x;
		
		System.out.println("O valor primitivo de x é: " + x);
		System.out.println("O Valor Wrapper de x é: " + y);
		
		// Casting
		
		int z = 15;
		Object obj = z;
		int w = (int)obj;
		
		System.out.println("O valor primitivo de z é: " + z);
		System.out.println("O Valor Object de z é: " + obj);
		System.out.println("O Valor Casting de z é: " + w);
	}

}
