//Victor Rampanha Nicolaus RA: 14.01617-6
//Rafael Negrão Chaves Caielli RA: 15.04095-0
package atividade1;

public class Atividade1 {

    public static void main(String[] args) {

        Conta c1 = new Conta("Amilton", "Dias", "111.111.111-11", 1000, 250, "real");
        Conta c2 = new Conta("Henrique", "Diniz", "222.222.222-22", 3000, 1000, "dolar");
        Conta c3 = new Conta("Leonardo", "Nomo", "333.333.333-33", 200, 12000, "euro");
        Conta c4 = new Conta("Alberto", "Roberto", "444.444.444-44", 1800, 0, "real");
        
        c2.transferirPara(c1, 700);
        c2.transferirPara(c3, 2000);
        c1.exibirTodasInformacoesDaConta();
        c2.exibirTodasInformacoesDaConta();
        c3.exibirTodasInformacoesDaConta();
        
        c1.sacar(1800);
        c1.transferirPara(c4, 200);
        c1.exibirTodasInformacoesDaConta();
        c4.exibirTodasInformacoesDaConta();
        
        c3.transferirPara(c4, 10000);
        c3.transferirPara(c2, 1000);
        c2.exibirTodasInformacoesDaConta();
        c3.exibirTodasInformacoesDaConta();
        c4.exibirTodasInformacoesDaConta();
        
        c3.depositar(22000);
        
        c1.exibirTodasInformacoesDaConta();
        c2.exibirTodasInformacoesDaConta();
        c3.exibirTodasInformacoesDaConta();
        c4.exibirTodasInformacoesDaConta();
        
    }
    
}
