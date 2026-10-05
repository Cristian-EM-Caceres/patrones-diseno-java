package Estructurales.Decorator;

public class Main {
    public static void main(String[] args) {
        // Creamos la alerta básica
        Notificacion alerta = new Email();
        
        // La envolvemos con el decorador SMS
        alerta = new DecoradorSMS(alerta); 
        
        alerta.enviar(); 
        // Salida: Enviando Email + Envío SMS
    }
}
