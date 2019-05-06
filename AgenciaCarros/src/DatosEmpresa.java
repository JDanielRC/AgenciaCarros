import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.ImageIcon;

public class DatosEmpresa implements Serializable {
	
	private static final long serialVersionUID = -2594661663948160818L;
	private String RFC, direccion, nombre;
	private ImageIcon logo;
	
        public DatosEmpresa() {
            this.nombre = "";
            this.logo = null;
            this.direccion = "";
            this.RFC = "";
        }
        
	public DatosEmpresa(String RFC, String direccion, String nombre, ImageIcon logo) {
		this.RFC = RFC;
		this.direccion = direccion;
		this.nombre = nombre;
		this.logo = logo;
	}

	public String getRFC() {
		return RFC;
	}

	public void setRFC(String rFC) {
		RFC = rFC;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ImageIcon getLogo() {
		return logo;
	}

	public void setLogo(ImageIcon logo) {
		this.logo = logo;
	}
	
	public void almacenarEmpresa() { //crea archivo.dat que almacena todos los datos
		FileOutputStream fs;
		ObjectOutputStream os;
		try {
			fs = new FileOutputStream("CompanyInformation.bin");
			os = new ObjectOutputStream(fs);
			os.writeObject(this);
			os.close();
			fs.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
