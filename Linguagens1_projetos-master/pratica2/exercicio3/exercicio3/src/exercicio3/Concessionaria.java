package exercicio3;

/**
 *
 * @author thomazerlach
 */
public class Concessionaria {
    
    private int totalFuncionarios;
    private double taxaBonus = 0.05;
    private int nVendedor = 0;
    private int nGerente = 0;
    private Vendedor[] vendedor;
    private Gerente[] gerente;
    
    public Concessionaria (int nVend, int nGer) {
        vendedor = new Vendedor[nVend];
        gerente = new Gerente[nGer];
    }
    
    private double calcularTotalVendas () {
        double totalVendas = 0;
        
        for (int i = 0; i < this.nVendedor; i++) {
            totalVendas += this.vendedor[i].getVendas();
        }
        
        for (int i = 0; i < this.nGerente; i++) {
            totalVendas += this.gerente[i].getVendas();
        }
        
        return totalVendas;
    }
    
    public boolean novoVendedor (String n, String cpf, int reg, double salario) {
        boolean result;
        if (this.nVendedor < this.vendedor.length) {
            this.vendedor[this.nVendedor] = new Vendedor(n, cpf, reg, salario);
            this.nVendedor++;
            this.totalFuncionarios++;
            result = true;
        } else
            result = false;
        
        return result;
    }
    
    public boolean novoGerente (String n, String cpf, int reg, double salario) {
        boolean result;
        if (this.nGerente < this.gerente.length) {
            this.gerente[this.nGerente] = new Gerente(n, cpf, reg, salario);
            this.nGerente++;
            this.totalFuncionarios++;
            result = true;
        } else
            result = false;
        
        return result;
    }
    
    public double calcularBonificacaoVendas () {
        return (this.calcularTotalVendas() / this.totalFuncionarios) * this.taxaBonus;
    }
    
    public void setTaxaBonus (double tx) {
        this.taxaBonus = tx;
    }
    
    public Vendedor getVendedor(int i) {
        return this.vendedor[i];
    }
    
    public Gerente getGerente(int i) {
        return this.gerente[i];
    }
    
    public int getNumVend (){
        return this.nVendedor;
    }
    
    public int getNumGer () {
        return this.nGerente;
    }
    
//    public void bonificacaoConcessionaria() {
//        this.bonusIndividual = (this.totalVendas/this.totalFuncionarios)*this.taxaBonus;
//    }
}
