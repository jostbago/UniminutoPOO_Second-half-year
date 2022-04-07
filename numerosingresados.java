/* Pedir numero hasta que ingrese uno 
negativo y contar cuantos ha ingresado. */

package Varios;

import javax.swing.JOptionPane;

public class numerosingresados 
{
    public static void main(String args[])
    {
        int numero = 0;
        int contador = 0;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
            contador++;
        }
        while (numero >= 0);{
    
        }
        if (numero < 0) {
            JOptionPane.showMessageDialog(null, "Se ingresaron " + contador + " números positivos.");
        }
    }
}