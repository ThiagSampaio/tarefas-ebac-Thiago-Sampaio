package application;
import java.util.Scanner;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int condition = 1;
		while(condition ==1) {
			
			System.out.println("Digite nomes separados por ',': ");
			String listaNomes = sc.nextLine();
			
			
			if(listaNomes.contains("-") || listaNomes.contains(";")||listaNomes.contains(":")||listaNomes.contains("/")) {
				System.out.println("Uso de operador não autorizado");
			}
			else {
			 listaNomes = listaNomes.replaceAll("\\s", "");
			 String[]nomes = listaNomes.split(",");
			 Arrays.sort(nomes);
			 for(int i=0;i<nomes.length;i++) {
				 System.out.println(nomes[i]);
			 }
			}
			System.out.println("Deseja continuar o programa? (1) SIM , (-1) NÃO");
			int c = sc.nextInt();
			condition = c;
			sc.nextLine();
		}
		sc.close();
		
	}

}
