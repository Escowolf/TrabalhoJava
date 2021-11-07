package Trabalho;

public class Turma {
	protected String nomeTurma;
	protected Estudante[] estudantesVetor = new Estudante[10]; //tipo de dado e nome da vari�vel
	protected int numEstudantes;
	protected Estudante e;
	
	public Turma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	
	public void matricular (Estudante e) {//� inclui estudante na turma;
			estudantesVetor[numEstudantes] = e;
			numEstudantes++; //soma 1 estudante cada vez que o m�todo � chamado
			System.out.println("Aluno matriculado com sucesso!");
			System.out.println(""); //linha em branco para dar espa�o
		}
	
	void listar(){
		for (int i=0; i<numEstudantes;i++) {
			System.out.println("Nome: "+estudantesVetor[i].nome+" N� matr�cula: "+estudantesVetor[i].matricula+" Sexo: "+estudantesVetor[i].sexo);
			System.out.println("");
		}
		System.out.println(numEstudantes+" alunos matriculados em "+nomeTurma);
		System.out.println("");
	} //� mostra os dados de todos os estudantes da turma;
	
	Estudante pesquisar (int matricula) {
		for(int i=0; i<numEstudantes; i++) {
		    if(estudantesVetor[i].matricula == matricula) { 
		    	String e = estudantesVetor[i].nome;
		    	System.out.println("Pesquisa estudante: "+e);
		    	break;
		    }
		    if (estudantesVetor[i].matricula != matricula){
		    	System.out.println("N�o existe estudante com essa matr�cula");
		    	break;
		    }
		}
		return e;	
	} //� procura no array o estudante de matr�cula igual ao par�metro passado e o retorna;
	
	void trancar (int matricula) {// � exclui estudante da turma;
		for(int i=0; i<numEstudantes; i++) {
		    if(estudantesVetor[i].matricula == matricula) { 
		        System.out.println("Estudante "+estudantesVetor[i].nome+" exclu�do com sucesso!");
		        estudantesVetor[i]=null;
		    }
		    break;
		}
	}
	
	void trancar (Estudante e) {//Sobrecarga!
		for(int i=0; i<numEstudantes;i++) {
		    if(estudantesVetor[i] == e) { 
		        System.out.println("Estudante "+estudantesVetor[i].nome+" exclu�do com sucesso!");
		        estudantesVetor[i]=null;
		    }
		    break;
		}
	} 
	
}