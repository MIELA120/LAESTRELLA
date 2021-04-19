
package Vista;

import Modelo.Funcionario;
import Modelo.Vehiculo;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Servicio extends JFrame implements  ActionListener, ChangeListener{

    private Controlador.Servicio controlador;
    private Controlador.Funcionario contFuncionario;
    
    private Modelo.Vehiculo vehiculo;
    private Modelo.Funcionario funcionario;
    private JPanel p1, p2, p3, p4,p5, p6;
    private JCheckBox chx1,chx2,chx3,chx4,chx5,chx6,chx7;
    private JTextField txt1,txt2, txt3, txt4,txt5,txt6,txt7;
    
    private JLabel lblFuncionario,lblCliente, lblPlaca, lblTipoVehiculo, lblPorcentajeAd;
    private JLabel lblClienteAux, lblPlacaAux, lblTipoVehiculoAux, lblPorcentajeAdAux;
    private JButton btnServicio;
    private JComboBox cbxFuncionario;
    
    private JLabel lblFecha, lblPrecioT, lblDescuento, lblbPorcentajeAd, lblTotal;
    private JTextField txtPrecioT, txtDescuento, txtPorcentajeAd, txtTotal, txtDia, txtMes, txtAño;
    private JButton btnAplicar;
    
    public void setVehiculo(Modelo.Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public Servicio(Controlador.Servicio controlador, Controlador.Funcionario contFuncionario) {
        this.controlador=controlador;
        this.contFuncionario=contFuncionario;
        setTitle("Servicios");
        setBounds(500,200,550,500);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setLayout(new GridLayout(2, 1));
        
        
        p1=new JPanel(new GridLayout(7, 2));
        p2=new JPanel(new GridLayout(1, 2));
        p3=new JPanel(new GridLayout(6,2));
        p4=new JPanel(new GridLayout(5, 2));
        p5=new JPanel(new GridLayout(1, 2));
        p6=new JPanel(new GridLayout(1, 3));
        
        chx1=new JCheckBox("Lavado Básico");
        txt1=new JTextField("10000");
        chx2=new JCheckBox("Lavado Especial");
        txt2=new JTextField("20000");
        chx3=new JCheckBox("Desinfeccion Basica");
        txt3=new JTextField("8000");
        chx4=new JCheckBox("Desinfeccion Avanzada");
        txt4=new JTextField("15000");
        chx5=new JCheckBox("Combo 1");
        txt5=new JTextField("25000");
        chx6=new JCheckBox("Combo 2");
        txt6=new JTextField("22000");
        chx7=new JCheckBox("Combo 3");
        txt7=new JTextField("26000");
        
        lblFuncionario=new JLabel("Seleccione Funcionario: ");
        cbxFuncionario=new JComboBox();
        lblClienteAux=new JLabel("Nombre Cliente: ");
        lblCliente=new JLabel();
        lblPlacaAux=new JLabel("Placa Vehiculo: ");
        lblPlaca=new JLabel();
        lblTipoVehiculoAux=new JLabel("Tipo Vehiculo: ");
        lblTipoVehiculo=new JLabel();
        lblPorcentajeAdAux=new JLabel("Porcentaje Adicional: ");
        lblPorcentajeAd=new JLabel();
        btnServicio=new JButton("Solicitar");

        lblFecha=new JLabel("Fecha (DD/MM/AAAA): ");
        txtDia=new JTextField("18");
        txtMes=new JTextField("04");
        txtAño=new JTextField("2021");
        lblPrecioT=new JLabel("Precio Total: ");
        txtPrecioT=new JTextField();
        txtPrecioT.setEditable(false);
        lblDescuento=new JLabel("Descuento: ");
        txtDescuento=new JTextField("0");
        btnAplicar=new JButton("Aplicar");
        lblbPorcentajeAd=new JLabel("precio Adicional: ");
        txtPorcentajeAd=new JTextField();
        txtPorcentajeAd.setEditable(false);
        lblTotal=new JLabel("Total: ");
        txtTotal=new JTextField();
        txtTotal.setEditable(false);
        
        p1.setBackground(new Color(0xC1B3DE));
        p2.setBackground(new Color(0xC1B3DE));
        p3.setBackground(new Color(0x90F1C1));
        p4.setBackground(new Color(0xF2B8FC));
        
        
        add(p1);
        add(p2);
        p2.add(p3);
        p2.add(p4);
        
        p1.add(chx1);
        p1.add(txt1);
        p1.add(chx2);
        p1.add(txt2);
        p1.add(chx3);
        p1.add(txt3);
        p1.add(chx4);
        p1.add(txt4);
        p1.add(chx5);
        p1.add(txt5);
        p1.add(chx6);
        p1.add(txt6);
        p1.add(chx7);
        p1.add(txt7);

        
        p3.add(lblFuncionario);
        p3.add(cbxFuncionario);
        p3.add(lblClienteAux);
        p3.add(lblCliente);
        p3.add(lblPlacaAux);
        p3.add(lblPlaca);
        p3.add(lblTipoVehiculoAux);
        p3.add(lblTipoVehiculo);
        p3.add(lblPorcentajeAdAux);
        p3.add(lblPorcentajeAd);
        p3.add(btnServicio);
       
        p5.add(txtDescuento);
        p5.add(btnAplicar);
        
        p6.add(txtDia);
        p6.add(txtMes);
        p6.add(txtAño);
        
        p4.add(lblFecha);
        p4.add(p6);
        p4.add(lblPrecioT);
        p4.add(txtPrecioT);
        p4.add(lblDescuento);
        p4.add(p5);
        p4.add(lblbPorcentajeAd);
        p4.add(txtPorcentajeAd);
        p4.add(lblTotal);
        p4.add(txtTotal);
        
        
        chx1.addChangeListener(this);
        chx2.addChangeListener(this);
        chx3.addChangeListener(this);
        chx4.addChangeListener(this);
        chx5.addChangeListener(this);
        chx6.addChangeListener(this);
        chx7.addChangeListener(this);
                
        btnServicio.addActionListener(this);
        btnAplicar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String a=e.getActionCommand();
        if(a.equals("Aplicar")) stateChanged(null);
        if(a.equals("Solicitar")){
            Modelo.Servicio servicio=new Modelo.Servicio(contFuncionario.getFuncionarios().get(cbxFuncionario.getSelectedIndex()),vehiculo, txtDia.getText(), txtMes.getText(), txtAño.getText(), txtPrecioT.getText(), txtDescuento.getText(), txtPrecioT.getText(), txtTotal.getText());
            servicio.setLavadoBasico(chx1.isSelected());
            servicio.setLavadoEspecial(chx2.isSelected());
            servicio.setDesinfeccionBasic(chx3.isSelected());
            servicio.setDesinfeccionEsp(chx4.isSelected());
            servicio.setCombo1(chx5.isSelected());
            servicio.setCombo2(chx6.isSelected());
            servicio.setCombo3(chx7.isSelected());
            controlador.agregarServicio(servicio);
            JOptionPane.showMessageDialog(rootPane, "Se ha generado el servicio Correctamente");
        }
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        int total;
        int precio1,precio2,precio3, precio4, precio5, precio6, precio7;
        if(chx1.isSelected()) precio1=Integer.parseInt(txt1.getText());
        else precio1=0;
        if(chx2.isSelected()) precio2=Integer.parseInt(txt2.getText());
        else precio2=0;
        if(chx3.isSelected())precio3=Integer.parseInt(txt3.getText()) ;
        else precio3=0;
        if(chx4.isSelected()) precio4=Integer.parseInt(txt4.getText());
        else precio4=0;
        if(chx5.isSelected()) precio5=Integer.parseInt(txt5.getText());
        else precio5=0;
        if(chx6.isSelected()) precio6=Integer.parseInt(txt6.getText());
        else precio6=0;
        if(chx7.isSelected()) precio7=Integer.parseInt(txt7.getText());
        else precio7=0;
        total=precio1+precio2+precio3+ precio4+ precio5+ precio6+ precio7;
        txtPrecioT.setText(String.valueOf(total));
        double auxPorcentajeAd=total*((double)(vehiculo.getTipoVehiculo().getPorcentajeAdicional())/100);
        double descuento=Double.parseDouble(txtDescuento.getText());
        txtPorcentajeAd.setText(String.valueOf(auxPorcentajeAd));
        txtTotal.setText(String.valueOf(total+auxPorcentajeAd-descuento));
    }

    void limpiar() {
        Calendar fecha = new GregorianCalendar();
        chx1.setSelected(false);
        chx2.setSelected(false);
        chx3.setSelected(false);
        chx4.setSelected(false);
        chx5.setSelected(false);
        chx6.setSelected(false);
        chx7.setSelected(false);
        txtDia.setText(String.valueOf(fecha.get(Calendar.DAY_OF_MONTH)));
        txtMes.setText(String.valueOf(fecha.get(Calendar.MONTH)));
        txtAño.setText(String.valueOf(fecha.get(Calendar.YEAR)));
        
        txtDescuento.setText("0");
        lblCliente.setText(vehiculo.getCliente());
        lblPlaca.setText(vehiculo.getPlaca());
        lblTipoVehiculo.setText(vehiculo.getTipoVehiculo().getTipoVehiculo());
        lblPorcentajeAd.setText(String.valueOf(vehiculo.getTipoVehiculo().getPorcentajeAdicional())+"%");
        
        cbxFuncionario.removeAllItems();
        
        for (Funcionario funcionario : contFuncionario.getFuncionarios()) {
            cbxFuncionario.addItem(funcionario.getNombre()+" "+funcionario.getApellidos());
        }
    }
    
}
