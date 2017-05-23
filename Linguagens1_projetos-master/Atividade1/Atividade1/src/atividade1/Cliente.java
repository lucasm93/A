//Victor Rampanha Nicolaus RA: 14.01617-6
//Rafael Negrão Chaves Caielli RA: 15.04095-0
package atividade1;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String cpf;
    
    public Cliente(String nome, String sobre, String cpf){
        this.nome = nome;
        this.sobrenome = sobre;        
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    
    public void setSobrenome(String novoSobrenome){
        this.sobrenome = novoSobrenome;
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
