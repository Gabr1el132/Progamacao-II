package prog2java.Bimestre_2.Herança.CirculoCilindro;

import prog2java.Bimestre_2.Herança.CirculoCilindro.Cilindro;
import prog2java.Bimestre_2.Herança.CirculoCilindro.Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
        //Circulo
        Circulo cir = new Circulo(3);
        System.out.println(cir.calcularArea());
        //Cilindro
        Cilindro cil = new Cilindro(3, 3);
        System.out.println(cil.calcularArea());
    }
}
