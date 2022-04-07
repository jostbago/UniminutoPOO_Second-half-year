/*
Versión:        1.0
Fecha:          20220325
Copyright:      John Barragán
Descripción:    Pedir números hasta que se introduzca uno 
negativo, y calcular la media.
*/

package Varios;

import javax.swing.JOptionPane;

public class calcularnumero 
{
    public static void main(String args[])
    {
        int contador = 0;
        int numero = 0;
        int suma = 0;
        float media;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
        
        while (numero >= 0) {
            suma += numero;
            contador++;

            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro número: "));
        }
        if (contador == 0) {

            JOptionPane.showMessageDialog(null, "Imposible realizar la media.");

        }
        else {
            media = (float) suma / contador;
            JOptionPane.showMessageDialog(null, "La media de números digitados es: " + media);
        }
    }
}