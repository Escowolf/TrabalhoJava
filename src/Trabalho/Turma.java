package Trabalho;

public class Turma {
	protected String nomeTurma;
	protected Estudante[] estudantesVetor = new Estudante[10]; //tipo de dado e nome da variável
	protected int numEstudantes;
	protected Estudante e;
	
	public Turma(String nomeTurma) {//Constructor
		this.nomeTurma = nomeTurma;
	}
	
	void matricular (Estudante e) {//inclui estudante na turma;
			estudantesVetor[numEstudantes] = e;
			numEstudantes++; //soma 1 estudante cada vez que o método é chamado
			System.out.println("Aluno matriculado com sucesso!");
			System.out.println(""); //linha em branco para dar espaço
		}
		
	Estudante pesquisar (int matricula) {//– procura no array o estudante de matrícula igual ao parâmetro passado e o retorna;
		for(int i = 0; i<numEstudantes; i++) {
			if(estudantesVetor[i].matricula == matricula) { 
		    	String e = estudantesVetor[i].nome;
		    	System.out.println("Pesquisa estudante: "+e+" Matrícula: "+estudantesVetor[i].matricula);
		    }
		}
		return e;	
	} 
	
	void trancar (int matricula) {// – exclui estudante da turma;
		for(int i=0; i<numEstudantes; i++) {
		    if(estudantesVetor[i].matricula == matricula) { 
		    	System.out.println(matricula+" "+i);
		        System.out.println("Estudante "+estudantesVetor[i].nome+" foi excluído!");
		    	for (int j = i; j<estudantesVetor.length-1;j++) {
		    		estudantesVetor[j] = estudantesVetor[j+1];
		    	}
		    	numEstudantes--;
		    }
		}
		System.out.println("Estudantes restantes: "+numEstudantes);
	}
	
	void listar(){// - apresenta estudantes matriculados na turma
		for (int i=0; i<numEstudantes;i++) {
			System.out.println("Nome: "+estudantesVetor[i].nome+" Nº matrícula: "+estudantesVetor[i].matricula+" Sexo: "+estudantesVetor[i].sexo);
		}
		System.out.println(numEstudantes+" alunos matriculados em "+nomeTurma);
		System.out.println("");
	} //– mostra os dados de todos os estudantes da turma;
	
	void trancar (Estudante e) {//Sobrecarga!
		for(int i=0; i<numEstudantes; i++) {
		    if(estudantesVetor[i]== e) { 
		        System.out.println("Estudante "+estudantesVetor[i].nome+" foi excluído!");
		    	for (int j = i; j<estudantesVetor.length-1;j++) {
		    		estudantesVetor[j] = estudantesVetor[j+1];
		    	}
		    	numEstudantes--;
		    }
		}
		System.out.println("Estudantes restantes: "+numEstudantes);
	} 
	
}