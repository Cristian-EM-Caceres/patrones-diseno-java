package Estructurales.Decorator;

public class DecoradorSMS implements Notificacion {
    private Notificacion objetoEnvuelto;
    
    public DecoradorSMS(Notificacion objeto) { 
        this.objetoEnvuelto = objeto; 
    }
    
    @Override
    public void enviar() {
        objetoEnvuelto.enviar();           // 1. Ejecuta el comportamiento original
        System.out.print(" + Envío SMS");  // 2. Añade el comportamiento nuevo
    }
}
