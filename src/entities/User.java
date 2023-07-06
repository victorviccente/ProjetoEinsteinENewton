package entities;

public class User {

	private String nome;
	private University universidade;
	private int idade;

	public User(String nome, University universidade) {
		this.nome = nome;
		this.universidade = universidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public University getUniversidade() {
		return universidade;
	}

	public void setUniversidade(University universidade) {
		this.universidade = universidade;
	}

	public String informarNomeEUniversidade() {
		return nome + " trabalhou na Universidade de " + universidade.informarNome() + ".";
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
