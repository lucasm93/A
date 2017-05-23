package exercicio3;
import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nVend;
        int nGer;
        Concessionaria conc;
        boolean continua = true;
        
        System.out.println("Número máximo de gerentes da sua concessionária:");
        nGer = scan.nextInt();
        System.out.println("Número máximo de vendedores da sua concessionária:");
        nVend = scan.nextInt();
        conc = new Concessionaria(nVend, nGer);
        
        do { 
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Inserir Funcionário");
            System.out.println("2 - Realizar Venda");
            System.out.println("3 - Exibir resumo");
            System.out.println("4 - Sair");
            int opcao = scan.nextInt();
            switch (opcao){
                case 1:
                    Exercicio3.menuInserirFuncionario(conc);
                    break;
                case 2:
                    Exercicio3.menuRealizarVenda(conc, nVend, nGer);
                    break;
                case 3:
                    Exercicio3.menuExibirResumo(conc);
                    break;
                case 4:
                    continua = false;
                    break;
            }
            
        } while (continua);
    }
    
    private static void menuInserirFuncionario(Concessionaria conc){
        Scanner scan = new Scanner(System.in);
        boolean continua = true;
        do {            
            System.out.println("Selecione a opção desejada:");
            System.out.println("1 - Inserir Gerente");
            System.out.println("2 - Inserir Vendedor");
            System.out.println("3 - Voltar ao Menu Anterior");
            int opcao = scan.nextInt();
            String nome;
            String cpf;
            int reg;
            double sal;
            String senha;
            int regGer;
            switch (opcao){
                case 1:
                    System.out.println("Nome:");
                    nome = scan.next() + scan.next();
                    System.out.println("");
                    System.out.println("CPF:");
                    cpf = scan.next();
                    System.out.println("Registro:");
                    reg = scan.nextInt();
                    System.out.println("Salario base:");
                    sal = scan.nextDouble();
                    System.out.println("Senha:");
                    senha = scan.next();
                    conc.novoGerente(nome, cpf, reg, sal, senha);
                    break;
                case 2:
                    System.out.println("Crindo novo funcionario");
                    System.out.println("Nome:");
                    nome = scan.next() + scan.next();
                    System.out.println("CPF:");
                    cpf = scan.next();
                    System.out.println("Registro:");
                    reg = scan.nextInt();
                    System.out.println("Salario base:");
                    sal = scan.nextDouble();
                    System.out.println("Registro Gerente:");
                    regGer = scan.nextInt();
                    conc.novoVendedor(nome, cpf, reg, sal, regGer);
                    break;
                case 3:
                    continua = false;
                    break;
            } 
        } while (continua);
    }
    
    private static void menuRealizarVenda(Concessionaria conc, int nVend, int nGer){
        Scanner scan = new Scanner(System.in);
        boolean continua = true;
        System.out.println("1 - Vendedor");
        System.out.println("2 - Gerente");
        System.out.println("3 - Voltar ao Menu Anterior");
        int opcao = scan.nextInt();
        Vendedor vTemp;
        Gerente gTemp;
        int reg = 0;
        double venda;
        do {            
           switch (opcao){
               case 1:
                   System.out.println("Registro:");
                   reg = scan.nextInt();
                   System.out.println("Valor da venda:");
                   venda = scan.nextDouble();
                   int num = 0;
                   //procura no vetor de vendedor qual o indice correspondente ao registro
                   for(int i = 0; i < nVend; i++){
                       vTemp = conc.getVendedor(i);
                       if (reg == vTemp.getRegistro()){
                           num = i;
                           i = nVend;
                       }
                   }
                   vTemp = conc.getVendedor(num);
                   vTemp.realizarVenda(venda);
                   break;
               case 2:
                   System.out.println("Registro:");
                   reg = scan.nextInt();
                   System.out.println("Valor da venda:");
                   venda = scan.nextDouble();
                   num = 0;
                   //procura no vetor de gerente qual o indice correspondente ao registro
                   for(int i = 0; i < nGer; i++){
                       gTemp = conc.getGerente(i);
                       if (reg == gTemp.getRegistro()){
                           num = i;
                           i = nGer;
                       }
                   }
                   gTemp = conc.getGerente(num);
                   gTemp.realizarVenda(venda);
                   break;
               case 3:
                   continua = false;
                   break;
           } 
        } while (continua);
    }
    
    private static void menuExibirResumo(Concessionaria conc){
        System.out.println("Resumo da Concessionária:");
        System.out.println("");
    }
}
