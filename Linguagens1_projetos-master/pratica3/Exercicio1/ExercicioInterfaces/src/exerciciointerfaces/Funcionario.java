package exerciciointerfaces;

public abstract class Funcionario {
    private String nome;
    private int registro;
    private double salario;
    
    public Funcionario(String n, int r, double s){
        this.nome = n;
        this.registro = r;
        this.salario = s;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getRegistro() {
        return registro;
    }

    public double getSalario() {
        return salario;
    }
}
