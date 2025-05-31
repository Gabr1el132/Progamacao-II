package prog2java.Bimestre_2.Herança.Pessoas;

public class Pessoa {
    private String nome;
    private String codigo;
    
    Pessoa(){
        nome = "";
        codigo = "";
    }
    
    Pessoa(String nome, String codigo){
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
