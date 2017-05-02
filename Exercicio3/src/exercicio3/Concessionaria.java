package exercicio3;

public class Concessionaria {
    private int totalFuncionarios = 0;
    private double taxaBonus = 0.05;
    private int nVendedores = 0;
    private int nGerentes = 0;
    private Vendedor[] vendedores;
    private Gerente[] gerentes;
    
    public Concessionaria(int nVend, int nGer){
        vendedores = new Vendedor[nVend];
        gerentes = new Gerente[nGer];
    }
    
    private double calcularTotalVendas(){
        double totalVendas = 0;
        for (int i = 0; i < this.nVendedores; i++){
            totalVendas += this.vendedores[i].getVendas();
        }
        for(int i = 0; i < this.nGerentes; i++){
            totalVendas += this.gerentes[i].getVendas();
        }
        return totalVendas;
    }
    
    public boolean novoVendedor(String nome, String cpf, int reg, double sal, int regGerente){
        boolean confirma;
        if (this.nVendedores < this.vendedores.length){
            this.vendedores[this.nVendedores] = new Vendedor(nome, cpf, reg, sal, regGerente);
            this.nVendedores++;
            this.totalFuncionarios++;
            confirma = true;
        }
        else
            confirma = false;
        return confirma;
    }
    
    public boolean novoGerente(String nome, String cpf, int reg, double sal, String senha){
        boolean confirma;
        if (this.nGerentes < this.gerentes.length){
            this.gerentes[this.nGerentes] = new Gerente(nome, cpf, reg, sal, senha);
            this.nGerentes++;
            this.totalFuncionarios++;
            confirma = true;
        }
        else
            confirma = false;
        return confirma;
    }
    
    public double calcularBonus(){
        return this.taxaBonus * (this.calcularTotalVendas()/this.totalFuncionarios);
    }

    public void setTaxaBonus(double taxaBonus) {
        this.taxaBonus = taxaBonus;
    }
    
    
}
