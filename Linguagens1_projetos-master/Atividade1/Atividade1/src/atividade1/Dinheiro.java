//Victor Rampanha Nicolaus RA: 14.01617-6
//Rafael Negrão Chaves Caielli RA: 15.04095-0
package atividade1;

public class Dinheiro {
    private double valor;
    private String moeda;
    private static double taxaEuroDolar = 0.9249;
    private static double taxaRealDolar = 3.08;
    
    public Dinheiro(double valor, String moeda){
        this.valor = valor;
        this.moeda = moeda;
    }
    
    public double getTaxaRealDolar(){
        return taxaRealDolar;
    }
    
    public double getTaxaEuroDolar(){
        return taxaEuroDolar;
    }
    
    public String getMoeda(){
        return moeda;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setMoeda(String novaMoeda){
        this.moeda = novaMoeda;
    }
    
    public void setValor(double novoValor){
        this.valor = novoValor;
    }
    
    public void alterarTaxaRealDolar(double novaTaxa){
        taxaRealDolar = novaTaxa;
    }
    
    public void alterarTaxaEuroDolar(double novaTaxa){
        taxaEuroDolar = novaTaxa;
    }
    
    public static double realParaDolar(double real){
        real = real/taxaRealDolar;
        return real;
    }
    
    public static double dolarParaReal(double dolar){
        dolar = dolar*taxaRealDolar;
        return dolar;
    }
    
    public static double euroParaDolar(double euro){
        euro = euro/taxaEuroDolar;
        return euro;
    }
    
    public static double dolarParaEuro(double dolar){
        dolar = dolar*taxaEuroDolar;
        return dolar;
    }
    
    public boolean comparaReal(String moeda){
        if (moeda.equals("real")){
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean comparaEuro(String moeda){
        if (moeda.equals("euro")){
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean comparaDolar(String moeda){
        if (moeda.equals("dolar")){
            return true;
        }
        else {
            return false;
        }
    }
            
    public double valorEmReal(double num, String moeda){
        if (this.comparaDolar(moeda)){
            num = this.dolarParaReal(num);
        }
        if (this.comparaEuro(moeda)){
            num = this.euroParaDolar(num);
            num = this.dolarParaReal(num);
        }
        else{
            System.out.println("O valor já está em real.");
        }
        return num;
    }
    
    public double valorEmDolar(double num, String moeda){
        if (this.comparaReal(moeda)){
            num = this.realParaDolar(num);
        }
        if (this.comparaEuro(moeda)){
            num = this.euroParaDolar(num);
        }
        else{
            System.out.println("O valor já está em dolar.");
        }
        return num;
    }
    
    public double valorEmEuro(double num, String moeda){
        if (this.comparaDolar(moeda)){
            num = this.dolarParaEuro(num);
        }
        if (this.comparaReal(moeda)){
            num = this.realParaDolar(num);
            num = this.dolarParaEuro(num);
        }
        else{
            System.out.println("O valor já está em euro.");
        }
        return num;
    }
}
