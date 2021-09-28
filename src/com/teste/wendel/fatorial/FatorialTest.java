package com.teste.wendel.fatorial;

/**
 * @author Wendel
 *
 */
public class FatorialTest {

	public static void main(String[] args) {
		 
		Fatorial fatorial = new Fatorial();
		for(int i = 0; i <= 10; i++) {

			int resultado = fatorial.calculo(i);
			System.out.println("Fatorando " + i + ", temos como resultado: " + resultado);
		}
	}
}
