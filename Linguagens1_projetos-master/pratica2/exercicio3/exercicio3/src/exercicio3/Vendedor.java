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
public class Vendedor extends Funcionario {
    
    protected static double taxaComissao = 0.03;
    private double vendas = 0;
    
    public Vendedor (String n, String cpf, int reg, double salario) {
        super(n, cpf, reg, salario);
    }
    
    @Override
    public final double calcularBonus(double bIndividual) {
        return this.vendas*Vendedor.taxaComissao + bIndividual;
    }
    
    @Override
    public void exibirResumo () {
        super.exibirResumo();
        System.out.println("Vendas: " + this.vendas);
    }
    
    public double remuneracaoFinal (double bIndividual) {
        return this.calcularBonus(bIndividual) + this.salarioBase;
    }
    
//    public double getSalarioTotal() {
//        return this.salarioBase + this.calcularBonus(Concessionaria.bonusIndividual);
//    }
    
    public void realizarVenda(double valorVenda) {
        if (valorVenda > 0) {
            this.vendas += valorVenda;
        }
    }
    
    public double getVendas () {
        return this.vendas;
    }
}
