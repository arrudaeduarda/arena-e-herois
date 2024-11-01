package Saude;

public class Fisioterapeuta extends ProfissionalSaude{
	private String crefito;

	public Fisioterapeuta() {
	}

	public Fisioterapeuta(String nome, String especialiadde, int valorConsulta, String crefito) {
		super(nome, especialiadde, valorConsulta);
		this.crefito = crefito;
	}

	@Override
	public void agendaConsulta() {
		System.out.println("Sua consulta é com o Médico: "+nome+"(cro: "+crefito+"), com a especialidade em "+especialiadde+", e custará: R$"+valorConsulta+".");
	}


}
