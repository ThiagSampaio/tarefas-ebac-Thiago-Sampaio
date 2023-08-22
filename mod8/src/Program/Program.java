package Program;
import java.util.Scanner;
import java.util.Locale;

import entities.Aluno;
public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Escreva o nome do aluno: ");
		String nomeAluno = sc.nextLine();
		System.out.print("Qual a nota n1: ");
		double n1 = sc.nextDouble();
		System.out.print("Qual a nota n2: ");
		double n2 = sc.nextDouble();
		System.out.print("Qual a nota n3: ");
		double n3 = sc.nextDouble();
		
		Aluno aluno = new Aluno(nomeAluno, n1, n2, n3);
		double media = aluno.media();
		
		System.out.println("A media é: " + media);
		
		
		sc.close();
		
		
		

	}

}
