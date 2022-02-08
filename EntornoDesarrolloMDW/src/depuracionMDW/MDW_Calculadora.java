
package depuracionMDW;

/**
 * 
 * @author María Daniela Wuerich
 *
 */

public class MDW_Calculadora {
	/**
	 * Método constructor por defecto
	 */
	public MDW_Calculadora(){
        
    }
	
	/**
	 * Método que suma dos números enteros 
	 * @param num1 Número 1
	 * @param num2 Número 2
	 * @return devuelve la suma entre ambos números
	 */
    
    public int suma(int num1,int num2){
        return num1+num2;
    }
    
    /**
     * Método que resta dos números enteros 
     * @param num1 Número 1
     * @param num2 Número 2
     * @return devuelve la resta entre ambos números
     */
    public int resta(int num1,int num2){
        return num1-num2;
    }
    
    /**
     * Método que multiplica dos números enteros 
     * @param num1 Número 1
     * @param num2 Número 2
     * @return devuelve la multiplicación entre ambos números
     */
    
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    
    /**
     * Método que divide dos números enteros
     * @param num1 Número 1
     * @param num2 Número 2
     * @return devuelve la división entre ambos números
     */
    
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }

	private int valor1;
	private int valor2;
}
