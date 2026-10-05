package creacionales.builder;

public class Computadora {
    // Atributos obligatorios y opcionales
    private String procesador;
    private int ram;
    private int almacenamiento;
    private String tarjetaGrafica;

    // Constructor accesible para el builder
    Computadora(String procesador, int ram, int almacenamiento, String tarjetaGrafica) {
        this.procesador = procesador;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tarjetaGrafica = tarjetaGrafica;
    }

    @Override
    public String toString() {
        return "Computadora [" +
                "CPU='" + procesador + '\'' +
                ", RAM=" + ram + "GB" +
                ", Disco=" + almacenamiento + "GB" +
                ", GPU='" + (tarjetaGrafica != null ? tarjetaGrafica : "Integrada") + '\'' +
                ']';
    }
}