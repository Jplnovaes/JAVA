package exercicioLPC;

import java.util.ArrayList;
import java.util.List;

public class Alunos {

	List<Aluno> alunos = new ArrayList<>();

	public void aaddAluno(Aluno a) {
		alunos.add(a);
	}

	public void mostrarAlunos() {
		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}
	}
}
