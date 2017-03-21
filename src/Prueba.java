import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Prueba extends JFrame implements ActionListener
{
    //-- CREAMOS LOS OBJETOS QUE UTLIZAREMOS
	String id, nombre, actividades, tiempo,herramienta, requisitos, max, min, esperado, obtenido, estado;
     
    public JButton btnBotonOk = new JButton("OK");
    public JButton btnBotonLimpiar = new JButton("LIMPIAR");
    public JButton btnBotonSalir = new JButton("SALIR");
     
    public JLabel lblid = new JLabel("ID : ");
    public JLabel lblNombre = new JLabel("NOMBRE: ");
    public JLabel lblActividades = new JLabel("ACTIVIDADES: ");;
    public JLabel lblTiempo = new JLabel("DURACION: ");
    public JLabel lblHerramientas = new JLabel("HERRAMIENTAS: ");
    public JLabel lblRequisitos = new JLabel("REQUISITOS: ");
    public JLabel lblvalormax = new JLabel("VALOR MAXIMO: ");
    public JLabel lblvalormin = new JLabel("VALOR MINIMO: ");
    public JLabel lblResesp = new JLabel("RES. ESPERADO: ");
    public JLabel lblResobt = new JLabel("RES. OBTENIDO: ");
    public JLabel lblestado = new JLabel("ESTADO: ");
    public JLabel lblBienvenido = new JLabel();
     
    public JTextField txtid = new JTextField(20);
    public JTextField txtNombre = new JTextField(20);
    public JTextField txtActividades = new JTextField(20);
    public JTextField txtTiempo = new JTextField(20);
    public JTextField txtHerramientas = new JTextField(20);
    public JTextField txtRequisitos = new JTextField(20);
    public JTextField txtvalormax = new JTextField(20);
    public JTextField txtvalormin = new JTextField(20);
    public JTextField txtResesp = new JTextField(20);
    public JTextField txtResobt = new JTextField(20);
    public JTextField txtestado = new JTextField(20);
    public JTextField txtBienvenido = new JTextField(20);


     
    public Prueba() 
    {
        //-- CONFIGURAMOS LA VENTANA JFRAME
         
        super("SALUDO");
        this.setSize(400,800);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
         
        this.btnBotonOk.addActionListener(this);    
        this.btnBotonLimpiar.addActionListener(this);
        this.btnBotonSalir.addActionListener(this);
         
        //-- LE AÑADIMOS UN DISTRIBUIDOR DE OBJETOS A LA VENTANA
         
        FlowLayout DISTRIBUIDOR = new FlowLayout(FlowLayout.CENTER,30,30);
        this.setLayout(DISTRIBUIDOR);
         
        //-- LE AGREGAMOS LOS OBJETOS A LA VENTANA
         
        this.add(this.lblid);
        this.add(this.txtid);
        this.add(this.lblNombre);
        this.add(this.txtNombre);
        this.add(this.lblActividades);
        this.add(this.txtActividades);
        this.add(this.lblTiempo);
        this.add(this.txtTiempo);
        this.add(this.lblHerramientas);
        this.add(this.txtHerramientas);
        this.add(this.lblRequisitos);
        this.add(this.txtRequisitos);
        this.add(this.lblvalormax);
        this.add(this.txtvalormax);
        this.add(this.lblvalormin);
        this.add(this.txtvalormin);
        this.add(this.lblResesp);
        this.add(this.txtResesp);
        this.add(this.lblResobt);
        this.add(this.txtResobt);
        this.add(this.lblestado);
        this.add(this.txtestado);
        this.add(this.btnBotonOk);
        this.add(this.btnBotonLimpiar);
        this.add(this.btnBotonSalir);
        this.add(this.btnBotonLimpiar);
        this.add(this.lblBienvenido);
         
    }
     
    @Override
    public void actionPerformed(ActionEvent AE) 
    {
        //-- CON "getSource()" VEMOS EN QUE BOTON SE HIZO CLICK
         
        if(AE.getSource() == this.btnBotonOk)
        {
            if(this.txtNombre.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"DILIGENCIE TODOS LOS DATOS");
            }
            else
            {
                this.nombre = this.txtNombre.getText();
            }
            
            
            
            if(this.txtid.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"DILIGENCIE TODOS LOS DATOS");
            }
            else
            {
                this.id = this.txtid.getText();
            }
            
            
            
            if(this.txtActividades.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"DILIGENCIE TODOS LOS DATOS");
            }
            else
            {
                this.actividades = this.txtActividades.getText();
            }
            
            
            if(this.txtTiempo.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"DILIGENCIE TODOS LOS DATOS");
            }
            else
            {
                this.tiempo = this.txtTiempo.getText();
            }
            
            
            
            if(this.txtHerramientas.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"DILIGENCIE TODOS LOS DATOS");
            }
            else
            {
                this.herramienta = this.txtHerramientas.getText();
            }
            
            
            
            if(this.txtRequisitos.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"DILIGENCIE TODOS LOS DATOS");
            }
            else
            {
                this.requisitos = this.txtRequisitos.getText();
            }
            
            
            if(this.txtvalormax.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"DILIGENCIE TODOS LOS DATOS");
            }
            else
            {
                this.max = this.txtvalormax.getText();
            }
            
            
            if(this.txtvalormin.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"DILIGENCIE TODOS LOS DATOS");
            }
            else
            {
                this.min = this.txtvalormin.getText();
            }
            
            
            
            if(this.txtResesp.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"DILIGENCIE TODOS LOS DATOS");
            }
            else
            {
                this.esperado = this.txtResesp.getText();
            }
            
            
            if(this.txtResobt.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"DILIGENCIE TODOS LOS DATOS");
            }
            else
            {
                this.obtenido = this.txtResobt.getText();
            }
            
            
            if(this.txtestado.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"DILIGENCIE TODOS LOS DATOS");
            }
            else
            {
                this.estado = this.txtestado.getText();
            }
            
            
            
            
            
            
        }
        else if(AE.getSource() == this.btnBotonLimpiar)
        {
            this.txtNombre.setText("");
            this.txtid.setText("");
            this.txtNombre.setText("");
            this.txtActividades.setText("");
            this.txtTiempo.setText("");
            this.txtHerramientas.setText("");
            this.txtRequisitos.setText("");
            this.txtvalormax.setText("");
            this.txtvalormin.setText("");
            this.txtResesp.setText("");
            this.txtResobt.setText("");
            this.txtestado.setText("");
            this.txtBienvenido.setText("");
        }
        else if(AE.getSource() == this.btnBotonSalir)
        {
            System.exit(0);
        }        
    }
     
    public static void main(String[] ARGUMENTOS)
    {
        //-- CREAMOS E INICIALIZAMOS LA VENTANA
         
        Prueba MB = new Prueba();
        MB.setVisible(true);
        
        
        
        
        
        
        
        
    }
}