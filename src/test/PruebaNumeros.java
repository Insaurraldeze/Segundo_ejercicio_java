
package test;

import domain.Numeros;

public class PruebaNumeros {
    public static void main(String[] args) {
        
        Numeros numero=new Numeros();
        numero.pedir();
        numero.imprimir();
        System.out.println("el numero recuperado con get es: "+ numero.Getnumero());
                
    }
    
  
    
  
    
}
