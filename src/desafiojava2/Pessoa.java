package desafiojava2;

public class Pessoa {

	private String nome;
	private Universidade universidade;
	private int idade;

	public Pessoa(String nome, Universidade universidade) {
		this.nome = nome;
		this.universidade = universidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Universidade getUniversidade() {
		return universidade;
	}

	public void setUniversidade(Universidade universidade) {
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
