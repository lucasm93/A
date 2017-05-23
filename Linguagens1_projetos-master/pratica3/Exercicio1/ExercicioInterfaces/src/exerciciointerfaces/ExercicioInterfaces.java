package exerciciointerfaces;

public class ExercicioInterfaces {

    public static void main(String[] args) {
        Secretario sec = new Secretario("Jorge", 123, 2000);
        Gerente ger = new Gerente("Maria", 124, 5000, "coloquesenhaaqui");
        Diretor dir = new Diretor("João", 125, 10000, "outrasenha");
        Cliente cli = new Cliente("José", "123.456.789.01", "Rua dos Alfeneiros", "senharuim");
        Sistema sis = new Sistema();
        
        String senhaTentativaAcessoSistema = "outrasenha";
        
        if(sis.login(ger, senhaTentativaAcessoSistema)){
            System.out.println("acesso com sucesso");
        }
    }
    
}
