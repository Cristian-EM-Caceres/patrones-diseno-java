package Comportamiento.State;

class Documento {
    private EstadoDocumento estadoActual;

    public Documento() {
        this.estadoActual = new Borrador(); // Estado inicial
    }

    public void setEstado(EstadoDocumento estado) {
        this.estadoActual = estado;
    }

    // El contexto delega la acción al estado actual
    public void publicar() {
        estadoActual.publicar(this);
    }

    public void cancelar() {
        estadoActual.cancelar(this);
    }
}
