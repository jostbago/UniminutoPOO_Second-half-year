/* 
Versión:        1.0
Fecha:          20220325
Copyright:      John Barragán
Descripción:    Pide un número (que debe estar entre 0 y 10) y 
mostrar la tabla de multiplicar de dicho número.
*/

package Varios;

import javax.swing.JOptionPane;

public class tablademultiplicar {

    public static void main(String args[])
{
    string texto;
    int numero;
    
    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de la tabla que quiere."));

    for (int i = 0; i < 10; i++)
    {
        texto += numero + " x " + i + " = " + numero * i + "\n";
    }
    JOptionPane.showMessageDialog(null, "La tabla de multiplicar del " + numero +" es: \n " + texto);
}
}
