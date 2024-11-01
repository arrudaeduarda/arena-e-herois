package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca extends Livro{
	private List<Livro> livros;

	public Biblioteca() {
		this.livros = new ArrayList<>();
	}
	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}

	public void removerLivro(Livro livro) {
		livros.remove(livro);
	}

	public List<Livro> getLivros() {
		return livros;
	}
	@Override
	public void exibirInfo() {
		for(int i=0; i<livros.size(); i++) {
			super.exibirInfo();
			System.out.println("Livro com o id: "+ i +" é "+livros.get(i));
		}
	}
}