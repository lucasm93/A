package exercicio3;

public class Gerente extends Funcionario{
    private String senha;
    private int numVendedores;
    private double vendas = 0;
    private static double taxaBonus = 0.05;
    private static double taxaSalario = 0.25;
    
    public Gerente(String nome, String cpf, int reg, double sal, String senha){
        super(nome, cpf, reg, sal);
        this.senha = senha;
    }
    
    public double getVendas() {
        return vendas;
    }
    
    @Override
    public double calcularBonus(double bIndividual){
        return Gerente.taxaBonus*this.vendas + Gerente.taxaSalario*this.salarioBase + bIndividual;
    }
    
    @Override
    public void exibirResumo(){
        super.exibirResumo();
        System.out.println("Vendas: " + this.vendas);
    }
    
    public void realizarVenda(double valor){
        if (valor > 0){
            this.vendas += valor;
        }
    }

    public double calcularSalario(double bonus){
        return this.salarioBase + this.calcularBonus(bonus);
    }
}
