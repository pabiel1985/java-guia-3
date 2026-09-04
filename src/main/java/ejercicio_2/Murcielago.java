package ejercicio_2;

public class Murcielago implements Actividades_Comunes, Volador{

    @Override
    public void dormir() {
        System.out.println("El Murcielago esta durmiendo");
    }

    @Override
    public void comer() {
        System.out.println("El Murcielago esta comiendo");
    }

    @Override
    public void volar() {
        System.out.println("El Murcielago esta volando");
    }
}
