package prog2java.Bimestre_1.revisao_prova;

public class Pessoa {
    private String nome;
    private int idade;
    private static int totalPessoas = 0;
    
    public Pessoa(){
        nome = "";
        idade = 0;
        totalPessoas++;
    }
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
        totalPessoas++;
    }
    
    public void cumprimentar(){
        System.out.println("Voce cumprimentou " + nome + "!");
    }
    
    public boolean ehMaiorDeIdade(){
        if(idade >= 18){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public int getTotal(){
        return totalPessoas;
    }
}
