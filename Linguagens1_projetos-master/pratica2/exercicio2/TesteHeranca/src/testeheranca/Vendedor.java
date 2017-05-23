package testeheranca;

public class Vendedor {
    protected String nomeCompleto;
    protected String cpf;
    protected int registro;
    protected double salarioBase;
    protected static double taxaComissao = 0.03;
    protected double totalVendas;
    protected double horaExtra;
    private int registroGerente;
    
    public Vendedor(String n, String c, int r, double s, double h){
        this.nomeCompleto = n;
        this.cpf = c;
        this.registro = r;
        this.salarioBase = s;
        this.horaExtra = h;
    }
    
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }
    
    public void setNomeCompleto(String n){
        this.nomeCompleto = n;
    }
    
    public String getCpf(){
        return this.cpf;
    }
    
    public void setCpf(String n){
        this.cpf = n;
    }
    
    public int getRegistro(){
        return this.registro;
    }
    
    public void setRegistro(int n){
        this.registro = n;
    }
    
    public double getTaxaComissao(){
        return Vendedor.taxaComissao;
    }
    
    public void setTaxaRegistro(double n){
        Vendedor.taxaComissao = n;
    }
    
    public int getRegistroGerente(){
        return this.registroGerente;
    }
    
    public void setSalario(double salario){
        this.salarioBase = salario;
    }
    
    public double getSalario(){
        return this.salarioBase;
    }
    
    public double getHoraExtra(){
        return this.horaExtra;
    }
    
    public void setHoraExtra(double n){
        this.horaExtra = n;
    }
    
    public void setRegistroGerente(GerenteVendas g){
        this.registroGerente = g.getRegistro();
        g.contabilizarVendedor();
    }
    
    public double calcularComissao(){
        return this.totalVendas * Vendedor.taxaComissao;
    }
    
    public double calcularDecTer(){
        return this.salarioBase + 1;
    }
    
    public double calcularSalarioMes(){
        return this.salarioBase + this.horaExtra + this.calcularComissao();
    }
    
    public double calcularFerias(){
        return this.salarioBase + this.salarioBase/3;
    }
    
    public boolean contabilizarVenda(double valor){
        if (valor > 0){
            this.totalVendas = valor + this.totalVendas;
            return true;
        }
        else {
            return false;
        }
    }
    
    public void exibirResumo(){
        System.out.println("Registro: " + this.registro);
        System.out.println("Nome: " + this.nomeCompleto);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Salario do Mes: " + this.calcularSalarioMes());
        System.out.println("Comissao: " + this.calcularComissao());
        System.out.println("Ferias: " + this.calcularFerias());
        System.out.println("Decimo Terceiro: " + this.calcularDecTer());
    }
}
