package prog2java.Bimestre_2.Herança.CirculoCilindro;

import prog2java.Bimestre_2.Herança.CirculoCilindro.Circulo;

public class Cilindro extends Circulo {
    private double altura;
    
    Cilindro(){
        super();
        altura = 0.0;
    }
    
    Cilindro(double raio, double altura){
        super(raio);
        altura = this.altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return 2 * (Math.PI * Math.pow(getRaio(), 2)) + 2 * (Math.PI * getRaio() * altura);
    }
}
