package concessionaria;

public class Concessionaria {

    public static void main(String[] args) {
        
        Funcionarios x = new Funcionarios("Rafael", "123", 1, 2000, 500);
        
        x.contabilizarVenda(1000);
        
        x.exibirResumo();
    }
    
}
