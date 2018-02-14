package br.study;

public class TestaListaDeAulaLinkedList {

	public static void main(String[] args) {
		Curso curso = new Curso("Collections", "Paulo Silveira");
		System.out.println(curso.getAulas());
		
		curso.adiciona(new Aula("Trabalhando com arraylist", 21));
		curso.adiciona(new Aula("Criando uma aula", 20));
		curso.adiciona(new Aula("Modelando com coleções", 24));
		System.out.println(curso.getAulas());
	}
}
