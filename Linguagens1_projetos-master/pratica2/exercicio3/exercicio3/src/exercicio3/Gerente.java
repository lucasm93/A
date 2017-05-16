/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;

/**
 *
 * @author thomazerlach
 */
public class Gerente extends Funcionario {
    
    protected static double taxaComissao = 0.05;
    protected static double taxaExtraSalario = 0.25;
    private double vendas = 0;
    
    public Gerente (String n, String cpf, int reg, double salario) {
        super(n, cpf, reg, salario);
    }
    
    @Override
    public final double calcularBonus(double bIndividual) {
        return this.vendas*Gerente.taxaComissao + bIndividual+ this.salarioBase*Gerente.taxaExtraSalario;
    }
    
    public double getVendas () {
        return this.vendas;
    }
    
    public double remuneracaoFinal (double bIndividual) {
        return this.calcularBonus(bIndividual) + this.salarioBase;
    }
    
    public void realizarVenda(double valorVenda) {
        if (valorVenda > 0) {
            this.vendas += valorVenda;
        }
    }
    
    @Override
    public void exibirResumo () {
        super.exibirResumo();
        System.out.println("Vendas: " + this.vendas);
    }
    
//    public double getSalarioTotal() {
//        return this.salarioBase + this.calcularBonus(Concessionaria.bonusIndividual);
//    }
    
}
