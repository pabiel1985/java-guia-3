package ejercicio_1;

public class Bicicleta implements Transporte{
    private String numeroSerie;
    private TipoTransporte tipoTransporte;

    @Override
    public void arrancar() {
        System.out.println("La bicicleta arranco");
    }

    @Override
    public void detener() {
        System.out.println("La bicicleta se paro");
    }

    @Override
    public int obtenerCapacidad() {
        return 1;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public TipoTransporte getTipoTransporte() {
        return tipoTransporte;
    }

    public void setTipoTransporte(TipoTransporte tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public Bicicleta(String numeroSerie, TipoTransporte tipoTransporte) {
        this.numeroSerie = numeroSerie;
        this.tipoTransporte = tipoTransporte;
    }

    public Bicicleta() {
    }

    public void  ajustarAsiento(int altura){
        System.out.println("Ajustando asiento a: " + altura);
    }

}
