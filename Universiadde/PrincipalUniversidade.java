package Universiadde;

public class PrincipalUniversidade {

	public static void main(String[] args) {
		Departamento departamento = new Departamento("História");
		Professor professor = new Professor("Fábio", departamento);

		System.out.println("Nome do Professor: " + professor.getNome() + " Departamento: " + departamento.getNome());
	}
}