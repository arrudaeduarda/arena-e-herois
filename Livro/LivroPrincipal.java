package Livro;

public class LivroPrincipal {

	public static void main(String[] args) {
		Autor autor = new Autor("João");
		Livro livro = new Livro("Memórias dp senai", autor);

		livro.exibirInfo();
	}

}
