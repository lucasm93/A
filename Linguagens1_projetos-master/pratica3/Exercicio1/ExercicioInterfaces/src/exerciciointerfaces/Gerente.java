package exerciciointerfaces;

public class Gerente extends Funcionario implements IAutenticavel{
    private String senha;

    public Gerente(String n, int r, double s, String senha) {
        super(n, r, s);
        this.senha = senha;
    }
    
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
    
    public boolean alterarSenha(String senhaNova, String senhaAntiga) {
            if(this.autenticar(senhaAntiga)){
                this.senha = senhaNova;
                return true;
            }
            else
                return false;
    }
    
    public boolean darAumento(String senha, Funcionario f, double valor){
        if(this.autenticar(senha)){
            f.setSalario(f.getSalario() + valor);
            return true;
        }
        else
            return false;
    }
}
