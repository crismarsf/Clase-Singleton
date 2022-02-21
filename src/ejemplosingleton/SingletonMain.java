/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosingleton; //nombre del paquete

/**
 *
 * @author crist
 */
public class SingletonMain { //clase principal main

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //método main
        // TODO code application logic here
        
        EjemploSingleton ejemploSingleton1 = EjemploSingleton.getInstance(); //creacion de objeto dentro de la instancia
        EjemploSingleton ejemploSingleton2 = EjemploSingleton.getInstance(); //creacion de objeto dentro de la instancia
        
        System.out.println(ejemploSingleton1 == ejemploSingleton2); //llamado para comparar ambos 
    }
    
}
