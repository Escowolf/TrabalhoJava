package trabalho;

import java.util.ArrayList;
import java.util.ListIterator;

public class TurmaNew {
	protected String nomeTurma;
	protected int numEstudantes;
	protected Estudante e;
	protected ArrayList<Estudante> alunos = new ArrayList<Estudante>();

	public TurmaNew(String nomeTurma) {//Constructor
		this.nomeTurma = nomeTurma;
	}
	
	public void matricular (Estudante e) {//inclui estudante na turma;
			alunos.add(e);
			System.out.println("Aluno matriculado com sucesso!");
			System.out.println(""); //linha em branco para dar espaço
		}
	
	/*public void listar(ArrayList<Estudante> e){
		for(int i = 0; i< e.size(); i++){
			System.out.println(e.get(i).nome);
		}
	}*/
	
	void listar(){// - apresenta estudantes matriculados na turma
		 ListIterator<Estudante> it = alunos.listIterator();
		 while (it.hasNext()) {
			 e = it.next();
			System.out.println("Estudante: " + e.nome);
			}
	} 
	
	Estudante pesquisar (int matricula) {//– procura no array o estudante de matrícula igual ao parâmetro passado e o retorna;
		ListIterator<Estudante> it = alunos.listIterator();
		while (it.hasNext()) {
			 e = it.next();
			 if (e.matricula == matricula) {
				 	System.out.println("Pesquisa estudante: "+e.nome+" Matrícula: "+e.matricula);
			 }
			}
		return e;	
	} 
	
	void trancar (int matricula) {// – exclui estudante da turma;
		ListIterator<Estudante> it = alunos.listIterator();
		while (it.hasNext()) {
			 e = it.next();
			 if (e.matricula == matricula) {
				 alunos.remove(e);
				 System.out.println("Aluno "+e.nome+" removido com sucesso!");
				 break;
			 }
		}
	}
	
	void trancar (Estudante e) {//Sobrecarga!
		ListIterator<Estudante> it = alunos.listIterator();
		while (it.hasNext()) {
			Estudante aluno = it.next();
			 if (aluno == e) {
				 alunos.remove(e);
				 System.out.println("Aluno "+e.nome+" removido com sucesso!");
				 break;
			 }
		}
	}
}