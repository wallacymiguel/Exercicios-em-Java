
package aula02b;


public class Nobreak {
        String modelo;
        float potencia;
        String cor;
        float peso;
        boolean ligado;
        
        void status() {
            System.out.print("O modelo é " + this.modelo);
            System.out.println(" com a potência de " + this.potencia);
            System.out.println("Tem a cor " + this.cor);
            System.out.println("Meu peso é " + this.peso + "Kg");
        }
        
        void ligar(){
            this.ligado = true;
            System.out.println("Estou ligado");
        }
        
        void carregarBateria(){
            if (this.ligado == true){
            System.out.println("Bateria Carregando...");
        } else {
                System.out.println("Ainda não fui ligado.");
            }
        }
}

