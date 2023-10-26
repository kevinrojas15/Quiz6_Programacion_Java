public class Circulo  {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }


    public double obtenerArea() {
        return Math.PI * radio * radio;
    }


    public double obtenerPerimetro() {
        return 2 * Math.PI * radio;
    }

}
