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
        public Empleado(String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno, String rfc, String cargo, String matricula, ImageIcon foto) {
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.rfc = rfc;
		this.cargo = cargo;
		this.foto = foto;
		this.matricula = matricula;
                this.contrasena = "";
		this.cargo = cargo;
		this.segundoNombre = segundoNombre;
	}
	
	//espacios entre a000 y a009 reservados para gerentes
	public String generaMatricula(ListaEmpleados lista) {
		if (this.cargo.equals("Gerente")) {
			if (lista.getCantidadGerentes() < 10) {
				String matricula = "A00" + (lista.getCantidadGerentes());
				this.matricula = matricula;
				return matricula;
			} else {
				throw new IndexOutOfBoundsException("No puede existir un n�mero mayor a 10 gerentes");
			}
		} else {
			String matricula = "A0" + (lista.getSize() + 10);
			this.matricula = matricula;
			return matricula;
		}
	}      
        
        public String generaContrasena() {
            if (this.cargo.equals("Gerente")) {
                this.contrasena = this.apellidoPaterno + this.matricula.substring(3, this.matricula.length());
                return this.contrasena;
            } else {
                this.contrasena = this.apellidoPaterno + this.matricula.substring(2, this.matricula.length());
                return this.contrasena;
            }
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
