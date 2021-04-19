
package Controlador;

import java.util.ArrayList;

public class TipoVehiculo {

    private ArrayList<Modelo.TipoVehiculo> tiposVehiculos;
    
    public TipoVehiculo() {
        tiposVehiculos = new ArrayList<>();
        tiposVehiculos.add(new Modelo.TipoVehiculo(100, "Automovil", 0));
        tiposVehiculos.add(new Modelo.TipoVehiculo(101, "Camion", 20));
    }
    
    public boolean crearTipo(int id, String tipoVehiculo, int porcentajeAdicional){
        Modelo.TipoVehiculo tipo = new Modelo.TipoVehiculo(id, tipoVehiculo, porcentajeAdicional);
        tiposVehiculos.add(tipo);
        return true;
    }

    public ArrayList<Modelo.TipoVehiculo> getTiposVehiculos() {
        return tiposVehiculos;
    }    
    
    public Modelo.TipoVehiculo getTiposVehiculos(int indice) {
        return tiposVehiculos.get(indice);
    } 
}
