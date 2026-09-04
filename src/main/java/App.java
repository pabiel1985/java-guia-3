import ejercicio_1.Autobus;
import ejercicio_1.Bicicleta;
import ejercicio_1.TipoTransporte;
import ejercicio_1.Tranvia;
import ejercicio_2.Pato;
import ejercicio_2.Pez;

public class App {
    public static void main(String[] args) {
///ejercicio_1
        Autobus autobus1 = new Autobus(30, 511, TipoTransporte.AUTOBUS );
        Tranvia tranvia1 = new Tranvia(150, "Pilar", TipoTransporte.TRANVIA);
        Bicicleta bicicleta1 = new Bicicleta("1568",TipoTransporte.BICICLETA);
        autobus1.arrancar();
        tranvia1.arrancar();
        bicicleta1.arrancar();
        autobus1.detener();
        tranvia1.detener();
        bicicleta1.detener();
        System.out.println(autobus1.obtenerCapacidad());
        System.out.println(tranvia1.obtenerCapacidad());
        System.out.println(bicicleta1.obtenerCapacidad());
        System.out.println(autobus1.getNumeroLinea());
        System.out.println("Estado: arrancado");
        autobus1.anunciarParada("Moron");
        tranvia1.cambiarVia(234);
        bicicleta1.ajustarAsiento(45);

///ejercicio_2
        Pato pato = new Pato();
        pato.comer();
        pato.dormir();
        pato.nadar();
        pato.volar();
        pato.caminar();
        pato.hacerCuac();
        Pez pez = new Pez();
        pez.comer();
        pez.dormir();
        pez.nadar();
        pez.huir();
}
}
