
package Modelo;

public class TipoVehiculo {
    private int id;
    private String tipoVehiculo;
    private int porcentajeAdicional;

    public TipoVehiculo(int id, String tipoVehiculo, int porcentajeAdicional) {
        this.id = id;
        this.tipoVehiculo = tipoVehiculo;
        this.porcentajeAdicional = porcentajeAdicional;
    }

    public int getPorcentajeAdicional() {
        return porcentajeAdicional;
    }

    public void setPorcentajeAdicional(int porcentajeAdicional) {
        this.porcentajeAdicional = porcentajeAdicional;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }
    
}
