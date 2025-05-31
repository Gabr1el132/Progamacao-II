package prog2java.Bimestre_1.revisao_prova;

public class Vetor_e_Varargs {
    private int soma = 0;
    
    public void somar(int... numeros){
        for(int i = 0; i<numeros.length; i++){
            soma += numeros[i];
        }
        System.out.println("Soma: " + soma);
    }
}
