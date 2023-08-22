package entities;

public class Aluno {
	private String aluno;
	private double n1;
	private double n2;
	private double n3;
	
	public Aluno(String aluno, double n1, double n2, double n3) {
		this.aluno = aluno;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}

	
	public double media(){
		double media = (n1 + n2 + n3) / 3;
		return media;
	}

	
}
