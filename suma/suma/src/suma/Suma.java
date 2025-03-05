/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniela
 */
public class Suma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int a;
        int b;
        
        a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        JOptionPane.showMessageDialog(null,"la suma es " + sumar(a,b));
        JOptionPane.showMessageDialog(null,"el promedio es " + promediar(a,b));

    }//fin  main
    
    public static int sumar(int num1, int num2)      
    {
      int operacion;
      operacion = num1 + num2;
      return operacion;
    
    }//fin sumar 
    
}// fin clase
