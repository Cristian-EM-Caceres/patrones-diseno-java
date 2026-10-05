package Estructurales.Facade;

public class Main {
    public static void main(String[] args) {
        // El cliente solo interactúa con la fachada, es mucho más limpio
        CasaFacade miCasa = new CasaFacade();
        
        miCasa.activarModoNoche();
        // Salida: 
        // Iniciando Modo Noche...
        // 💡 Luces encendidas
        // ❄️ Aire acondicionado en 24°C
    }
}
