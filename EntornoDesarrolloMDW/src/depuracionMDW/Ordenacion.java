package depuracionMDW;

/**
 * 
 * @author Mar�a Daniela Wuerich
 * 
 *
 */

public class Ordenacion {
	
	/**
	 * M�todo que ordena un array de menor a mayor utilizando una variable con valor m�ximo
	 * @param array Array de enteros llamado array
	 */
	public void ordenaArray(int[] array) {
		for (int i = array.length - 1; i > 0; i--) {
			int maxValue = 0;
			for (int j = 0; j < i; j++) {
				if (array[j + 1] > array[maxValue]) {
					maxValue = j + 1;
				}
			}
			cambiar(array, i, maxValue);
			imprimeArray(array);
		}
	}
	/**
	 * M�todo que ordena array de menor a mayor utilizando una variable auxiliar
	 * @param numbers Array de enteros llamado numbers
	 * @return devuelve el array numbers ordenado
	 */
	public int[] ordenaArray2(int[] numbers) {
		for (int i=0; i < numbers.length - 1;i++) {
			for (int j=i+1;j<numbers.length;j++) {
				if (numbers[i]>numbers[j]) {
					int auxiliar=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=auxiliar;
				}
			}
		}
		return numbers;
	}
	
	/**
	 * M�todo que imprime el array
	 * @param array Array de enteros llamado array
	 */

	public void imprimeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%d \t", array[i]);
		}
		System.out.println();
	}
	
	/**
	 * M�todo que intercambia valores dentro del array llamado array utilizando una variable auxiliar
	 * @param array array de enteros llamado array
	 * @param a	�ndice del array
	 * @param b	�ndice del array
	 */
	public void cambiar(int[] array, int a, int b) {
		int value = array[b];
		array[b] = array[a];
		array[a] = value;
	}
}