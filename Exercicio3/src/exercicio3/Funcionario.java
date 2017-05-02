package exercicio3;

public class Funcionario {
    protected String nomeCompleto;
    protected String cpf;
    protected int registro;
    protected double salarioBase;
    
    public Funcionario(String nome, String cpf, int reg, double sal){
        this.nomeCompleto = nome;
        this.cpf = cpf;
        this.registro = reg;
        this.salarioBase = sal;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public int getRegistro() {
        return registro;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }
    
    public double calcularBonus(double bonus){
        return bonus;
    }
    
    
    public void exibirResumo(){
        System.out.println("Nome: " + this.nomeCompleto);
        System.out.println("Registro: " + this.registro);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salario Base: " + this.salarioBase);
    }
}
