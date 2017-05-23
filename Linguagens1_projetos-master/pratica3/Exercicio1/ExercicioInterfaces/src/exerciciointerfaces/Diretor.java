package exerciciointerfaces;

public class Diretor extends Funcionario implements IAutenticavel{
    private String senha;

    public Diretor(String n, int r, double s, String senha) {
        super(n, r, s);
        this.senha = senha;
    }
    
    public boolean alterarSenha(String senhaNova, String senhaAntiga) {
            if(this.autenticar(senhaAntiga)){
                this.senha = senhaNova;
                return true;
            }
            else
                return false;
    }
    
    @Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
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
