/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeheranca;

/**
 *
 * @author thomazerlach
 */
public class Vendedor {
    protected String nomeCompleto;
    protected String cpf;
    protected int registro;
    protected double salarioBase;
    protected static double taxaComissao = 0.03;
    protected double horaExtra;
    protected double totalVendas;
    protected GerenteDeVendas gerente;
    
    public Vendedor (String n, String c, int reg, double salario, double hora) {
        this.setNome(n);
        this.setCpf(c);
        this.setRegistro(reg);
        this.setSalarioBase(salario);
        this.setHoraExtra(hora);
    }
    
    public String getNome () {
        return this.nomeCompleto;
    }
    
    public final void setNome (String nomeNovo) {
        this.nomeCompleto = nomeNovo;
    }
    
    public String getCpf () {
        return this.cpf;
    }
    
    public final void setCpf (String cpfNovo) {
        this.cpf = cpfNovo;
    }
    
    public int getRegistro () {
        return this.registro;
    }
    
    public final void setRegistro (int registroNovo) {
        this.registro = registroNovo;
    }
    
    public double getHoraExtra () {
        return this.horaExtra;
    }
    
    public final void setHoraExtra (double horaNova) {
        this.horaExtra = horaNova;
    }
    
    public double getSalarioBase () {
        return this.salarioBase;
    }
    
    public final void setSalarioBase (double salarioNovo) {
        this.salarioBase = salarioNovo;
    }
    
    public static double getTaxa () {
        return Vendedor.taxaComissao;
    }
    
    public static void setTaxa (double taxaNova) {
        Vendedor.taxaComissao = taxaNova;
    }
    
    public String getGerente () {
        return this.gerente.getNome();
    }
    
    public final void setGerente (GerenteDeVendas gerenteNovo) {
        this.gerente = gerenteNovo;
    }
    
    public double calcularComissao () {
        return this.totalVendas * Vendedor.taxaComissao;
    }
    
    public double calcularDecimoTerceiro () {
        return this.salarioBase;
    }
    
    public double calcularFerias () {
        return this.salarioBase + this.salarioBase/3;
    }
    
    public double salarioDoMes () {
        return this.salarioBase + this.horaExtra + this.calcularComissao();
    }
    
    public void exibirResumo () {
        System.out.println("Nome: " + this.nomeCompleto);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Registro: " + this.registro);
        System.out.println("Salário total: " + this.salarioDoMes());
        System.out.println("Comissão: " + this.calcularComissao());
        System.out.println("Férias: " + this.calcularFerias());
        System.out.println("13º: " + this.calcularDecimoTerceiro());
        System.out.println("Vendas: " + this.totalVendas);
    }
    
    public boolean contabilizarVenda (double venda) {
        if (venda > 0) {
            this.totalVendas = this.totalVendas + venda;
            return true;
        } else {
            return false;
        }
    }

    /**
     * @return the nomeCompleto
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    /**
     * @param nomeCompleto the nomeCompleto to set
     */
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    /**
     * @return the taxaComissao
     */
    public static double getTaxaComissao() {
        return taxaComissao;
    }

    /**
     * @param aTaxaComissao the taxaComissao to set
     */
    public static void setTaxaComissao(double aTaxaComissao) {
        taxaComissao = aTaxaComissao;
    }

    /**
     * @return the totalVendas
     */
    public double getTotalVendas() {
        return totalVendas;
    }

    /**
     * @param totalVendas the totalVendas to set
     */
    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }
}
