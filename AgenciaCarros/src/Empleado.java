//Autores:
//Carlos Ernesto Lopez Solano A01633683
//Juan Daniel Rubio Camacho A01633924
//Nombre de la clase: Empleado.java
//Fecha: 05/05/2019
//Comentarios u observaciones.
//------------------------------------------------------------------------------

import java.io.Serializable;
import javax.swing.ImageIcon;

public class Empleado implements Serializable {

	private static final long serialVersionUID = -5811292851613865772L;
	private String primerNombre,
                       segundoNombre,
                       apellidoPaterno,
                       apellidoMaterno,
                       matricula,
                       contrasena,
                       cargo,
                       rfc;
	private ImageIcon foto;
	
	public Empleado(String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String rfc, String cargo, ImageIcon foto) {
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.rfc = rfc;
		this.cargo = cargo;
		this.foto = foto;
		this.matricula = null;
		this.contrasena = "";
		this.cargo = cargo;
		this.segundoNombre = segundoNombre;
	}
        //Contenedor con setter de matricula
        public Empleado(String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String rfc, String cargo, String matricula, String contrasena, ImageIcon foto) {
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.rfc = rfc;
		this.cargo = cargo;
		this.foto = foto;
		this.matricula = matricula;
                this.contrasena = contrasena;
		this.cargo = cargo;
		this.segundoNombre = segundoNombre;
	}
        
        public void setContrasena(String nuevaContrasena) {
            this.contrasena = nuevaContrasena;
        }

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getMatricula() {
		return matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setFoto(ImageIcon foto) {
		this.foto = foto;
	}

	public ImageIcon getFoto() {
		return foto;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
        
        public String getContrasena(){
            return this.contrasena;
        }

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}
