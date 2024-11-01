package Biblioteca;


public class LivroPrincipal {

	public static void main(String[] args) {

		Livro livro1 = new Livro("Livro 1", "Autor 1");
        Livro livro2 = new Livro("Livro 2", "Autor 2");

        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);

        biblioteca.exibirInfo();
	}
}