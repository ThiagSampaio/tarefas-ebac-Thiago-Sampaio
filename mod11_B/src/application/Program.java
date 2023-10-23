package application;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite [NOME]-[SEXO] separados por ','(EX Eduarda-F,thiago-M): ");
		String listaNomes = sc.nextLine();
		List<String> masculina  = new ArrayList<>();
		List<String> feminina = new ArrayList<>();
		
		if(listaNomes.contains(";")||listaNomes.contains(":")||listaNomes.contains("/")) {
			System.out.println("Uso de operador não autorizado");
		}
		else {
			 listaNomes = listaNomes.replaceAll("\\s", "");
			 String[]nomesSexo = listaNomes.split(",");
			 for(int i=0; i<nomesSexo.length; i++) {
				 if (nomesSexo[i].contains("-M")) {
					 String nameM =  nomesSexo[i].substring(0,nomesSexo[i].indexOf("-"));
					 masculina.add(nameM);
				 }
				 else {
					 String nameF =  nomesSexo[i].substring(0,nomesSexo[i].indexOf("-"));
					 feminina.add(nameF);
				 }
			 }
			 System.out.println("A lista masculina: ");
			 if(masculina.size() == 0) {
				 System.out.println("A lista masculina não possui cadastro");
			 }
			 else {
				 for(String x : masculina) {
					 System.out.println(x);
				 }
			 }
	
			 System.out.println("A lista feminina: ");
			 if(feminina.size() == 0) {
				 System.out.println("A lista feminina não possui cadastro");
			 }
			 else{
				 for(String y : feminina) {
					 System.out.println(y);
				 }
			 }
				 
			 

		}
		sc.close();

	}

}
