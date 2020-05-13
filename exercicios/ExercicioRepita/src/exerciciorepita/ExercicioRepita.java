/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author walla
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, v = 0, s = 0, p = 0, i = 0, a = 0, m = 0;
        do {
        n = Integer.parseInt(JOptionPane.showInputDialog(null,
            "<html>Informe um número: <br><em>(0 interrompe)</em></br></html>"));
        s += n; //"s" armazena a soma dos valores. 
        v += 1; //"v" armazena o total de valores.
        m = s/v; //"m" armazena a média dos valores.
        if (n == 0){
            break;
        } else if (n % 2 == 0) { //Verifica se o número é par.
            p++;
        } else if (n % 2 == 1) { //Verifica se o número é ímpar.
            i++;
        }
        if (n > 100) { //Verifica quantos números são maiores que 100.
            a++;
        }
        } while (n != 0); //Interrompe o programa digitando 0.
        JOptionPane.showMessageDialog(null, "<html>Resultado Final <br><hr>"
                + "<br>Soma dos valores: " + s
                + "<br>Total de valores: " + v
                + "<br>Total de pares: " + p
                + "<br>Total de ímpares: " + i
                + "<br>Acima de 100: " + a
                + "<br>Média dos valores: " + m + "</html>");
    }
    
}
