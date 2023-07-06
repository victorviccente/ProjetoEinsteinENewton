package application;

import entities.User;
import entities.University;

public class Program {

	public static void main(String[] args) {
		
		University princeton = new University("Princeton");
		University cambridge = new University("Cambridge");
		
		User albertEinstein = new User("Albert Einstein" , princeton);
		User isaacNewton = new User("Isaac Newton" , cambridge);		
		
		System.out.println("Fato curioso sobre Albert Einstein e Isaac Newton:");
		System.out.println();
		System.out.println(albertEinstein.informarNomeEUniversidade());
		System.out.println(isaacNewton.informarNomeEUniversidade());
	}

}
