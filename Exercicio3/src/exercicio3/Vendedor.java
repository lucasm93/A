package exercicio3;

public class Vendedor extends Funcionario{
    private int registroGerente;
    private double vendas = 0;
    private static double taxaBonus = 0.03;
       
    public Vendedor (String nome, String cpf, int reg, double sal, int regGerente){
        super(nome, cpf, reg, sal);
        this.registroGerente = regGerente;
    }
    
    @Override
    public double calcularBonus(double bIndividual){
        return Vendedor.taxaBonus * this.vendas + bIndividual;
    }
    
    public void realizarVenda(double valor){
        if (valor > 0){
            this.vendas += valor;
        }
    }

    public double getVendas() {
        return vendas;
    }
    
    public double calcularSalario(double bonus){
        return this.salarioBase + this.calcularBonus(bonus);
    }
    
    @Override
    public void exibirResumo(){
        super.exibirResumo();
        System.out.println("Vendas: " + this.vendas);
        //System.out.println("Salario Mes: " + this.calcularSalario(bonus));
    }
}
