package Trabalho;

public class TesteTurma {

	public static void main(String[] args) {

		Estudante e1 = new Estudante();		
		e1.dadosEstudante("Maria",154785,'F');	
		Estudante e2 = new Estudante();		
		e2.dadosEstudante("João",123456,'F');
		Estudante e3 = new Estudante();		
		e3.dadosEstudante("Laura",234237,'F');	
		Estudante e4 = new Estudante();		
		e4.dadosEstudante("Vasconcelos",423423,'F');
		Estudante e5 = new Estudante();		
		e5.dadosEstudante("Brito",213123,'F');	
		Estudante e6 = new Estudante();		
		e6.dadosEstudante("Jr",184547,'F');
		Estudante e7 = new Estudante();		
		e7.dadosEstudante("Kenga",21232,'F');	
		Estudante e8 = new Estudante();		
		e8.dadosEstudante("Isso",13243,'F');
		
		Turma turma1 = new Turma("Programacao Orientada a Objetos");
		turma1.matricular(e1);
		turma1.matricular(e2);
		turma1.matricular(e3);
		turma1.matricular(e4);
		turma1.matricular(e5);
		turma1.matricular(e6);
		turma1.matricular(e7);
		turma1.matricular(e8);
		turma1.trancar(423423);
		turma1.trancar(e2);
		turma1.pesquisar(184547);
		turma1.listar();
	}
}
