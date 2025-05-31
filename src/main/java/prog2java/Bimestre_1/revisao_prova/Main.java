package prog2java.Bimestre_1.revisao_prova;

public class Main {
    public static void main(String[] args) {
        // Criando pessoa com construtor vazio
        Pessoa p1 = new Pessoa();
        p1.setNome("Ana");
        p1.setIdade(17);
        System.out.println(p1.getNome() + " tem " + p1.getIdade() + " anos.");
        System.out.println("É maior de idade? " + p1.ehMaiorDeIdade());
        p1.cumprimentar();

        System.out.println();

        // Criando pessoa com construtor com parâmetros
        Pessoa p2 = new Pessoa("Carlos", 25);
        System.out.println(p2.getNome() + " tem " + p2.getIdade() + " anos.");
        System.out.println("É maior de idade? " + p2.ehMaiorDeIdade());
        p2.cumprimentar();

        System.out.println();

        // Testando o contador de pessoas
        System.out.println("Total de pessoas criadas: " + p2.getTotal()); // Pode ser p1.getTotal() também
    }
}
