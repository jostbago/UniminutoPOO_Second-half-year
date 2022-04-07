/*
Versión:        1.0
Fecha:          20220325
Copyright:      John Barragán
Descripción:    Realizar un juego para adivinar un número se debe generar 
el número de manera aleatoria (0 - 100), luego ir pidiendo números 
indicando "Es Mayor" o "Es Menor" el programa termina cuando se adivine el 
número y mostrar en cuantos intentos se adivino el número.
*/

package Varios;

import javax.swing.JOptionPane;

public class adivinarnumero {

    public static void main(String args[])
    {
                int aleatorio = (int)(Math.random() * 100);
                int numero;
                int contador = 0;

                JOptionPane.showMessageDialog(null, "Adivinar número que se genera aleatoriamente del 0 al 100");

                    do {
                        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número: "));
                        if (aleatorio > numero) {
                            JOptionPane.showMessageDialog(null, "Digite un número mayor");
                        }
                        else if (aleatorio < numero) {
                            JOptionPane.showMessageDialog(null, "Digite un número menor");
                        }
                        else if (aleatorio == numero) {
                            JOptionPane.showMessageDialog(null, "Felicidades adivino el número");
                        }
                        contador++;
                    }
                    while (numero != aleatorio); {
                        JOptionPane.showMessageDialog(null, "Intentos " + contador);
                    }
    }
}
