package Comportamiento.Strategy;

class CarritoCompras {
    private EstrategiaPago estrategia; // Referencia a la interfaz

    public void setEstrategia(EstrategiaPago estrategia) {
        this.estrategia = estrategia;
    }

    public void hacerCheckout(double total) {
        if (estrategia == null) {
            System.out.println("Por favor, seleccione un método de pago.");
            return;
        }
        // El contexto delega la acción a la estrategia seleccionada
        estrategia.procesarPago(total);
    }
}
