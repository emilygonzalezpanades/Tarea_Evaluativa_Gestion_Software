/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareaEvaluativa;

/**
 *
 * @author admin
 */
public class PocesadorExtencion extends ProcesadorTexto{

    public PocesadorExtencion(String texto) {
        super(texto);
    }

    //Imprime el texto por consola de color morado
    public void fuenteMorada(){
        System.out.println("\u001b[35m" + super.texto);
    }
    
    //Imprime el texto por consola con fondo azul
    public void fondoAzul(){
        System.out.println("\u001B[44m" + super.texto);
    }
    
}
