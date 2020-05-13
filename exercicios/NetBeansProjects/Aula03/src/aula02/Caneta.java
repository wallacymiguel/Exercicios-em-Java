
package aula02;


public class Caneta {
        public String modelo;
        public String cor;
        private float ponta;
        protected int carga;
        private boolean tampada;
        public void status() {
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Carga: " + this.carga);
            System.out.println("Esta caneta tem a cor: " + this.cor);
            System.out.println("Tem o tamanho de ponta: " + this.ponta);
            System.out.println("Ela está tampada? " + this.tampada);
        }
        
        public void rabiscar() {
            if (this.tampada == true) {
                System.out.println("ERRO! Não posso rabiscar. Estou tampada!");
            } else {
                System.out.println("Estou Rabiscando!");
            }
        }
        
        public void tampar() {
            this.tampada = true;
        }
        
        public void destampar() {
            this.tampada = false;
        }
}
