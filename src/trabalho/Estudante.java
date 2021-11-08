package trabalho;

public class Estudante {
	String nome;
	int matricula;
	char sexo;
	
	
	String getNome() {
		return nome;
	}
	int getMatricula() {
		return matricula;
	}
	char getSexo() {
		return sexo;
	}
	void dadosEstudante(String nome,int matricula, char sexo) {
		this.nome = nome;
		this.matricula = matricula;
		this.sexo = sexo;
	}
	

}
