//Victor Rampanha Nicolaus RA: 14.01617-6
//Rafael Negrão Chaves Caielli RA: 15.04095-0
package atividade1;

public class Conta {
    private int agencia;
    private int cc;
    private Dinheiro saldo;
    private Dinheiro limite;
    private Cliente titular;
    
    public Conta(String nome, String sobre, String cpf, double saldo, double limite, String moeda){
        this.titular = new Cliente(nome, sobre, cpf);
        this.saldo = new Dinheiro(saldo, moeda);
        this.limite = new Dinheiro(limite, moeda);
    }
    
    void exibirTodasInformacoesDaConta(){
        System.out.println("Conta corrente: " + this.cc);
        System.out.println("Agencia: " + this.agencia);
        this.exibirSaldo();        
    }
    
    void exibirTitular(){
        System.out.println("Titular: " + this.titular.getNome() + " " + this.titular.getSobrenome());
        System.out.println("CPF: " + this.titular.getCpf());
        
    }
    
    void exibirSaldo(){
        double soma;
        soma = this.saldo.getValor() + this.limite.getValor();
        this.exibirTitular();
        System.out.println("Saldo: " + soma + " com limite de: " + this.limite.getValor());
        System.out.println("");
    }
    
    boolean depositar(double valor){
        if (valor > 0){
            if (this.saldo.comparaReal(this.saldo.getMoeda())){
                this.saldo.setValor(valor + this.saldo.getValor());
            }
            if (this.saldo.comparaDolar(this.saldo.getMoeda())){
                valor = Dinheiro.realParaDolar(valor);
                this.saldo.setValor(valor + this.saldo.getValor());
            }
            if (this.saldo.comparaEuro(this.saldo.getMoeda())){
                valor = Dinheiro.realParaDolar(valor);
                valor = Dinheiro.dolarParaEuro(valor);
                this.saldo.setValor(valor + this.saldo.getValor());
            }
            return true;
        }
        else 
            System.out.println("Valor invalido (negativo)");
            return false;
    }
    
    boolean sacar(double valor){
        if (valor > (this.saldo.getValor() + this.limite.getValor())){
            System.out.println("Saldo insuficiente");
            this.exibirSaldo();
            return false;
        }
        if (valor < 0){
            System.out.println("Valor invalido (negativo)");
            return false;
        }
        else {
            if (this.saldo.comparaReal(this.saldo.getMoeda())){
                this.saldo.setValor(this.saldo.getValor() - valor);
            }
            if (this.saldo.comparaDolar(this.saldo.getMoeda())){
                valor = Dinheiro.realParaDolar(valor);
                this.saldo.setValor(this.saldo.getValor() - valor);
            }
            if (this.saldo.comparaEuro(this.saldo.getMoeda())){
                valor = Dinheiro.realParaDolar(valor);
                valor = Dinheiro.dolarParaEuro(valor);
                this.saldo.setValor(this.saldo.getValor() - valor);
            }
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
    
    public void alterarNome(String novoNome){
        this.titular.setNome(novoNome);
    }
    
    public void alterarSobrenome(String novoSobrenome){
        this.titular.setSobrenome(novoSobrenome);
    }
    
    public void alterarCPF(String novoCPF){
        this.titular.alterarCpf(novoCPF);
    }
}
