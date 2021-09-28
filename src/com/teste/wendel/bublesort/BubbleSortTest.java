/**
 * 
 */
package com.teste.wendel.bublesort;

/**
 * @author Wendel
 *
 */
public class BubbleSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};
		BubbleSort bubble = new BubbleSort();
		bubble.bubble_Sort(vetor, 8);
		int i;
		for (i = 0; i < 8; i++) {
			System.out.print(vetor[i]);
		}
	}
}
