
package Controlador;

import Modelo.Vehiculo;
import java.util.ArrayList;

public class Servicio {
    ArrayList<Modelo.Servicio> servicios;

    public Servicio() {
        servicios=new ArrayList<>();
        //servicios.add(new Modelo.Servicio(new Vehiculo(new Modelo.TipoVehiculo(101, "Bisci", 0), "BCA-123", "Milena"), "18", "04", "2021", "18000", "1000", "0", "17000"));
    }

    public boolean agregarServicio(Modelo.Servicio servicio){
        servicios.add(servicio);
        return true;
    }
    
    public ArrayList<Modelo.Servicio> getServicios() {
        return servicios;
    }
    
}
