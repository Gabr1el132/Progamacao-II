package prog2java.Bimestre_1.Trabalho1.marcianos;

public class marciano {
    private String nome;
    private int vidas;
    private static int contador = 0;
    
    public marciano(){
        nome = "";
        vidas = 3;
    }
    
    public marciano(String nome){
        this.nome = nome;
        vidas = 3;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void atacar(){
        if(contador > 3){
            System.out.println(nome + "esta corajoso e pode atacar!");
        }
        else{
            System.out.println(nome + "esta covarde e nao pode atacar!");
        }
    }    
}