package exerciciointerfaces;

public class Cliente implements IAutenticavel, IImprimivel{
    private String nome;
    private String cpf;
    private String endereco;
    private String senha;

    public Cliente(String nome, String cpf, String endereco, String senha) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
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
        if(this.senha.equals(senha)){
            return true;
        }
        else 
            return false;
    }

    @Override
    public void imprimirResumo() {
        this.exibirResumo();
        System.out.println("Imprimindo...");
    }

    @Override
    public void exibirResumo() {
        System.out.println("---RESUMO---");
    }
}