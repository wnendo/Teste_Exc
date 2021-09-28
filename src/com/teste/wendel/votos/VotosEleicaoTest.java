/**
 * 
 */
package com.teste.wendel.votos;
import com.teste.wendel.votos.Votos;

/**
 * @author Wendel
 *
 */
public class VotosEleicaoTest {
	 
	public static void testVotos(){

	    Votos votos = new Votos(1000, 800, 150, 50);

	    double validos = votos.percValidos();
	    double brancos = votos.percBrancos();
	    double nulos = votos.percNulos();
	    
	    System.out.println("O percentual de votos válidos é de: " + validos + "%");
	    System.out.println("O percentual de votos brancos é de: " + brancos + "%");
	    System.out.println("O percentual de votos nulos é de: " + nulos + "%");

	}

	public static void main(String[] args) {
		testVotos();
	}

}
