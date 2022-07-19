package ec.edu.intsuperior.modelo;


public class Empresa extends Persona{
    private String NombreEmpresa;
    
    public Empresa (){
    }

    public Empresa(String NombreEmpresa, String nombre1, String nombre2, String apellido1, String apellido2, String telefono, String correo, int edad, String direccion) {
        super(nombre1, nombre2, apellido1, apellido2, telefono, correo, edad, direccion);
        this.NombreEmpresa = NombreEmpresa;
    }

    public void setNombreEmpresa(String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    @Override
    public String toString() {
        return "nombre empresa: "
        + "El Nombre de la Empresa es: \n" +getNombreEmpresa();
                
    }
    
}