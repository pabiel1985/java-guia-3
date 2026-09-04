package ejercicio_2;

public class Pez implements Actividades_Comunes, Nadador{

    @Override
    public void dormir() {
        System.out.println("El pez esta dormido");
    }

    @Override
    public void comer() {
        System.out.println("El pez esta comiendo");
    }

    @Override
    public void nadar() {
        System.out.println("El pez esta nadando");
    }

    public void huir() {
        System.out.println("El pez huye porque hay peligro");
    }
}
