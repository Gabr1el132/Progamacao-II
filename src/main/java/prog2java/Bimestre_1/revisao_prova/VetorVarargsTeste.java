package prog2java.Bimestre_1.revisao_prova;

public class VetorVarargsTeste {
    public static void main(String []args){
        int[] vetor1 = new int[3];
        vetor1[0] = 1;
        vetor1[1] = 2;
        vetor1[2] = 3;
        for(int i = 0; i < 3; i++){
            System.out.println(vetor1[i]);
        }
        Vetor_e_Varargs calc = new Vetor_e_Varargs();
        calc.somar(1, 2, 3);
        System.out.println("consegui");
    }
}
