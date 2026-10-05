package Comportamiento.Strategy;

public class MainStrategy {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();
        
        // El cliente decide qué estrategia usar en tiempo de ejecución
        carrito.setEstrategia(new PagoTarjetaCredito("1234567890123456"));
        carrito.hacerCheckout(150.75);
        
        // Podemos cambiar la estrategia dinámicamente
        carrito.setEstrategia(new PagoPayPal("usuario@correo.com"));
        carrito.hacerCheckout(89.99);
    }
}
