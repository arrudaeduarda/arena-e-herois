package Veiculo;

public class Automovel extends Veiculo{
	protected int numeroPortas;
	protected String motor;
	
	public Automovel() {
	}
	public Automovel(String marca, String modelo, int ano, String cor,int numeroPortas,String motor) {
		super(marca, modelo, ano, cor);
		this.numeroPortas = numeroPortas;
		this.motor = motor;
	}
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Números de Portas: "+numeroPortas+"\nMotor: "+motor);
	}
}
