package exam;

public class Particular extends Propiedad {

	private boolean permitido;
	private int habitaciones;
	
	public Particular(int id, String dir, int m2, double impBase, boolean permitido, int habitaciones) {
		super(id, dir, m2,  impBase);
		this.permitido = permitido;
		this.habitaciones = habitaciones;
	}
	
	public boolean isPermitido() {
		return permitido;
	}
	public void setPermitido(boolean permitido) {
		this.permitido = permitido;
	}
	public int getHabitaciones() {
		return habitaciones;
	}
	public void setHabitaciones(int habitaciones) {
		this.habitaciones = habitaciones;
	}

	@Override
	public double getAlquilerMensual() {
		return getImpBase() + this.habitaciones * 0.05;
	}
	
	
}
