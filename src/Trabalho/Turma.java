package Trabalho;

import java.util.Scanner;

//import java.util.Arrays;

public class Turma {
	//criar array din�mico
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
		return e;		
	} //� procura no array o estudante de matr�cula igual ao par�metro passado e o retorna;
	
	void trancar (int matricula) {
		for(int i=0; i<estudantesVetor.length; i++) {
		    if(estudantesVetor[i].matricula == matricula) { 
		        estudantesVetor[i] = null;
		        System.out.println("Estudante "+estudantesVetor[i].nome+" exclu�do com sucesso!");
		    }else {
		    	System.out.println("N�o existe estudante com esta matr�cula!");
		    }
		}
	}// � exclui estudante da turma;
	void trancar (Estudante e) {} //� exclui estudante da turma.
	
	//getters and setters
	//	String getNomeTurma() {
	//		return nomeTurma;
	//	}

		

}