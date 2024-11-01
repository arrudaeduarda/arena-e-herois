package Universiadde;

public class Departamento {
	protected String nome;
	
	public Departamento() {
	}
	public Departamento(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void exibirInfo() {
		System.out.println("Nome do departamento: "+nome);
	}
}
