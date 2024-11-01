package Saude;

public abstract class ProfissionalSaude {
	protected String nome;
	protected String especialiadde;
	protected int valorConsulta;
	
	public ProfissionalSaude(){	
	}
	public ProfissionalSaude(String nome, String especialiadde, int valorConsulta) {
		super();
		this.nome = nome;
		this.especialiadde = especialiadde;
		this.valorConsulta = valorConsulta;
	}
	public abstract void agendaConsulta();
}