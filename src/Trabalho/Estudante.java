package Trabalho;

public class Estudante {
	String nome;
	int matricula;
	char sexo;
	
	public void dadosEstudante(String nome,int matricula,char sexo) {//informa��es "setadas" pelo usu�rio;
		this.nome = nome;
		this.matricula = matricula;
		this.sexo = sexo;
	}
	
	
	String getNome() {
		return nome;
	}
	int getMatricula() {
		return matricula;
	}
	char getSexo() {
		return sexo;
	}
	
}
