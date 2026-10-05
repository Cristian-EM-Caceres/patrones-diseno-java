package Comportamiento.State;

public class MainState {
    public static void main(String[] args) {
        Documento doc = new Documento(); // Inicia en Borrador
        
        doc.publicar(); // Pasa a Revisión
        doc.publicar(); // Pasa a Publicado
        doc.publicar(); // Ya está publicado
        doc.cancelar(); // Lo retira y vuelve a Borrador
    }
}