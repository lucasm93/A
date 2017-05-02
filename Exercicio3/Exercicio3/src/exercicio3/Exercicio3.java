package exercicio3;
import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int nVend;
        int nGer;
        //perguntar num vendedores
        System.out.println("Quantos vendedores terá sua concessionária?");
        nVend = scan.nextInt();
        
        //perguntar num gerentes
        System.out.println("Quantos gerentes terá sua concessionária?");
        nGer = scan.nextInt();
        
        Concessionaria cons = new Concessionaria(nVend, nGer);
        
        String nome;
        String cpf;
        int reg;
        double sal;
        int regGer;
        for (int i = 0; i < nVend; i++){
            System.out.println("Crindo novo funcionario");
            System.out.println("Nome:");
            nome = scan.nextLine();
            System.out.println("CPF:");
            nome = scan.nextLine();
            System.out.println("Registro:");
            nome = scan.nextLine();
            System.out.println("Salario base:");
            nome = scan.nextLine();
            System.out.println("Registro Gerente:");
            nome = scan.nextLine();
            cons.novoVendedor(nome, cpf, reg, sal, regGer);
        }
    }
    
}
