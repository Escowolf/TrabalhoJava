package Trabalho;

public class TesteTurma {

	public static void main(String[] args) {

		Estudante e1 = new Estudante();		
		e1.dadosEstudante("Maria", 154785, 'F');
		
		Estudante e2 = new Estudante();		
		e2.dadosEstudante("João", 1144744, 'M');
		
		Turma turma1 = new Turma("Programacao Orientada a Objetos");
		turma1.matricular(e1);
		turma1.matricular(e2);
		turma1.listar();
		turma1.pesquisar(666666);
		turma1.trancar(e2);
		
		
	}

}
