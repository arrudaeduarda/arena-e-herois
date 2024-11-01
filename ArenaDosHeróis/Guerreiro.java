package ArenaDosHeróis;

public class Guerreiro extends Personagens{

	public Guerreiro(String nome) {
		super(nome, 150, 30);
	}

	@Override
	public void atacar(Personagens oponente) {
		int distancia = calculaDistancia(oponente);
		if (distancia <= 1) {
			oponente.receberDano(this.getDanoBase());
			System.out.println(getNome() + " atacou " + oponente.getNome() + " com força bruta.");
		}else {
			System.out.println(getNome() + " está muito longe para atacar!");
		}
	}
}