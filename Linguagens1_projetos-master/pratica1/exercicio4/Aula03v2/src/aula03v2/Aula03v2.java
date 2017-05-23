package aula03v2;

public class Aula03v2 {
    
    public static void main(String[] args) {
        
        Conta c1;
        c1 = new Conta(42, "Rafael", "Negrao", "123.456.789-01", 5000);
        
        c1.visualizarConta();
        
        /*Conta c2 = new Conta();
        c2.saldo = 3000;
        c2.visualizarSaldo();
        
        c1.transferirPara(c2, 250);
        
        c1.visualizarSaldo();
        c2.visualizarSaldo();*/
    }
    
}
