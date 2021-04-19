package Vista;

import Controlador.TipoVehiculo;
import Modelo.Funcionario;
import Modelo.Vehiculo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class Principal extends JFrame implements ActionListener, ItemListener{

    Servicio VistaService;
    Controlador.Funcionario conFuncionario;
    Controlador.TipoVehiculo tipoVehiculo;
    Controlador.Servicio contServicio;
    JFrame funcionariosFrame;
    JTable tblFuncionarios, tblServicio;
    DefaultTableModel modeloTabla, modeloTablaServ;
    JPanel p1,p2,p3,p4,p5,p6,p7;   
    
    JButton btnActualizar, btnFiltroFunci, btnFiltroServ,btnFiltroFecha;
    private JComboBox cbxFuncionario, cbxServicio;
    JTextField txtFechaIni, txtFechaFin;
    
    JLabel lblPlaca, lblCliente, lblTipoVehiculo, lblTarijaAdicional;
    JTextField txtPlaca, txtCliente, txtTarifaAdicional;
    JComboBox cbxTipoVehiculo;
    JButton btnServicios, btnCrearTipo;
    
    
    JLabel lblDocumento, lblNombre, lblApellidos, lblTelefono;
    JTextField txtDocumento, txtNombre, txtApellidos, txtTelefono;
    JButton btnMostrar, btnCrear;
    
    
    
    public Principal() {
        conFuncionario=new Controlador.Funcionario();
        contServicio=new Controlador.Servicio();
        VistaService = new Servicio(contServicio, conFuncionario);
        tipoVehiculo = new TipoVehiculo();
        setTitle("La Estrella");
        setBounds(100, 100, 800, 800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,1));
        
        p1=new JPanel(new GridLayout(3, 4));
        p2=new JPanel(new GridLayout(1, 2));
        p3=new JPanel(new GridLayout(5, 2));
        p4=new JPanel(new GridLayout(5, 2));
        p5=new JPanel(new BorderLayout());
        p6=new JPanel(new BorderLayout());
        p7=new JPanel(new BorderLayout());
        
        cbxFuncionario=new JComboBox();
        cbxServicio=new JComboBox();
        for (Funcionario funcionario : conFuncionario.getFuncionarios()) {
            cbxFuncionario.addItem(funcionario.getNombre()+" "+funcionario.getApellidos());
        }
        cbxServicio.addItem("Lavado Basico");
        cbxServicio.addItem("Lavado Especial");
        cbxServicio.addItem("Desinfección básica");
        cbxServicio.addItem("Desinfección Avanzada");
        cbxServicio.addItem("Combo 1");
        cbxServicio.addItem("Combo 2");
        cbxServicio.addItem("Combo 3");
        btnActualizar=new JButton("Actualizar");
        btnFiltroFunci=new JButton("Filtro Funcionario");
        btnFiltroServ=new JButton("Filtro Servicio");
        btnFiltroFecha=new JButton("Filtrar Fecha");
        txtFechaIni=new JTextField();
        txtFechaFin=new JTextField();
        
        
        lblPlaca=new JLabel("Placa: ");
        txtPlaca=new JTextField();
        lblCliente=new JLabel("Cliente: ");
        txtCliente=new JTextField();
        lblTipoVehiculo=new JLabel("Tipo Vehiculo: ");
        actualizar();
        lblTarijaAdicional=new JLabel("Tarifa Adicional: ");
        txtTarifaAdicional=new JTextField("0%");
        txtTarifaAdicional.setEditable(false);
        btnServicios=new JButton("Servicios");
        btnCrearTipo = new JButton("Crear Tipo Vehiculo");
        
        lblDocumento= new JLabel("Documento");
        lblNombre = new JLabel("Nombre");
        lblApellidos=new JLabel("Apellidos");
        lblTelefono =new JLabel("Telefono");
        
        txtDocumento= new JTextField();
        txtNombre = new JTextField();
        txtApellidos=new JTextField();
        txtTelefono =new JTextField();
        
        btnCrear=new JButton("Crear");
        btnMostrar=new JButton("Mostrar");
        generarTabla();
        generarTablaServicio();
        p1.setBackground(new Color(0xC1B3DE));
        p2.setBackground(new Color(0xE3F1AF));
        p3.setBackground(new Color(0xF1E290));
        //p6.setBackground(Color.yellow);
        p4.setBackground(new Color(0xC1B3DE));
        //p7.setBackground(Color.green);
        p5.setBackground(new Color(0xC1B3DE));
        
        add(p1);
        add(p5);
        add(p2);
        
        p1.add(new JLabel("Seleccione Funcionario: "));
        p1.add(cbxFuncionario);
        p1.add(btnActualizar);
        p1.add(btnFiltroFunci);
        p1.add(new JLabel("Seleccione Tipo Servicio: "));
        p1.add(cbxServicio);
        p1.add(new JPanel());
        p1.add(btnFiltroServ);
        p1.add(new JLabel("Incerte fechas(DD/MM/AAAA): "));
        p1.add(txtFechaIni);
        p1.add(txtFechaFin);
        p1.add(btnFiltroFecha);
        
        p5.add(tblServicio.getTableHeader(), BorderLayout.NORTH);
        p5.add(tblServicio, BorderLayout.CENTER);
        
        p2.add(p6);
        p2.add(p7);
        p6.add(new JLabel("Automoviles"), BorderLayout.NORTH);
        p6.add(p3, BorderLayout.CENTER);
        p7.add(new JLabel("Funcionarios"), BorderLayout.NORTH);
        p7.add(p4,BorderLayout.CENTER);
        
        p3.add(lblPlaca);
        p3.add(txtPlaca);
        p3.add(lblCliente);
        p3.add(txtCliente);
        p3.add(lblTipoVehiculo);
        p3.add(cbxTipoVehiculo);
        p3.add(lblTarijaAdicional);
        p3.add(txtTarifaAdicional);
        p3.add(btnServicios);
        p3.add(btnCrearTipo);
        
        p4.add(lblDocumento);
        p4.add(txtDocumento);
        p4.add(lblNombre);
        p4.add(txtNombre);
        p4.add(lblApellidos);
        p4.add(txtApellidos);
        p4.add(lblTelefono);
        p4.add(txtTelefono);
        p4.add(btnCrear);
        p4.add(btnMostrar);
       
        btnServicios.addActionListener(this);
        btnCrearTipo.addActionListener(this);
        btnCrear.addActionListener(this);
        btnMostrar.addActionListener(this);
        btnActualizar.addActionListener(this);
        btnFiltroFunci.addActionListener(this);
        btnFiltroServ.addActionListener(this);
        cbxTipoVehiculo.addItemListener(this);
        
    }
    
    public void actualizar(){
        String[] items = new String[tipoVehiculo.getTiposVehiculos().size()];
        int i=0;
        for (Modelo.TipoVehiculo tiposVehiculo : tipoVehiculo.getTiposVehiculos()) {
            items[i]=tiposVehiculo.getTipoVehiculo();
            i++;
        }
        cbxTipoVehiculo=new JComboBox(items);
    }
    
    public void actualizarTblServicio(){
        
        int filas=modeloTablaServ.getRowCount();
        
        for(int i=0;i<filas;i++){
            modeloTablaServ.removeRow(i);
        }
        for (Modelo.Servicio servicio : contServicio.getServicios()) {
            AgregarFila(servicio);
        }
    }

    public void AgregarFila(Modelo.Servicio servicio){
            String[] contenido=new String[17];
        
            contenido[0]=servicio.getFuncionario().getNombre()+" "+servicio.getFuncionario().getApellidos();
            contenido[1]=servicio.getDia()+"/"+servicio.getMes()+"/"+servicio.getAño();
            contenido[2]=servicio.getVehiculo().getCliente();
            contenido[3]=servicio.getVehiculo().getPlaca();
            contenido[4]=servicio.getVehiculo().getTipoVehiculo().getTipoVehiculo();
            contenido[5]=String.valueOf(servicio.getVehiculo().getTipoVehiculo().getPorcentajeAdicional());
            contenido[6]=String.valueOf(servicio.getPrecioT());
            contenido[7]=String.valueOf(servicio.getDescuento());
            contenido[8]=String.valueOf(servicio.getPrecioAd());
            contenido[9]=String.valueOf(servicio.getTotal());
            contenido[10]=servicio.isLavadoBasico()?"SI":"NO";
            contenido[11]=servicio.isLavadoEspecial()?"SI":"NO";
            contenido[12]=servicio.isDesinfeccionBasic()?"SI":"NO";
            contenido[13]=servicio.isDesinfeccionEsp()?"SI":"NO";
            contenido[14]=servicio.isCombo1()?"SI":"NO";
            contenido[15]=servicio.isCombo2()?"SI":"NO";
            contenido[16]=servicio.isCombo3()?"SI":"NO";
            modeloTablaServ.addRow(contenido);
    }
    
    public void filtrarTblServicio(int idServicio){
        int filas=modeloTablaServ.getRowCount();
        for(int i=0;i<filas;i++){
            modeloTablaServ.removeRow(i);
        }
        for (Modelo.Servicio servicio : contServicio.getServicios()) {
            switch(idServicio){
                case 1:
                    if(servicio.isLavadoBasico()) AgregarFila(servicio);
                    break;
                case 2:
                    if(servicio.isLavadoEspecial()) AgregarFila(servicio);
                    break;
                case 3:
                    if(servicio.isDesinfeccionBasic()) AgregarFila(servicio);
                    break;
                case 4:
                    if(servicio.isDesinfeccionEsp()) AgregarFila(servicio);
                    break;
                case 5:
                    if(servicio.isCombo1()) AgregarFila(servicio);
                    break;
                case 6:
                    if(servicio.isCombo2()) AgregarFila(servicio);
                    break;
                case 7:
                    if(servicio.isCombo3()) AgregarFila(servicio);
                    break;
            }
            
        }
    }
    
    public void filtrarFuncionario(Modelo.Funcionario funcionario){
        int filas=modeloTablaServ.getRowCount();
        String[] contenido=new String[17];
        for(int i=0;i<filas;i++){
            modeloTablaServ.removeRow(i);
        }
        for (Modelo.Servicio servicio : contServicio.getServicios()) {
            if(funcionario==servicio.getFuncionario()){
                AgregarFila(servicio);
            }
            
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String a=e.getActionCommand();
        if(a=="Servicios"){
            if(txtPlaca.getText().equals("")|| txtCliente.getText().equals("")) JOptionPane.showMessageDialog(rootPane, "Los Campos de Placa y/o cliente estan vacios");
            else{
                VistaService.setVisible(true);
                Modelo.Vehiculo vehiculo = new Vehiculo(tipoVehiculo.getTiposVehiculos(cbxTipoVehiculo.getSelectedIndex()),txtPlaca.getText(),txtCliente.getText());
                VistaService.setVehiculo(vehiculo);
                VistaService.limpiar();
            }
            
        }
        if(a=="Crear Tipo Vehiculo"){
            int id=tipoVehiculo.getTiposVehiculos().size()+100;
            String tipoVeh=JOptionPane.showInputDialog("Ingrese el tipo Vehiculo ID: "+id);
            int porcentajeAdicional=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el porcentaje adicional ID: "+id));
            tipoVehiculo.crearTipo(id, tipoVeh, porcentajeAdicional);
            cbxTipoVehiculo.addItem(tipoVeh);
        }
        if(a=="Crear"){
            cbxFuncionario.addItem(txtNombre.getText()+" "+ txtApellidos.getText());
            conFuncionario.crear(txtDocumento.getText(), txtNombre.getText(), txtApellidos.getText(), txtTelefono.getText());
            modeloTabla.addRow(new String[]{txtDocumento.getText(),txtNombre.getText(),txtApellidos.getText(),txtTelefono.getText()});
            JOptionPane.showMessageDialog(rootPane, "Guardado Correctamente.");
            txtDocumento.setText("");
            txtNombre.setText("");
            txtApellidos.setText("");
            txtTelefono.setText("");
        }
        if(a=="Mostrar"){
            if(funcionariosFrame!=null) funcionariosFrame.dispose();
            funcionariosFrame = new JFrame("Funcionarios");
            funcionariosFrame.setBounds(200, 500, 400, 200);
            funcionariosFrame.setVisible(true);
            funcionariosFrame.setLayout(new BorderLayout());
            funcionariosFrame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            funcionariosFrame.add(tblFuncionarios.getTableHeader(), BorderLayout.NORTH);
            funcionariosFrame.add(tblFuncionarios, BorderLayout.CENTER);
        }
        if(a=="Actualizar"){
            actualizarTblServicio();
        }
        if(a=="Filtro Funcionario"){
            filtrarFuncionario(conFuncionario.getFuncionarios().get(cbxFuncionario.getSelectedIndex()));
        }
        if(a=="Filtro Servicio"){
            filtrarTblServicio(cbxServicio.getSelectedIndex()+1);
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==cbxTipoVehiculo) {
            int seleccionado=cbxTipoVehiculo.getSelectedIndex();
            txtTarifaAdicional.setText(String.valueOf(tipoVehiculo.getTiposVehiculos().get(seleccionado).getPorcentajeAdicional())+"%");
        }
    }
    
    private void generarTablaServicio(){
        String[][] contenido=new String[contServicio.getServicios().size()][16];
        String[] titulos=new String[17];
        titulos[0]="Funcionario";
        titulos[1]="Fecha";
        titulos[2]="Cliente";
        titulos[3]="Placa";
        titulos[4]="Tipo";
        titulos[5]="Adicional";
        titulos[6]="PrecioTotal";
        titulos[7]="Descuento";
        titulos[8]="PrecioAdicional";
        titulos[9]="Total";
        titulos[10]="LavBasico";
        titulos[11]="LavEspecial";
        titulos[12]="DesifeccionBasica";
        titulos[13]="DesifeccionAvanzada";
        titulos[14]="Combo 1";
        titulos[15]="Combo 2";
        titulos[16]="Combo 3";
        int i=0;
        /*for (Modelo.Servicio servicio : contServicio.getServicios()) {
            contenido[i][0]=servicio.getDia()+"/"+servicio.getMes()+"/"+servicio.getAño();
            contenido[i][1]=servicio.getVehiculo().getCliente();
            contenido[i][2]=servicio.getVehiculo().getPlaca();
            contenido[i][3]=servicio.getVehiculo().getTipoVehiculo().getTipoVehiculo();
            contenido[i][4]=String.valueOf(servicio.getVehiculo().getTipoVehiculo().getPorcentajeAdicional());
            contenido[i][5]=String.valueOf(servicio.getPrecioT());
            contenido[i][6]=String.valueOf(servicio.getDescuento());
            contenido[i][7]=String.valueOf(servicio.getPrecioAd());
            contenido[i][8]=String.valueOf(servicio.getTotal());
            contenido[i][9]=servicio.isLavadoBasico()?"SI":"NO";
            contenido[i][10]=servicio.isLavadoEspecial()?"SI":"NO";
            contenido[i][11]=servicio.isDesinfeccionBasic()?"SI":"NO";
            contenido[i][12]=servicio.isDesinfeccionEsp()?"SI":"NO";
            contenido[i][13]=servicio.isCombo1()?"SI":"NO";
            contenido[i][14]=servicio.isCombo2()?"SI":"NO";
            contenido[i][15]=servicio.isCombo3()?"SI":"NO";
            i++;
        }*/
        modeloTablaServ=new DefaultTableModel(contenido, titulos);
        tblServicio = new JTable(modeloTablaServ);
        tblServicio.setEnabled(false);
    }

    private void generarTabla() {
        
        String[][] contenido=new String[conFuncionario.getFuncionarios().size()][4];
        String[] titulos=new String[4];
        titulos[0]="Documento";
        titulos[1]="Nombre";
        titulos[2]="Apellidos";
        titulos[3]="Telefono";
        int i=0;
        for (Funcionario funcionario : conFuncionario.getFuncionarios()) {
            contenido[i][0]=funcionario.getDocumento();
            contenido[i][1]=funcionario.getNombre();
            contenido[i][2]=funcionario.getApellidos();
            contenido[i][3]=funcionario.getTelefono();
            i++;
        }
        modeloTabla=new DefaultTableModel(contenido, titulos);
        tblFuncionarios = new JTable(modeloTabla);
        tblFuncionarios.setEnabled(false);
    }
    
}
