package Empresa;

public class Empresa extends Departamento{
	protected String nome;
	protected Departamento departamento;
	
	public Empresa(String nome, Departamento departamento) {
		this.nome = nome;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Nome da Empresa: "+nome);
	}
	
}
