package aula03;

public class Cliente {
    
    private String nome;
    private String sobrenome;
    private String cpf;
    
    void visualizarDados() {
        System.out.println("Nome : " + this.nome + " " + this.sobrenome);
        System.out.println("CPF: " + this.cpf);
    }
    
    public void mudarCPF(String cpf) {
        if (ValidarCPF(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("Não foi possivel alterar o CPF.");
        }
    }
    
    private boolean ValidarCPF(String cpf) {
        // serie de regras
        return true;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSobreome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}
