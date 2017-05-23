package aula03v2;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public Cliente(String nome, String sobre, String cpf){
        this.nome = nome;
        this.sobrenome = sobre;        
        this.cpf = cpf;
    }
    
    String getNome(){
        return this.nome;
    }
    
    String getSobrenome(){
        return this.sobrenome;
    }
    
    String getCpf(){
        return this.cpf;
    }
    
    public void alterarCpf(String novoCpf){
        if (this.validarCpf(this.cpf)){
            this.cpf = novoCpf;
        }
        else{
            System.out.println("Nao foi possivel alterar o CPF");
        } 
    }
    
    private boolean validarCpf(String cpf){
        /*
         codigo aqui
        */
        return true; //por enquanto
    }
}
