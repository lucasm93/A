package exerciciointerfaces;

public class Secretario extends Funcionario implements IExibicao{
    
    public Secretario(String n, int r, double s){
        super(n, r, s);
    }
    
    @Override
    public void exibirResumo() {
        System.out.println("---RESUMO---");
    }
    
    public boolean atenderTelefone(boolean ocupado){
        return !ocupado;
    }
}
