package trabalho;

import java.util.ArrayList;

public class TurmaNew {
	protected String nomeTurma;
	protected int numEstudantes;
	protected Estudante e;
	ArrayList<Estudante> alunos = new ArrayList<Estudante>();
	
	public TurmaNew(String nomeTurma) {//Constructor
		this.nomeTurma = nomeTurma;
	}
	
	public void matricular (Estudante e) {//inclui estudante na turma;
			alunos.add(e);
			numEstudantes++; //soma 1 estudante cada vez que o m�todo � chamado
			System.out.println("Aluno matriculado com sucesso!");
			System.out.println(""); //linha em branco para dar espa�o
		}
		
	Estudante pesquisar (int matricula) {//� procura no array o estudante de matr�cula igual ao par�metro passado e o retorna;
		for (int i=0; i<alunos.size(); i++) {
			String e = "Posi��o %d- %s\n"+i+alunos.get(i);
	    }
		return e;	
	} 
	
	void trancar (int matricula) {// � exclui estudante da turma;
		
	}
	
	void listar(){// - apresenta estudantes matriculados na turma
		
	} //� mostra os dados de todos os estudantes da turma;
	
	void trancar (Estudante e) {//Sobrecarga!
	
}}