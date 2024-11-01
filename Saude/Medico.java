package Saude;

public class Medico extends ProfissionalSaude{
	private String crm;

	public Medico() {
		super();
	}
	public Medico(String nome, String especialiadde, int valorConsulta, String crm) {
		super(nome, especialiadde, valorConsulta);
		this.crm = crm;
	}
	@Override
	public void agendaConsulta() {
		System.out.println("Sua consulta é com o Médico: "+nome+"(crm: "+crm+"), com a especialidade em "+especialiadde+", e custará: R$"+valorConsulta+".");
	}
}
