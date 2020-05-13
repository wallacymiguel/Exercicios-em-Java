/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author walla
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);*/
        
        String idade = "30.3";
        float valor = Float.parseFloat(idade);
        System.out.printf("%.2f \n", valor);
    }
    
}
