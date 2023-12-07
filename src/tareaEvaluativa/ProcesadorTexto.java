/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tareaEvaluativa;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class ProcesadorTexto {
    protected String texto;

    public ProcesadorTexto(String texto) {
        this.texto = texto;
    }
    
    public void agregarTexto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el texto deseado");
        this.texto = sc.nextLine();
    }
    
    public void imprimirTexto(){
        System.out.println(texto);
    }

}
