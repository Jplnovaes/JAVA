package exercicioLPC;

public class teste {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno(13, "João Paulo");
		Aluno a2 = new Aluno(68, "Luscas Alves");
		Aluno a3 = new Aluno(42, "Mero Cavalcanti");
		Aluno a4 = new Aluno(22, "Bruno Cato");
		Aluno a5 = new Aluno(28, "Roberto Novaes");
		Aluno a6 = new Aluno(35, "Pablo Silva");
		
		
		//--------->ADICIONANDO ALUNOS NA ARRAY <-------
		
		Alunos lista = new Alunos();
		lista.aaddAluno(a1);
		lista.aaddAluno(a2);
		lista.aaddAluno(a3);
		lista.aaddAluno(a4);
		lista.mostrarAlunos();
		System.out.println("======================================");
		lista.aaddAluno(a5);
		lista.aaddAluno(a6);
		lista.mostrarAlunos();
	
	}

}
