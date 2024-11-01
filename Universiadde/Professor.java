package Universiadde;

	public class Professor {
		private String nome;
		private Departamento departamento;
		
		public Professor(String nome, Departamento departamento) {
			this.nome = nome;
			this.departamento = departamento;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
}