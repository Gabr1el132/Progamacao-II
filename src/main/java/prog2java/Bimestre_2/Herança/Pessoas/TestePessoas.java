package prog2java.Bimestre_2.Herança.Pessoas;

public class TestePessoas {
    public static void main(String[] args) {
        //Pessoa teste
        Pessoa p = new Pessoa("Reginaldo", "000");
        //Funcionario
        Funcionario f = new Funcionario("Leonardo", "123", 2000.00);
        System.out.println("Salario do funcionario:\nNome: " + f.getNome() + "\nCodigo: " + f.getCodigo() + "\nSalario: " + f.mostrarSalario(0.1));
        //Gerente
        Gerente g = new Gerente("Zacarias", "246", 3000.00, 100.00);
        System.out.println("Salario do gerente:\nNome: " + g.getNome() + "\nCodigo: " + g.getCodigo() + "\nSalario: " + g.mostrarSalario(0.1));
    }
}
