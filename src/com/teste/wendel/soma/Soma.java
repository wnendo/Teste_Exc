/**
 * 
 */
package com.teste.wendel.soma;

import java.util.Scanner;

/**
 * @author Wendel
 *
 */
public class Soma {
	
	int a = 3;
	int b = 5;
	int somaa = 0;
	int somab = 0;
	int res;
	    
	public int resultado(int num) {
		for(int i = 1; i < num; i++) {
	        if(i % a == 0) {
	            somaa += i;
	        }
	    }
	    for(int i = 1; i < num; i++) {
	        if(i % b == 0) {
	            somab += i;
	        }
	    }
	    return res = somaa + somab;
	}
}
