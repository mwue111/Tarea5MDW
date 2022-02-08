
package depuracionMDW;

/**
 * 
 * @author Mar�a Daniela Wuerich
 *
 */

public class MDW_Calculadora {
	/**
	 * M�todo constructor por defecto
	 */
	public MDW_Calculadora(){
        
    }
	
	/**
	 * M�todo que suma dos n�meros enteros 
	 * @param num1 N�mero 1
	 * @param num2 N�mero 2
	 * @return devuelve la suma entre ambos n�meros
	 */
    
    public int suma(int num1,int num2){
        return num1+num2;
    }
    
    /**
     * M�todo que resta dos n�meros enteros 
     * @param num1 N�mero 1
     * @param num2 N�mero 2
     * @return devuelve la resta entre ambos n�meros
     */
    public int resta(int num1,int num2){
        return num1-num2;
    }
    
    /**
     * M�todo que multiplica dos n�meros enteros 
     * @param num1 N�mero 1
     * @param num2 N�mero 2
     * @return devuelve la multiplicaci�n entre ambos n�meros
     */
    
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    
    /**
     * M�todo que divide dos n�meros enteros
     * @param num1 N�mero 1
     * @param num2 N�mero 2
     * @return devuelve la divisi�n entre ambos n�meros
     */
    
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }

	private int valor1;
	private int valor2;
}
