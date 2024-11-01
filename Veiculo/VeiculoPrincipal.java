package Veiculo;

public class VeiculoPrincipal {
	public static void main(String[] args) {		
		Moto moto = new Moto("Honda","Bis",2010,"Preto",100);
		Automovel automovel = new Automovel("Paggani","Senna",2074,"Cor fantasia",2,"w16");

		System.out.println("------Automovél------");
		automovel.exibirInfo();
		System.out.println("\n------Moto------");
		moto.exibirInfo();
	}
}