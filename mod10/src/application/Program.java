package application;
import java.util.Scanner;
import java.util.Locale;


public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media =7;
		int flag = 0;
		int contador = 1;
		
		while(flag != 1) {
			System.out.println("Digite a nota do aluno " + contador +":");
			double nota = sc.nextDouble();
			if(nota >= media) {
				System.out.println("ALUNO PASSOU.");
			}
			else {
				if(nota >= 5) {
					System.out.println("ALUNO RECUPERACAO .");
				}
				else{
					System.out.println("ALUNO REPROVADO");
				}
			}
			System.out.println("Deseja continuar o programa? [0] sim [1] nao");
			flag = sc.nextInt();
			contador += 1;
		}
		System.out.println("Programa Encerrado");
		
		sc.close();

	}

}
