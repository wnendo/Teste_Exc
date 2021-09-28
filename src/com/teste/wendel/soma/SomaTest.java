/**
 * 
 */
package com.teste.wendel.soma;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @author Wendel
 *
 */
public class SomaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int res = 0;
		Scanner scan = new Scanner(System.in);
		String num = JOptionPane.showInputDialog(null, "Digite um número para limite da soma"); //Recebe o valor digitado pelo usuário
		
		try{
			res = Integer.parseInt(num); //Verifica se é um numero
			if(res > 0) { //Verifica se é um numero valido acima de 0
				Soma soma = new Soma();
				JOptionPane.showMessageDialog(null, "A soma dos multiplos de 3 e 5 é: " + soma.resultado(res)); //retorna a soma dos numeros
			}else {
				JOptionPane.showMessageDialog(null, "numero invalido");
			}
		}catch (NumberFormatException e){
			JOptionPane.showMessageDialog(null, "numero invalido");
		}
	}
}
