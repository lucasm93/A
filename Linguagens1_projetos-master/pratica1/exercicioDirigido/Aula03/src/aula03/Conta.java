package aula03;

public class Conta {

    private int numero;
    private double saldo;
    private Cliente titular;
    private static int totalDeContas;
    
    public Conta(String nome, String sobrenome, String cpf) {
        this.titular = new Cliente();
        this.titular.setNome(nome);
        this.titular.setSobreome(sobrenome);
        this.titular.mudarCPF(cpf);
        
        Conta.totalDeContas = Conta.totalDeContas + 1;
    }
    
    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }
    
    public void getDados() {
        this.titular.visualizarDados();
    }

    void visualizarSaldo() {
        System.out.println("Saldo = " + this.saldo);
    }
    
    void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }
    }

    boolean sacar(double value) {
        if (value < this.saldo) {
            this.saldo = this.saldo - value;
            return true;
        } else {
            return false;
        }
    }

    boolean transferirPara(Conta c1, double valor) {
        if (this.sacar(valor)) {
            c1.depositar(valor);
            System.out.println("Transação autorizada!");
            return true;
        } else {
            System.out.println("Transação não autorizada...");
            return false;
        }
    }

}
