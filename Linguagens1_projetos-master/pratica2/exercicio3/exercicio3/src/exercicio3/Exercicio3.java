/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;
import java.util.Scanner;
/**
 *
 * @author thomazerlach
 */
public class Exercicio3 {
    static Concessionaria cons;
    static Vendedor vTemp;
    static Gerente gTemp;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int s = 0;
        
        //perguntar n vendedores
        System.out.println("Quantidade máxima de vendedores?");
        int nVend = scan.nextInt();
        //perguntar n gerentes
        System.out.println("Quantidade máxima de Gerentes?");
        int nGer = scan.nextInt();
        
        cons = new Concessionaria(nVend, nGer);
        
        //Menu
        do {            
            System.out.println("Menu Concessionaria:");
            System.out.println("1 - Inserir Funcionario");
            System.out.println("2 - Gerir Funcionario");
            System.out.println("3 - Realizar Venda");
            System.out.println("4 - Exibir Resumo");
            System.out.println("5 - Sair");
            
            int n = scan.nextInt();
            switch (n) {
                case 1:
                    inserirFunc();
                    break;
                case 2:
                    gerirFunc();
                    break;
                case 3:
                    venda();
                    break;
                case 4:
                    resumo();
                    break;
                case 5:
                    s = 1;
                    break;
            }
        } while (s != 1);
    }
    
    private static void inserirFunc () {
        Scanner scan = new Scanner(System.in);
        int s = 0;
        do {
            System.out.println("Menu Inserir Funcionario:");
            System.out.println("1 - Inserir Vendedor");
            System.out.println("2 - Inserir Gerente");
            System.out.println("3 - Voltar");
            
            int n = scan.nextInt();
            switch (n) {
                case 1:
                    inserirVend();
                    break;
                case 2:
                    inserirGer();
                    break;
                case 3:
                    s = 1;
                    break;
            }
        } while (s != 1);
    }
    
    private static void inserirVend () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome?");
        String nome = scan.next();
        System.out.println("Cpf?");
        String cpf = scan.next();
        System.out.println("Registro?");
        int reg = scan.nextInt();
        System.out.println("Salario?");
        double sal = scan.nextDouble();
        cons.novoVendedor(nome, cpf, reg, sal);
    }
    
    private static void inserirGer () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nome?");
        String nome = scan.next();
        System.out.println("Cpf?");
        String cpf = scan.next();
        System.out.println("Registro?");
        int reg = scan.nextInt();
        System.out.println("Salario?");
        double sal = scan.nextDouble();
        cons.novoGerente(nome, cpf, reg, sal);
    }
    
    private static void gerirFunc () {
    
    }
    
    private static void venda () {
        Scanner scan = new Scanner(System.in);
        int s = 0;
        do {            
            System.out.println("Menu Vendas:");
            System.out.println("1 - Vendedor");
            System.out.println("2 - Gerente");
            System.out.println("3 - Voltar");
            
            int n = scan.nextInt();
            switch (n) {
                case 1:
                    vendaVend();
                    break;
                case 2:
                    vendaGer();
                    break;
                case 3:
                    s = 1;
                    break;
            }
        } while (s != 1);
    }
    
    private static void vendaVend () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Vendedores:");
        for (int i = 0; i < cons.getNumVend(); i++) {
            vTemp = cons.getVendedor(i);
            System.out.println(i + " - " + vTemp.getNome());
        }
        int n = scan.nextInt();
        vTemp = cons.getVendedor(n);
        System.out.println("Qual valor?");
        double valor = scan.nextDouble();
        vTemp.realizarVenda(valor);
        System.out.println("Venda realizada!");
    }
    
    private static void vendaGer () {
        Scanner scan = new Scanner(System.in);
        System.out.println("Gerentes:");
        for (int i = 0; i < cons.getNumGer(); i++) {
            gTemp = cons.getGerente(i);
            System.out.println(i + " - " + gTemp.getNome());
        }
        int n = scan.nextInt();
        gTemp = cons.getGerente(n);
        System.out.println("Qual valor?");
        double valor = scan.nextDouble();
        gTemp.realizarVenda(valor);
        System.out.println("Venda realizada!");
    }
    
    private static void resumo () {
    
    }
  
}
