public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }


    public double obtenerArea() {
        return 0.5 * base * altura;
    }


    public double obtenerPerimetro() {
        // No se puede calcular el perímetro de un triángulo genérico
        return -1;
    }

}
