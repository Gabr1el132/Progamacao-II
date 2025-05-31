package prog2java.Bimestre_2.Herança.Pessoas;

public class Gerente extends Funcionario{
    private double gratificacao;
    
    Gerente(){
        super();
        gratificacao = 0.0;
    }
    
    Gerente(String nome, String codigo, double salario, double gratificacao){
        super(nome, codigo, salario);
        this.gratificacao = gratificacao;
    }

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    @Override
    public double mostrarSalario(double desconto){
        return getSalario() - getSalario() * desconto + gratificacao;
    }
}
