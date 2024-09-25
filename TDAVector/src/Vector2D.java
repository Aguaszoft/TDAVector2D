// Clase TDA Vector
public class Vector2D {
    private double x;  // Componente x del vector
    private double y;  // Componente y del vector

    // Constructor
    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Método para obtener la magnitud del vector
    public double magnitud() {
        return Math.sqrt(x * x + y * y);
    }

    // Método para sumar dos vectores
    public Vector2D sumar(Vector2D otro) {
        return new Vector2D(this.x + otro.x, this.y + otro.y);
    }

    // Método para el producto escalar
    public double productoEscalar(Vector2D otro) {
        return this.x * otro.x + this.y * otro.y;
    }

    // Representación del vector en formato legible
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Getters para las componentes del vector
    public double getX() { return x; }
    public double getY() { return y; }
}