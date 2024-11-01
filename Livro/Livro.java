package Livro;

public class Livro extends Autor{
	protected String titulo;
	protected Autor autor;
	
	public Livro(String titulo, Autor autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	public void exibirInfo() {
		System.out.println("Nome do autor: "+autor.getNome());
		System.out.println("Titulo do Livro: "+titulo);
	}
	
}
