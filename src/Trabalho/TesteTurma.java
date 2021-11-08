package trabalho;

public class TesteTurma {

	public static void main(String[] args) {
		Estudante estudante = new Estudante();		
		estudante.dadosEstudante("Maria",123456,'F');	
		Estudante monitor = new Estudante();		
		monitor.dadosEstudante("João",654321,'M');
		Estudante estagiario = new Estudante();
		estagiario.dadosEstudante("Ana",789456,'F');
		
		TurmaNew turma1 = new TurmaNew("Programacao Orientada a Objetos");
		turma1.matricular(estudante);
		turma1.matricular(monitor);
		turma1.matricular(estagiario);
		turma1.listar();
		//turma1.pesquisar(123456);
		//turma1.trancar(123456);
		//turma1.trancar(monitor);		
	}
}
