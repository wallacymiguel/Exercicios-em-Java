
package banco;


public class ContaBanco {
 
//Atributos    
    public int numConta; //
    protected String tipo; 
    private String dono;
    private double saldo;
    private boolean status;
    
//Métodos    
    
    public ContaBanco() {
        saldo = 0;
        status = false;
    }
    
    public void abrirConta() {
        
    }
    public void fecharConta() {
        
    }
    public void depositar() {
        
    }
    public void sacar() {
        
    }
    public void pagarMensal() {
        
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }
    public int getNumConta() {
        return numConta;
    }
    public void setTipo(String t) {
        this.tipo = t;
    }
}
