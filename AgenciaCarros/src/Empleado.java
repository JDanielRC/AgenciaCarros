import java.awt.Image;

public class Empleado {

	private String primerNombre,
				   segundoNombre,
				   apellidoPaterno,
				   apellidoMaterno,
				   matricula,
				   cargo,
				   rfc;
	private int entradaALaEmpresa;
	private Image foto;
	
	public Empleado(String primerNombre, String apellidoPaterno, String apellidoMaterno, String rfc, int entradaALaEmpresa, String cargo) {
		this.primerNombre = primerNombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.rfc = rfc;
		this.entradaALaEmpresa = entradaALaEmpresa;
		this.cargo = cargo;
		this.foto = null;
		this.matricula = null;
		this.cargo = null;
		this.segundoNombre = null;
	}
	
	public String generaMatricula() {
		
	}
	
}
