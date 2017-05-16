package aula03;

public class Aula03 {

    public static void main(String[] args) {

        Conta c1 = new Conta("Victor", "Xavier", "342.234.245-67");
        Conta minhaConta = new Conta("Pedro", "Cattel", "675.054.325-75");
        
        c1.getDados();
        
        c1.depositar(1000);

        c1.visualizarSaldo();

        c1.sacar(200);
        c1.visualizarSaldo();
        
        minhaConta.visualizarSaldo();

        minhaConta.transferirPara(c1, 200);

        c1.visualizarSaldo();
        minhaConta.visualizarSaldo();
        
        int total = Conta.getTotalDeContas();
        System.out.println("Total de Contas: " + total);
    }

}
