
package practica04;


public class CartaFrancesa {
   
    //Variables
    int numero;
    int palo;
    String error;
    String valorString;
    String codigo;
    
    //Constantes 
    public static final int TREBOLES = 0;
    public static final int DIAMANTES = 1;
    public static final int CORAZONES = 2;
    public static final int PICAS = 3;
    public static final int COMODIN = 4;
    
    //Método constructor con dos parámetros
    CartaFrancesa(int numero, int palo){
        if(numero>=0 && numero<=12){
            this.numero = numero;
        }else{
            error = "Valor no válido";
        }
        if(palo>=0 && palo<=4){
            this.palo = palo;
        }else{
            error = "Valor no válido"; 
        }
    }
    
    //Obtener palo
    public int getPalo() {
        return palo;
    }
    
    //Obtener numero
    public int getNumero() {
        return numero;
    }
    
    //Obtener string
    public String toString(){
        if(numero<10){
            if(numero==0 && palo!=COMODIN){
                valorString = "As";
            }else{
                valorString = String.valueOf(numero + 1);
            }
        }else{
            switch(numero){
                case 10:
                    valorString = "J";
                    break;
                case 11:
                    valorString = "Q";
                    break;
                case 12:
                    valorString = "K";
                    break;
            }
        }
        switch(palo){
            case TREBOLES:
                valorString += " de Treboles";
            break;
            case DIAMANTES:
                valorString += " de Diamantes";
            break;
            case CORAZONES:
                valorString += " de Corazones";
            break;
            case PICAS:
                valorString += " de Picas";
            break;
            case COMODIN:
                valorString += " de Comodin";
            break;    
        } 
        return valorString;
    }
    
    //Obtener código
    public String toCodigo(){
        switch(palo){
            case TREBOLES:
                codigo = "T";
            break;
            case DIAMANTES:
                codigo = "D";
            break;
            case CORAZONES:
                codigo = "C";
            break;
            case PICAS:
                codigo = "P";
            break;
            case COMODIN:
                codigo = "J";
            break;    
        }
        codigo +=(numero);
        return codigo;
    }

}
