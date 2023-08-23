public class Main {
    public static void main(String[] args) {
        Personaje[] personajes = new Personaje[2];
        personajes[0] = new Jugador("Aragorn", 10, "Guerrero");
        personajes[1] = new Enemigo("Orco Malvado", 5, "Orco");

        for (Personaje personaje : personajes) {
            personaje.atacar();

            if (personaje instanceof Jugador) {
                Jugador jugador = (Jugador) personaje;
                jugador.usarHabilidadEspecial();
            } else if (personaje instanceof Enemigo) {
                Enemigo enemigo = (Enemigo) personaje;
                enemigo.gritar();
            }

            System.out.println("----------------");
        }
    }
}
