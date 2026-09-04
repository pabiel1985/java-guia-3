package ejercicio_1;

public class Tranvia implements Transporte{
    private String ruta;
    private int capacidad;
    private TipoTransporte tipoTransporte;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public Tranvia(int capacidad, String ruta, TipoTransporte tipoTransporte) {
        this.capacidad = capacidad;
        this.ruta = ruta;
        this.tipoTransporte = tipoTransporte;
    }

    public Tranvia() {
    }

   public void cambiarVia(int nuevaVia){
       System.out.println("Cambiando Via a:" + nuevaVia);
   }

    @Override
    public void arrancar() {
        System.out.println("El tranvia arranco");
    }

    @Override
    public void detener() {
        System.out.println("El tranvia se detuvo");
    }

    @Override
    public int obtenerCapacidad() {
    return capacidad;
    }
}
