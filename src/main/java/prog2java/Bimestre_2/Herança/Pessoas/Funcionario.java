package prog2java.Bimestre_2.Herança.Pessoas;

import prog2java.Bimestre_2.Herança.Pessoas.Pessoa;

public class Funcionario extends Pessoa{
    private double salario;
    
    Funcionario(){
        super();
        salario = 0.0;
    }
    
    Funcionario(String nome, String codigo, double salario){
        super(nome, codigo);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double mostrarSalario(double desconto){
        return salario - salario * desconto;
    }
}
