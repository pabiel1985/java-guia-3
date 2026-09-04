package ejercicio_1;

public class Autobus implements Transporte {
    private int numeroLinea;
    private int capacidad;
    private TipoTransporte tipoTransporte;

    @Override
    public void arrancar() {
        System.out.println("El autobus arranco");
    }

    @Override
    public void detener() {
        System.out.println("El autobus se detuvo");
    }

    @Override
    public int obtenerCapacidad() {
    return capacidad;
    }

    public Autobus(int capacidad, int numeroLinea, TipoTransporte tipoTransporte) {
        this.capacidad = capacidad;
        this.numeroLinea = numeroLinea;
        this.tipoTransporte = tipoTransporte;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumeroLinea() {
        return numeroLinea;
    }

    public void setNumeroLinea(int numeroLinea) {
        this.numeroLinea = numeroLinea;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public Autobus() {
    }

    public void anunciarParada(String parada) {
        System.out.println("Anunciando parada " + parada);
    }
}
