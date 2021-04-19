
package Modelo;


public class Vehiculo {
    
    private Modelo.TipoVehiculo tipoVehiculo;
    private String placa;
    private String cliente;

    public Vehiculo(TipoVehiculo tipoVehiculo, String placa, String cliente) {
        this.tipoVehiculo = tipoVehiculo;
        this.placa = placa;
        this.cliente = cliente;
    }
    
    public TipoVehiculo getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Cliente: "+cliente+" Placa: "+placa+" Tipo Vehiculo: "+tipoVehiculo.getTipoVehiculo()+" Porcentaje Adicional: "+tipoVehiculo.getPorcentajeAdicional();
    }
    
    
            
}
