package prog2java.Bimestre_2.Herança.CirculoCilindro;

public class Circulo {
    private double raio;
    
    Circulo(){
        raio = 0.0;
    }
    
    Circulo(double raio){
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }
}
