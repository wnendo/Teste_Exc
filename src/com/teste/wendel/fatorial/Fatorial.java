/**
 * 
 */
package com.teste.wendel.fatorial;

/**
 * @author Wendel
 *
 */
public class Fatorial {

		public int calculo(int n) {
		    if (n == 0)
		        return 1;
		    else
		        return (n * calculo(n - 1));
		}
}
