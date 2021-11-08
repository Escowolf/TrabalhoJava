package trabalho;

import java.util.ArrayList;
import java.util.ListIterator;

public class TurmaNew {
	protected String nomeTurma;
	protected int numEstudantes;
	protected Estudante e;
	protected ArrayList<Estudante> alunos = new ArrayList<Estudante>();
	int i = 0;

	public TurmaNew(String nomeTurma) {//Constructor
		this.nomeTurma = nomeTurma;
	}
	
	public void matricular (Estudante e) {//inclui estudante na turma;
			alunos.add(e);
			System.out.println("Aluno matriculado com sucesso!");
			System.out.println(""); //linha em branco para dar espaço
		}
	
	void listar(){// - apresenta estudantes matriculados na turma
		 ListIterator<Estudante> it = alunos.listIterator();
		 while (it.hasNext()) {
			 e = it.next();
			System.out.println("Estudante: " + e.nome);
			}
	} //– mostra os dados de todos os estudantes da turma;
	
	Estudante pesquisar (int matricula) {//– procura no array o estudante de matrícula igual ao parâmetro passado e o retorna;
		while(it.hashCode()!=matricula) {
			  i++;
		}
	  	e = alunos.get(i);
	 	System.out.println("Pesquisa estudante: "+alunos.get(i).nome+" Matrícula: "+alunos.get(i).matricula);
		return e;	
	} 
	
	void trancar (int matricula) {// – exclui estudante da turma;

		/*for (int i = 0; i < alunos.size(); i++) {
		    if(alunos.get(i).matricula == matricula) { 
		    	  //remove o i-ésimo contato da agenda
		    	  alunos.remove(i);
		    	  System.out.println("Aluno "+alunos.get(i).nome+" removido com sucesso!");
		    	}
		    }*/
	}
	
	void trancar (Estudante e) {//Sobrecarga!
		while (it.hasNext()) {//uso de iterator
			if (it == e) {
				it.remove();
			}
			++i;
			}
	}
}