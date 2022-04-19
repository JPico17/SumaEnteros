/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumaenteros;

import javax.swing.JOptionPane;

/**
 *
 * @author JeanR Pico
 */
public class SumaEnteros 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Declaracion de variables
        int x;
        int y;
        int z;
                
        //Entrada de datos 
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite x: "));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite y: "));
        
        //Procesamiento 
        z = x + y;
        //Salida
        JOptionPane.showMessageDialog(null,"La suma de " + x + " y " + y + " es : " + z);
        //Fin
        System.exit(0);
    }
}
