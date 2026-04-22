public class Club {
    private String nombre = "Falta Nombre";
    private int cantDeMiembros = 0;
    private Presidente presidente;
    public String tipo;

    public Club(String nombre, int cantDeMiembros, String tipo) {
        this.nombre = nombre;
        this.cantDeMiembros = cantDeMiembros;
        this.tipo = tipo;
    }
}
