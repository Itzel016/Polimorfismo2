class Jugador extends Personaje {
    private String clase;

    public Jugador(String nombre, int nivel, String clase) {
        super(nombre, nivel);
        this.clase = clase;
    }

    public void usarHabilidadEspecial() {
        System.out.println(nombre + " utiliza su habilidad especial como " + clase);
    }
}
