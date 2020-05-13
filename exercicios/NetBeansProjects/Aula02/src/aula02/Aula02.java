
package aula02;


public class Aula02 {

   
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Carmim";
        c1.ponta = 0.5f;
        c1.tampar();
        System.out.println("");
        c1.status();
        c1.rabiscar();
        
        Caneta c2 = new Caneta();
        c2.modelo = "JW";
        c2.cor = "Azul";
        c2.ponta = 0.5f;
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
    
}
