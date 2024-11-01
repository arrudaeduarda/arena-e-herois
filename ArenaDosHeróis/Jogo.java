package ArenaDosHeróis;

import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Personagens mago = new Mago("Sonoda");
		Personagens gigante = new Gigante("Paulo");
		Personagens guerreiro = new Guerreiro("Newton");
		Personagens arqueiro = new Arqueiro("Naves");

		Personagens[] personagens = { mago, gigante, guerreiro, arqueiro};
		Tabuleiro tabuleiro = new Tabuleiro (personagens, 10);

		tabuleiro.iniciarJogo();

		while (!tabuleiro.checarVencedor()) {
			for (Personagens p : personagens) {
				if (p.getVida() > 0) {
					System.out.println(p.getNome() + ": (1) Atacar ou (2) Mover?");
					int escolha = scanner.nextInt();

					if (escolha == 1) {
						System.out.println("Escolha um oponente para atacar:");
						for (int i = 0; i < personagens.length; i++) {
							if (personagens[i] != p && personagens[i].getVida() > 0) {
								System.out.println(i + ": " + personagens[i].getNome());
							}
						}
						int oponenteEscolhido;
						while (true) {
							oponenteEscolhido = scanner.nextInt();
							if (oponenteEscolhido >= 0 && oponenteEscolhido < personagens.length 
									&& personagens[oponenteEscolhido] != p
									&& personagens[oponenteEscolhido].getVida() > 0 ) {
								break;
							} else {
								System.out.println("Escolha inválida, tente novamente.");
							}
						}
						p.atacar(personagens[oponenteEscolhido]);
					} else {
						System.out.println("Escolha uma nova posição (0 a 9):");
						int novaPosicao = scanner.nextInt();
						tabuleiro.movimentarPersonagem(p, novaPosicao);
					}
				}
			}
		}
		scanner.close();
	}
}