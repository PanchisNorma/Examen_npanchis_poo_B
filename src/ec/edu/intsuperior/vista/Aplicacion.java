package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Empleado;
import ec.edu.intsuperior.modelo.Persona;
import java.util.Scanner;
import javax.swing.JOptionPane;
        

public class Aplicacion {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Persona p1 = new Cliente();
        
        p1.setNombre1(JOptionPane.showInputDialog("Ingrese Nombre1"));  
        
        p1.setNombre1(JOptionPane.showInputDialog("Ingrese Nombre2"));  
        
        p1.setNombre1(JOptionPane.showInputDialog("Ingrese Apellido1")); 
        
        p1.setNombre1(JOptionPane.showInputDialog("Ingrese Apellido2"));
        
        p1.setNombre1(JOptionPane.showInputDialog("Ingrese Correo"));
        
        p1.setNombre1(JOptionPane.showInputDialog("Ingrese Direccion"));
        
        p1.setNombre1(JOptionPane.showInputDialog("Ingrese Telefono"));
        
        p1.setNombre1(JOptionPane.showInputDialog("Ingrese Edad"));
        
        {
           JOptionPane.showMessageDialog(null, p1.toString());  
        }      
    
    String nombre=JOptionPane.showInputDialog("Nombre del trabajador");
    String profesion=JOptionPane.showInputDialog("Profesion");
    
    int dt=Integer.parseInt(JOptionPane.showInputDialog("Dias trabajados"));
    double pd=Double.parseDouble(JOptionPane.showInputDialog("Pago por Dia"));
    
    double np=0,aux;
    
    if(dt>30){
    double sp=15*pd;
    
    double qu=(pd*15);
    np = sp+qu;
        
    }
    else {
        np=dt*pd;
        
    }
    JOptionPane.showMessageDialog(null,"Trabajador: "+nombre+"\n"            
            +"Profesion: "+profesion+"\n"
            + "Dias trabajados: "+dt+"\n"
            + "Sueldo Bruto: "+np+"\n");
    } 
    
}