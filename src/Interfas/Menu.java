
package Interfas;

import Clases.Conectar;
import java.sql.Connection;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.logging.*;
import javax.swing.JOptionPane;
import java.util.Date;


/**
 *
 * @author JORGMTZAR
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    
    public Menu() {
        initComponents();
        jTextField20.setText(fechas());
        jTextField31.setText(fechas());
        habil(0);
            
    }
    void habil(int val){
        if (val==1){
            jTextField22.enable(true);
            jTextField23.enable(true);
            jTextField24.enable(true);
            jTextField25.enable(true);
            jTextField26.enable(true);
            jTextField27.enable(true);
            jTextField28.enable(true);
            jTextField29.enable(true);
            jTextField30.enable(true);
            jButton6.enable(true);
            jButton7.enable(true);
            jComboBox2.enable(true);
            
        }
        if (val==0){
            jTextField22.enable(false);
            jTextField23.enable(false);
            jTextField24.enable(false);
            jTextField25.enable(false);
            jTextField26.enable(false);
            jTextField27.enable(false);
            jTextField28.enable(false);
            jTextField29.enable(false);
            jTextField30.enable(false);
            jButton6.enable(false);
            jButton7.enable(false);
            jComboBox2.enable(false);
        }
    }
    void Nnit(String nat)
    {
        String cap="";
        String sql="SELECT * FROM datclientes WHERE NIT='"+nat+"' ";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
            cap=rs.getString("Cliente");
            }
            
            if (cap==""){
                JOptionPane.showMessageDialog(null, "NIT no Registrado");
                jTextField21.setText("");
                jTextField21.requestFocus();
               
            }
            else {
                JOptionPane.showMessageDialog(null,"Cliente Encontrado con Exito");
                habil(1);
                jTextField32.setText(cap);
                jTextField22.requestFocus();
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
       
   

    
    void limpiar(int val){
        if (val==0){
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
        }
        if (val==1){
            jTextField11.setText("");
            jTextField12.setText("");
            jTextField13.setText("");
            jTextField14.setText("");
            jTextField15.setText("");
            jTextField16.setText("");
            jTextField17.setText("");
            jTextField18.setText("");
            jTextField19.setText("");
        }
        if (val==2){
            jTextField22.setText("");
            jTextField23.setText("");
            jTextField24.setText("");
            jTextField25.setText("");
            jTextField26.setText("");
            jTextField27.setText("");
            jTextField28.setText("");
            jTextField29.setText("");
            jTextField30.setText("");
        }
    }
    
    public static String fechas(){
      Date fecha = new Date();  
      SimpleDateFormat Formato= new SimpleDateFormat("YYYY/MM/dd");
      return Formato.format(fecha);
    }
    public String nom;
    public String ius;
    public String gnit;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Clientes = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        DatosGenerales = new javax.swing.JInternalFrame();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        AgregarInfo = new javax.swing.JInternalFrame();
        jLabel26 = new javax.swing.JLabel();
        jTextField21 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jTextField31 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Clientes.setTitle("Datos Principales");
        Clientes.setToolTipText("");
        Clientes.setVisible(false);
        Clientes.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Información de Empresa");
        Clientes.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Empresa");
        Clientes.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("NIT");
        Clientes.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Dirección");
        Clientes.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Teléfono");
        Clientes.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Correo");
        Clientes.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));
        Clientes.getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 130, -1));
        Clientes.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 110, -1));
        Clientes.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 130, -1));
        Clientes.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 110, -1));
        Clientes.getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Contacto");
        Clientes.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Nombre");
        Clientes.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Puesto");
        Clientes.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Correo");
        Clientes.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Teléfono");
        Clientes.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));
        Clientes.getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 130, -1));
        Clientes.getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 100, -1));

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        Clientes.getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 130, -1));
        Clientes.getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 100, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Reclutador");
        Clientes.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, -1));

        jTextField10.setEditable(false);
        Clientes.getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 90, -1));

        jButton1.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Clientes.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, -1, -1));

        jButton2.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Clientes.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, -1, -1));

        getContentPane().add(Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 480));

        DatosGenerales.setTitle("Datos Generales");
        DatosGenerales.setVisible(false);
        DatosGenerales.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Información General del puesto");
        DatosGenerales.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Nombre del Puesto");
        DatosGenerales.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Departamento al que pertenece");
        DatosGenerales.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Reporta a");
        DatosGenerales.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Rango de Edad");
        DatosGenerales.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Características Físicas");
        DatosGenerales.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Género");
        DatosGenerales.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, -1, -1));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Requisitos de Educación");
        DatosGenerales.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        DatosGenerales.getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 180, -1));
        DatosGenerales.getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 120, -1));
        DatosGenerales.getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 180, -1));
        DatosGenerales.getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 180, -1));
        DatosGenerales.getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 180, -1));

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        DatosGenerales.getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 180, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "No Interesa", " " }));
        DatosGenerales.getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Título de Nivel Medio");
        DatosGenerales.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setText("Título o Estudios Universitarios");
        DatosGenerales.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel23.setText("Conocimineto de Idiomas");
        DatosGenerales.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel24.setText("Cantidad de Procesos");
        DatosGenerales.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));
        DatosGenerales.getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 200, -1));

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        DatosGenerales.getContentPane().add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 200, -1));
        DatosGenerales.getContentPane().add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 420, 70, -1));

        jButton4.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jButton4.setText("Guardar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        DatosGenerales.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, -1, -1));

        jButton5.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jButton5.setText("Limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        DatosGenerales.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 470, -1, -1));

        jLabel25.setText("Fecha");
        DatosGenerales.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 30, -1, -1));

        jTextField20.setEditable(false);
        jTextField20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20ActionPerformed(evt);
            }
        });
        DatosGenerales.getContentPane().add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 80, -1));

        getContentPane().add(DatosGenerales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 550));

        AgregarInfo.setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cacular1.jpg"))); // NOI18N
        AgregarInfo.setVisible(false);
        AgregarInfo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setText("NIT");
        AgregarInfo.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));
        AgregarInfo.getContentPane().add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 70, -1));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Información General del puesto");
        AgregarInfo.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Nombre del Puesto");
        AgregarInfo.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText("Departamento al que pertenece");
        AgregarInfo.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Reporta a");
        AgregarInfo.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText("Rango de Edad");
        AgregarInfo.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("Características Físicas");
        AgregarInfo.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("Género");
        AgregarInfo.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("Requisitos de Educación");
        AgregarInfo.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jTextField22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField22ActionPerformed(evt);
            }
        });
        AgregarInfo.getContentPane().add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 180, -1));
        AgregarInfo.getContentPane().add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 120, -1));
        AgregarInfo.getContentPane().add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 180, -1));
        AgregarInfo.getContentPane().add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 180, -1));
        AgregarInfo.getContentPane().add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 180, -1));

        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });
        AgregarInfo.getContentPane().add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 180, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "No Interesa", " " }));
        AgregarInfo.getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 250, -1, -1));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText("Título de Nivel Medio");
        AgregarInfo.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText("Título o Estudios Universitarios");
        AgregarInfo.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText("Conocimineto de Idiomas");
        AgregarInfo.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, -1, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("Cantidad de Procesos");
        AgregarInfo.getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));
        AgregarInfo.getContentPane().add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 200, -1));

        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });
        AgregarInfo.getContentPane().add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 200, -1));
        AgregarInfo.getContentPane().add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 70, -1));

        jButton6.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jButton6.setText("Guardar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        AgregarInfo.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, -1, -1));

        jButton7.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jButton7.setText("Limpiar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        AgregarInfo.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 530, -1, -1));

        jLabel39.setText("Fecha");
        AgregarInfo.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, -1, -1));

        jTextField31.setEditable(false);
        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });
        AgregarInfo.getContentPane().add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, 80, -1));

        jButton3.setFont(new java.awt.Font("Stencil", 0, 18)); // NOI18N
        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        AgregarInfo.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));
        AgregarInfo.getContentPane().add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, 160, -1));

        jTextField33.setEnabled(false);
        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });
        AgregarInfo.getContentPane().add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 180, -1));

        jTextField34.setEnabled(false);
        AgregarInfo.getContentPane().add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 120, -1));

        jTextField35.setEnabled(false);
        AgregarInfo.getContentPane().add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 180, -1));

        jTextField36.setEnabled(false);
        AgregarInfo.getContentPane().add(jTextField36, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 180, -1));

        jTextField37.setEnabled(false);
        AgregarInfo.getContentPane().add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 180, -1));

        jTextField38.setEnabled(false);
        jTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField38ActionPerformed(evt);
            }
        });
        AgregarInfo.getContentPane().add(jTextField38, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 180, -1));

        jTextField39.setEnabled(false);
        AgregarInfo.getContentPane().add(jTextField39, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 200, -1));

        jTextField40.setEnabled(false);
        jTextField40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField40ActionPerformed(evt);
            }
        });
        AgregarInfo.getContentPane().add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 200, -1));

        jTextField41.setEnabled(false);
        AgregarInfo.getContentPane().add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 480, 70, -1));

        getContentPane().add(AgregarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 590));

        jMenu1.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Nuevo Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Nuevo Puesto");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir1.JPG"))); // NOI18N
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        cc.desconectar();
        LogIn ver = new LogIn();
        ver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Clientes.setVisible(true);
        jTextField1.requestFocus();
        jTextField10.setText(nom);
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Datos Tabla datClientes
        String Nom, Nit, Dire, Tel, Corr; 
        //Datos Tabla Contactos
        String Nomc, Pues, Corc, Telc;
        
        Nom = jTextField1.getText();
        Nit = jTextField2.getText();
        Dire = jTextField3.getText();
        Tel = jTextField4.getText();
        Corr= jTextField5.getText();
        
        Nomc = jTextField6.getText();
        Pues = jTextField7.getText();
        Corc = jTextField8.getText();
        Telc = jTextField9.getText();
        
        if (jTextField1.getText().equals("")|| jTextField2.getText().equals("")||jTextField3.getText().equals("")|| jTextField4.getText().equals("")
              || jTextField5.getText().equals("") || jTextField6.getText().equals("") || jTextField7.getText().equals("") || jTextField8.getText().equals("")
                || jTextField9.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para Registrar");
            jTextField1.requestFocus();
        }
        else {
            String sql="";
            String sql2 ="";
            sql="INSERT INTO `datclientes` (`NIT`, `Cliente`, `Telefono`, `Correo`, `Dirección`) VALUES (?, ?, ?, ?, ?)";
            sql2="INSERT INTO `contactos` (`Nombre`, `Puesto`, `Correo`, `Telefono`, `NITc`) VALUES (?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, Nit);
                pst.setString(2, Nom);
                pst.setString(3, Tel);
                pst.setString(4, Corr);
                pst.setString(5, Dire);
                int n=pst.executeUpdate();
                if (n>0){
                    try{
                        PreparedStatement psd = cn.prepareStatement(sql2);
                        psd.setString(1, Nomc);
                        psd.setString(2, Pues);
                        psd.setString(3, Corc);
                        psd.setString(4, Telc);
                        psd.setString(5, Nit);
                        int m=psd.executeUpdate();
                        if (m>0){
                            JOptionPane.showMessageDialog(null,"Registro Guardado");
                            gnit=Nit;
                            limpiar(0);
                            DatosGenerales.setVisible(true);
                            Clientes.setVisible(false);
                            jTextField1.requestFocus();
                        }   
                    } catch (SQLException ex2){
                        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex2);
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        limpiar(0);
        jTextField1.requestFocus();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Datos Tabla datgeneral
        String Nom, Dep, Rep, Edad, Gen, Fis, TNM, TNU, Idioma, Proc, Fecha;
        
        Nom = jTextField11.getText();
        Dep = jTextField12.getText();
        Rep = jTextField13.getText();
        Edad = jTextField14.getText();
        Gen = jComboBox1.getSelectedItem().toString();
        Fis = jTextField15.getText();
        TNM = jTextField16.getText();
        TNU = jTextField17.getText();
        Idioma= jTextField18.getText();
        Proc = jTextField19.getText();
        Fecha = jTextField20.getText();
        
        
        if (jTextField11.getText().equals("")|| jTextField12.getText().equals("")||jTextField13.getText().equals("")|| jTextField14.getText().equals("")
              || jTextField15.getText().equals("") || jTextField16.getText().equals("") || jTextField17.getText().equals("") || jTextField18.getText().equals("")
                || jTextField19.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para Registrar");
            jTextField11.requestFocus();
        }
        else {
            String sql="";
            sql = "INSERT INTO `datgeneral` (`Nombre`, `Departamento`, `Reporte`, `Edad`, `Genero`, `Fisico`, `TNivelM`, `TNivelU`, `Idioma`, `Procesos`, `NITg`, `IDUser`, `Fecha`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
            
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, Nom);
                pst.setString(2, Dep);
                pst.setString(3, Rep);
                pst.setString(4, Edad);
                pst.setString(5, Gen);
                pst.setString(6, Fis);
                pst.setString(7, TNM);
                pst.setString(8, TNU);
                pst.setString(9, Idioma);
                pst.setString(10, Proc);
                pst.setString(11, gnit);
                pst.setString(12, ius);
                pst.setString(13, Fecha);
                int n=pst.executeUpdate();
                if (n>0){
                    
                    limpiar(1);
                    JOptionPane.showMessageDialog(null,"Registros Guardado");
                    if (JOptionPane.showConfirmDialog(null, "Desea Ingresar Otro Cliente?", "Ingresar de Nuevo", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
                        Clientes.setVisible(true);
                        DatosGenerales.setVisible(false);
                        jTextField1.requestFocus();
                    }
                    else {
                        DatosGenerales.setVisible(false);
                        
                    }
                    
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        limpiar(1);
        jTextField11.requestFocus();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AgregarInfo.setVisible(true);
        jTextField21.requestFocus();
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jTextField22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField22ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
            //Datos Tabla datgeneral
        String Nom, Dep, Rep, Edad, Gen, Fis, TNM, TNU, Idioma, Proc, Fecha;
        
        Nom = jTextField22.getText();
        Dep = jTextField23.getText();
        Rep = jTextField24.getText();
        Edad = jTextField25.getText();
        Gen = jComboBox2.getSelectedItem().toString();
        Fis = jTextField26.getText();
        TNM = jTextField27.getText();
        TNU = jTextField28.getText();
        Idioma= jTextField29.getText();
        Proc = jTextField30.getText();
        Fecha = jTextField31.getText();
        
        
        if (jTextField22.getText().equals("")|| jTextField23.getText().equals("")||jTextField24.getText().equals("")|| jTextField25.getText().equals("")
              || jTextField26.getText().equals("") || jTextField27.getText().equals("") || jTextField28.getText().equals("") || jTextField29.getText().equals("")
                || jTextField30.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos para Registrar");
            jTextField22.requestFocus();
        }
        else {
            String sql="";
        //  sql = "INSERT INTO `datgeneral` (`Nombre`, `Departamento`, `Reporte`, `Edad`, `Genero`, `Fisico`, `TNivelM`, `TNivelU`, `Idioma`, `Procesos`, `NITg`, `IDUser`, `Fecha`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            sql = "INSERT INTO `datgeneral` (`Nombre`, `Departamento`, `Reporte`, `Edad`, `Genero`, `Fisico`, `TNivelM`, `TNivelU`, `Idioma`, `Procesos`, `NITg`, `IDUser`, `Fecha`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
            
            try {
                PreparedStatement pst = cn.prepareStatement(sql);
                pst.setString(1, Nom);
                pst.setString(2, Dep);
                pst.setString(3, Rep);
                pst.setString(4, Edad);
                pst.setString(5, Gen);
                pst.setString(6, Fis);
                pst.setString(7, TNM);
                pst.setString(8, TNU);
                pst.setString(9, Idioma);
                pst.setString(10, Proc);
                pst.setString(11, gnit);
                pst.setString(12, ius);
                pst.setString(13, Fecha);
                int n=pst.executeUpdate();
                if (n>0){
                    JOptionPane.showMessageDialog(null,"Registros Guardado");
                    AgregarInfo.setVisible(false);
                    DatosGenerales.setVisible(true);
                    jTextField11.requestFocus();
                }
            } catch (SQLException ex) {
                Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int i=2;
        limpiar(i);
        jTextField22.requestFocus();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (jTextField21.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Debe Ingresar el NIT");
        }
        else{
            gnit=jTextField21.getText();
            Nnit(gnit);
            
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38ActionPerformed

    private void jTextField40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField40ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField40ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame AgregarInfo;
    private javax.swing.JInternalFrame Clientes;
    private javax.swing.JInternalFrame DatosGenerales;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
    Conectar cc = new Conectar();
    Connection cn = cc.getConnection();
}
