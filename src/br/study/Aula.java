package br.study;

public class Aula implements Comparable<Aula>{
	private String nome;
	private int tempo;
	
	public Aula(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
	}
	public int getTempo() {
		return tempo;
	}
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "Aula [nome=" + nome + ", tempo=" + tempo + "]";
	}

	@Override
	public int compareTo(Aula aula) {
		return this.compareTo(aula);
	}
}
