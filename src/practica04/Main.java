
package practica04;


public class Main {

    
    public static void main(String[] args) {
        CartaFrancesa carta01 = new CartaFrancesa(0,CartaFrancesa.DIAMANTES);
        CartaFrancesa carta02 = new CartaFrancesa(12,CartaFrancesa.CORAZONES);
        CartaFrancesa carta03 = new CartaFrancesa(10,CartaFrancesa.COMODIN);
        
        System.out.println(carta01.toString());
        System.out.println(carta01.toCodigo());
        System.out.println(" ");
        System.out.println(carta02.toString());
        System.out.println(carta02.toCodigo());
        System.out.println(" ");
        System.out.println(carta03.toString());
        System.out.println(carta03.toCodigo());
        System.out.println(" ");
        
        
    }
}
