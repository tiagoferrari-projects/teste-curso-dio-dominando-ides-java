package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livro livro = new Livro();
		
		gato.setNome("Menino");
		gato.getNome();
		
		gato.setCor("Malhado");
		gato.getCor();
		
		gato.setIdade(15);
		gato.getClass();
		
		livro.setNome("Cole��o O Senhor dos An�is");
		livro.getNome();
		
		livro.setnumPaginas(1568);
		livro.getnumPaginas();
				
		System.out.println(gato);
		System.out.println(livro);
		/*int a = 2;
		  int b = 3;
		System.out.println("Hello, World!\n" + (a + b));*/
	}

}

class Livro {
	private String nome;
	private Integer numPaginas;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getnumPaginas() {
		return numPaginas;
	}
	
	public void setnumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}
	
	@Override
	public String toString() {
		return "Livro [nome = " + nome + ", N�mero de P�ginas = " + numPaginas + "p�ginas]";
	}
	
}
