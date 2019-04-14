import java.awt.Image;

public class Empleado {

	private String primerNombre,
				   segundoNombre,
				   apellidoPaterno,
				   apellidoMaterno,
				   matricula,
				   cargo,
				   rfc;
	private Image foto;
	
	public Empleado(String primerNombre, String apellidoPaterno, String apellidoMaterno, String rfc, String cargo) {
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.rfc = rfc;
		this.cargo = cargo;
		this.foto = null;
		this.matricula = null;
		this.cargo = cargo;
		this.segundoNombre = null;
	}
	
	//espacios entre a000 y a009 reservados para gerentes
	public String generaMatricula(ListaEmpleados lista) {
		if (this.cargo.equals("Gerente")) {
			if (lista.getCantidadGerentes() < 10) {
				String matricula = "A00" + (lista.getCantidadGerentes() + 1);
				this.matricula = matricula;
				return matricula;
			} else {
				throw new IndexOutOfBoundsException("No puede existir un número mayor a 10 gerentes");
			}
		} else {
			String matricula = "A0" + (lista.getSize() + 10);
			this.matricula = matricula;
			return matricula;
		}
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

	public void setFoto(Image foto) {
		this.foto = foto;
	}
	
	
}
