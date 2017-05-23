package aula03v2;

public class Conta {
    private int numero;
    private Cliente titular;
    private double saldo;
    private static int totalDeContas;
    
    public Conta(int num, String nome, String sobre, String cpf, double saldo){
        this.numero = num;
        this.titular = new Cliente(nome, sobre, cpf);
        this.saldo = saldo;
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }
    
    public int getNumero(){
        return this.numero;
    }
    
    public void setNumero(int num){
        this.numero = num;
    }
    
    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }
    
    void visualizarConta(){
        System.out.println("Numero da conta: " + this.numero);
        System.out.println("Titular: " + this.titular.getNome() + " " + this.titular.getSobrenome());
        System.out.println("CPF: " + this.titular.getCpf());
        this.visualizarSaldo();        
    }
    
    void visualizarSaldo(){
        System.out.println("Saldo: " + this.saldo);
    }
    
    boolean depositar(double valor){
        if (valor > 0){
            this.saldo = this.saldo + valor;
            return true;
        }
        else 
            return false;
    }
    
    boolean sacar(double valor){
        if (valor > this.saldo || valor <= 0){
            return false;
        }
        else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }
    
    boolean transferirPara(Conta con, double valor){
        if (this.sacar(valor)) {
            con.depositar(valor);
            System.out.println("Transferencia concluida");
            return true;
        }
        else {
            System.out.println("Transferencia nao sucedida");
            return false;
        }
    }
}
