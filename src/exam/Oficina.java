package exam;

import java.util.ArrayList;

public class Oficina extends Propiedad {

	private boolean pisoTecnico;
	private ArrayList<Servicio> servicios;

	public Oficina(int id, String dir, int m2, double impBase, boolean pisoTecnico, ArrayList<Servicio> servicios) {
		super(id, dir, m2,  impBase);
		this.pisoTecnico = pisoTecnico;
		this.servicios = servicios;
	}
	
	public boolean isPisoTecnico() {
		return pisoTecnico;
	}

	public void setPisoTecnico(boolean pisoTecnico) {
		this.pisoTecnico = pisoTecnico;
	}

	public ArrayList<Servicio> getServicios() {
		return servicios;
	}

	public void setServicios(ArrayList<Servicio> servicios) {
		this.servicios = servicios;
	}

	@Override
	public double getAlquilerMensual() {

		double costoMensualServicios = 0;
		
		for (Servicio serv : servicios) {
			costoMensualServicios += serv.getCostoMensual();
		}
		
		return getImpBase() + costoMensualServicios;
	}
}
