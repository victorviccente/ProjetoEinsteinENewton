package entities;

public class University {
	
	private String nome;
	
	public University(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String informarNome() {
		return nome;
	}

}
