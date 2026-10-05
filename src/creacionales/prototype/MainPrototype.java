package creacionales.prototype;

public class MainPrototype {
    public static void main(String[] args) {
        // Objeto base ya inicializado
        Enemigo orcoBase = new Enemigo("Orco Guerrero", 100, 25);

        // Clonamos para generar nuevas instancias rápidamente
        Enemigo orco1 = (Enemigo) orcoBase.clonar();
        Enemigo orco2 = (Enemigo) orcoBase.clonar();

        // Modificamos solo el clon sin alterar el original
        orco2.setVida(50); // Un orco que entra herido

        System.out.println("--- Prototipo Base ---");
        orcoBase.mostrarInfo();

        System.out.println("--- Clones en el juego ---");
        orco1.mostrarInfo();
        orco2.mostrarInfo();
    }
}