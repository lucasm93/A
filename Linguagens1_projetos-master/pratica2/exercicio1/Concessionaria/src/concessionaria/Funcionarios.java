package concessionaria;

public class Funcionarios {
    private String nomeCompleto;
    private String cpf;
    private int registro;
    private double salarioBase;
    private static double taxaComissao = 0.03;
    private double totalVendas;
    private double horaExtra;
    
    public Funcionarios(String n, String c, int r, double s, double h){
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
        return Funcionarios.taxaComissao;
    }
    
    public void setTaxaRegistro(double n){
        Funcionarios.taxaComissao = n;
    }
    
    public double getHoraExtra(){
        return this.horaExtra;
    }
    
    public void setHoraExtra(double n){
        this.horaExtra = n;
    }
    
    public double calcularComissao(){
        return this.totalVendas * Funcionarios.taxaComissao;
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
