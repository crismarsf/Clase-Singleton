/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosingleton; //nombre del paquete del proyecto

/**
 *
 * @author crist
 */
public class EjemploSingleton { //clase EjemploSingleton
    
        protected EjemploSingleton(){ //Se declara el constructor de clase como privado para no instanciarlo directamente
            
        }
        
        private static class SingletonHolder{ //clase privada para crear el objeto
            private final static EjemploSingleton INSTANCE = new EjemploSingleton(); //creación de objeto privado estático final
        }
        
        public static EjemploSingleton getInstance(){ //método estático 
            return SingletonHolder.INSTANCE; //objeto retornado
        }
       
}
