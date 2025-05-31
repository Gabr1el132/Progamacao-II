package prog2java.Bimestre_1.robo;

public class Robo {
    private String nome;
    private Ponto posicao;
    
    public Robo(String nome, Ponto posicao){
        this.nome = nome;
        this.posicao = posicao;
    }
    
    public Robo(){
        nome = "";
        posicao = new Ponto();
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void moverDireita(){
        posicao.setX(this.posicao.getX() + 1);
    }
    
    public void moverEsquerda(){
        posicao.setX(this.posicao.getX() - 1);
    }
    
    public void andarCima(){
        posicao.setY(this.posicao.getY() + 1);
    }
    
    public void andarBaixo(){
        posicao.setY(this.posicao.getY() - 1);
    }
    
    public void teleportar(){
        posicao.setX(20);
        posicao.setY(20);
    }
    
    public void exibirPosicao(){
        System.out.println("Posicao do robo: " + posicao.getX() + ", " + posicao.getY());
    }
}
