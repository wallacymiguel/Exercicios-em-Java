
package aula02;


public class Caneta {
        String modelo;
        String cor;
        float ponta;
        int carga;
        boolean tampada;
        void status() {
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Carga: " + this.carga);
            System.out.println("Esta caneta tem a cor: " + this.cor);
            System.out.println("Tem o tamanho de ponta: " + this.ponta);
            System.out.println("Ela está tampada? " + this.tampada);
        }
        
        void rabiscar() {
            if (this.tampada == true) {
                System.out.println("ERRO! Não posso rabiscar. Estou tampada!");
            } else {
                System.out.println("Estou Rabiscando!");
            }
        }
        
        void tampar() {
            this.tampada = true;
        }
        
        void destampar() {
            this.tampada = false;
        }
}
