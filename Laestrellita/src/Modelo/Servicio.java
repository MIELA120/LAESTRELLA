
package Modelo;


public class Servicio {
    
     private boolean lavadoBasico;
     private boolean lavadoEspecial;
     private boolean desinfeccionBasic;
     private boolean desinfeccionEsp;
     private boolean combo1;
     private boolean combo2;
     private boolean combo3;
     
     Modelo.Funcionario funcionario;
     private Modelo.Vehiculo vehiculo;
     private int dia;
     private int mes;
     private int año;
     
     private double precioT;
     private double descuento;
     private double precioAd;
     private double total;

    public Servicio(Modelo.Funcionario funcionario, Vehiculo vehiculo, String dia, String mes, String año, String precioT, String descuento, String precioAd, String total) {
        this.funcionario = funcionario;
        this.vehiculo = vehiculo;
        this.dia = Integer.parseInt(dia);
        this.mes = Integer.parseInt(mes);
        this.año = Integer.parseInt(año);
        this.precioT = Double.parseDouble(precioT);
        this.descuento = Double.parseDouble(descuento);
        this.precioAd = Double.parseDouble(precioAd);
        this.total = Double.parseDouble(total);
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public boolean isLavadoBasico() {
        return lavadoBasico;
    }

    public void setLavadoBasico(boolean lavadoBasico) {
        this.lavadoBasico = lavadoBasico;
    }

    public boolean isLavadoEspecial() {
        return lavadoEspecial;
    }

    public void setLavadoEspecial(boolean lavadoEspecial) {
        this.lavadoEspecial = lavadoEspecial;
    }

    public boolean isDesinfeccionBasic() {
        return desinfeccionBasic;
    }

    public void setDesinfeccionBasic(boolean desinfeccionBasic) {
        this.desinfeccionBasic = desinfeccionBasic;
    }

    public boolean isDesinfeccionEsp() {
        return desinfeccionEsp;
    }

    public void setDesinfeccionEsp(boolean desinfeccionEsp) {
        this.desinfeccionEsp = desinfeccionEsp;
    }

    public boolean isCombo1() {
        return combo1;
    }

    public void setCombo1(boolean combo1) {
        this.combo1 = combo1;
    }

    public boolean isCombo2() {
        return combo2;
    }

    public void setCombo2(boolean combo2) {
        this.combo2 = combo2;
    }

    public boolean isCombo3() {
        return combo3;
    }

    public void setCombo3(boolean combo3) {
        this.combo3 = combo3;
    }

    public double getPrecioT() {
        return precioT;
    }

    public void setPrecioT(double precioT) {
        this.precioT = precioT;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioAd() {
        return precioAd;
    }

    public void setPrecioAd(double precioAd) {
        this.precioAd = precioAd;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Modelo.Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Modelo.Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
     
}
