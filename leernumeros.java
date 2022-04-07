/* lea numeros hasta que introduzca un cero (0) 
y por cada lectura diga si es para o impar. */

package Varios;

import javax.swing.JOptionPane;

public class leernumeros {

    public static void main(String args[])
    {
        int numero;

        do 
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));

            if (numero != 0) 
            {
                if (numero %2 == 0) 
                {
                    JOptionPane.showMessageDialog(null, + numero + " es Par");
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, + numero + " es Impar");
                }
            }
        } while (numero != 0);
    }
}