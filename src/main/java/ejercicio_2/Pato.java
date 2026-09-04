package ejercicio_2;

public class Pato implements Actividades_Comunes, Nadador, Caminador, Volador {


    @Override
    public void dormir() {
        System.out.println("El Pato esta durmiendo");
    }

    @Override
    public void comer() {
        System.out.println("El Pato esta comiendo");
    }

    @Override
    public void caminar() {
        System.out.println("El Pato esta caminando");
    }

    @Override
    public void nadar() {
        System.out.println("El Pato esta nadando");
    }

    @Override
    public void volar() {
        System.out.println("El Pato esta volando");
    }

    public void hacerCuac() {
        System.out.println("¡Cuac!");
    }
}
