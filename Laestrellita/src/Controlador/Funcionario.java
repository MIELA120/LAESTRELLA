
package Controlador;

import java.util.ArrayList;

public class Funcionario {

    ArrayList<Modelo.Funcionario> funcionarios;
    
    public Funcionario() {
        funcionarios=new ArrayList<Modelo.Funcionario>();
        funcionarios.add(new Modelo.Funcionario("1001", "Juan", "Antonio", "321"));
        funcionarios.add(new Modelo.Funcionario("1002", "Jose", "Armando", "322"));
    }

    public ArrayList<Modelo.Funcionario> getFuncionarios() {
        return funcionarios;
    }
    
    public boolean crear(String documento, String nombre, String apellidos, String telefono){
        Modelo.Funcionario funcionario = new Modelo.Funcionario(documento, nombre, apellidos, telefono);
        funcionarios.add(funcionario);
        return true;
    }
    
}
