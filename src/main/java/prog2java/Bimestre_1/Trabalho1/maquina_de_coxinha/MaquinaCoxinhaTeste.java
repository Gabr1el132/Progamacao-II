package prog2java.Bimestre_1.Trabalho1.maquina_de_coxinha;

public class MaquinaCoxinhaTeste {
    public static void main(String[] args) {
        MaquinaCoxinha maquina = new MaquinaCoxinha();
        maquina.setCoxinha(10);
        System.out.println(maquina.getCoxinha());
        maquina.abastecerMaquina(10);
        maquina.abastecerMaquina(10);
        maquina.venderCoxinha();
        maquina.venderCoxinha(1000);
        maquina.venderCoxinha(10);
        maquina.esvaziarMaquina();
        System.out.println(maquina.getCoxinha());
    }
}
