package exam;

import java.util.ArrayList;

public class Propietario {

	private int dni;
	private String desc;
	private String tel;
	private String dom;
	
	private ArrayList<Propiedad> propiedades;

	public Propietario(int dni, String desc, String tel, String dom, ArrayList<Propiedad> propiedades) {
		this.dni = dni;
		this.desc = desc;
		this.tel = tel;
		this.dom = dom;
		
		this.propiedades = propiedades;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getDom() {
		return dom;
	}

	public void setDom(String dom) {
		this.dom = dom;
	}
	

	public ArrayList<Propiedad> getPropiedades() {
		return propiedades;
	}

	public void setPropiedades(ArrayList<Propiedad> propiedades) {
		this.propiedades = propiedades;
	}

}
