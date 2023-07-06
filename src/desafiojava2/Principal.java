package desafiojava2;

public class Principal {

	public static void main(String[] args) {
		
		Universidade princeton = new Universidade("Princeton");
		Universidade cambridge = new Universidade("Cambridge");
		
		Pessoa albertEinstein = new Pessoa("Albert Einstein" , princeton);
		Pessoa isaacNewton = new Pessoa("Isaac Newton" , cambridge);		
		
		System.out.println("Fato curioso sobre Albert Einstein e Isaac Newton:");
		System.out.println();
		System.out.println(albertEinstein.informarNomeEUniversidade());
		System.out.println(isaacNewton.informarNomeEUniversidade());
	}

}
