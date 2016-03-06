
package exemploserializacionficheiros;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExemploSerializacionFicheiros {

   
    public static void main(String[] args) {
      
         metodos obxfich= null ;      
            obxfich = new metodos();
            obxfich.escribeFichero("persoas.dat");         
            obxfich.lerFicheiro("persoas.dat");
            obxfich.engadeFicheiro("persoas.dat");
            obxfich.lerFicheiro("persoas.dat");
    }
}  

