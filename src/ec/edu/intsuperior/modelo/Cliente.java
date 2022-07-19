/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.modelo;

/**
 *
 * @author NORMA
 */
public class Cliente extends Persona{
    private String Telefonocontacto;
    
    public Cliente (){
    }

    public Cliente(String Telefonocontacto, String nombre1, String nombre2, String apellido1, String apellido2, String telefono, String correo, int edad, String direccion) {
        super(nombre1, nombre2, apellido1, apellido2, telefono, correo, edad, direccion);
        this.Telefonocontacto = Telefonocontacto;
    }

    public void setTelefonocontacto(String Telefonocontacto) {
        this.Telefonocontacto = Telefonocontacto;
    }

    public String getTelefonocontacto() {
        return Telefonocontacto;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    }
    
    