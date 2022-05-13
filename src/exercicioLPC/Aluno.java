package exercicioLPC;

public class Aluno {

	private int mat;
	private String nome;

	
	public Aluno(int mat, String nome) {
		super();
		this.mat = mat;
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	@Override
	public String toString() {
		return "Aluno [Mat: " + mat + ", Nome: " + nome + "]";
	}
	
	
}
