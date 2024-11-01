package Saude;

public class Dentista extends ProfissionalSaude{
	private String cro;

	public Dentista() {
	}

	public Dentista(String nome, String especialiadde, int valorConsulta,String cro) {
		super(nome, especialiadde, valorConsulta);
		this.cro = cro;
	}

	@Override
	public void agendaConsulta() {
		System.out.println("Sua consulta é com o Médico: "+nome+"(cro: "+cro+"), com a especialidade em "+especialiadde+", e custará: R$"+valorConsulta+".");
	}
}