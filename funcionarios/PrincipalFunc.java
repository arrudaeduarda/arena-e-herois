package funcionarios;

public class PrincipalFunc {
	public static void main(String[] args) {
		Horista horista = new Horista();
		System.out.println("Salário Horista");
		System.out.println(horista.calculaSalario(35, 10));
		
		Jornada jornada = new Jornada();
		System.out.println("\nSalário Jornada");
		System.out.println(jornada.calculaSalario(150, 20));
		
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		System.out.println("\nSalário Pessoa Juridica");
		System.out.println(pessoaJuridica.calculaSalario(10000, 1000));
	}
}
