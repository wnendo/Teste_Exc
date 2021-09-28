/**
 * 
 */
package com.teste.wendel.votos;

/**
 * @author Wendel
 *
 */
public class Votos {

	/**
	 * @param args
	 */
		double total_eleitores, votos_validos, votos_brancos, votos_nulos;

		Votos(int total, int validos, int brancos, int nulos){
		   total_eleitores = total;
		   votos_validos = validos;
		   votos_brancos = brancos;
		   votos_nulos = nulos;
		}
	
		public double percValidos() {
			    return (votos_validos *100) / total_eleitores;
		}

		public double percBrancos() {
		        return (votos_brancos * 100) / total_eleitores;
		}

		public double percNulos() {
		        return (votos_nulos * 100) / total_eleitores;
		}
		
}
