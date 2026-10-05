package Comportamiento.State;

class EnRevision implements EstadoDocumento {
    @Override
    public void publicar(Documento doc) {
        System.out.println("Documento aprobado y publicado.");
        doc.setEstado(new Publicado()); // Transición de estado
    }

    @Override
    public void cancelar(Documento doc) {
        System.out.println("Revisión cancelada. Vuelve a borrador.");
        doc.setEstado(new Borrador()); // Transición de estado
    }
}