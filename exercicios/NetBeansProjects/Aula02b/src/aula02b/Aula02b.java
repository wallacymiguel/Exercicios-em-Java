
package aula02b;

public class Aula02b {

   
    public static void main(String[] args) {
        /*
        Nobreak n1 = new Nobreak();
        n1.cor = "Preto";
        n1.modelo = "PP";
        n1.potencia = (float)3000;
        n1.peso = (float)15;
        n1.status();
        n1.ligar();
        n1.carregarBateria();
        */
        Nobreak n2 = new Nobreak();
        n2.cor = "Branca";
        n2.modelo = "Super Plus";
        n2.potencia = 1.6f;
        n2.peso = 10f;
        n2.status();
        n2.carregarBateria();
    }
    
}
