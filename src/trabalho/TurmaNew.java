package trabalho;

import java.util.ArrayList;
import java.util.Iterator;

public class TurmaNew {
	protected String nomeTurma;
	protected int numEstudantes;
	protected Estudante e;
	ArrayList<Estudante> alunos = new ArrayList<Estudante>();
	Iterator<Estudante> i = alunos.iterator();

	public TurmaNew(String nomeTurma) {//Constructor
		this.nomeTurma = nomeTurma;
	}
	
	public void matricular (Estudante e) {//inclui estudante na turma;
			alunos.add(e);
			numEstudantes++; //soma 1 estudante cada vez que o método é chamado
			System.out.println("Aluno matriculado com sucesso!");
			System.out.println(""); //linha em branco para dar espaço
		}
		
	Estudante pesquisar (int matricula) {//– procura no array o estudante de matrícula igual ao parâmetro passado e o retorna;
		for (int i = 0; i < alunos.size(); i++) {
		    if(alunos.get(i).matricula == matricula) { 
		    	String e = alunos.get(i).nome;
		    	System.out.println("Pesquisa estudante: "+e+" Matrícula: "+alunos.get(i).matricula);
		    }
		}
		return e;	
	} 
	
	void trancar (int matricula) {// – exclui estudante da turma;
		
	}
	
	void listar(){// - apresenta estudantes matriculados na turma
		
	} //– mostra os dados de todos os estudantes da turma;
	
	void trancar (Estudante e) {//Sobrecarga!
	
}}