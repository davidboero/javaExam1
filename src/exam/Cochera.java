package exam;

public class Cochera extends Propiedad {

	private int capVehiculos;
	private double cargoExtra;
		
	public Cochera(int id, String dir, int m2, double impBase, int capVehiculos, double cargoExtra) {
		super(id, dir, m2,  impBase);
		this.capVehiculos = capVehiculos;
		this.cargoExtra = cargoExtra;
	}
	
	public int getCapVehiculos() {
		return capVehiculos;
	}
	public void setCapVehiculos(int capVehiculos) {
		this.capVehiculos = capVehiculos;
	}
	public double getCargoExtra() {
		return cargoExtra;
	}
	public void setCargoExtra(double cargoExtra) {
		this.cargoExtra = cargoExtra;
	}

	@Override
	public double getAlquilerMensual() {
		return getImpBase() + (this.capVehiculos + this.cargoExtra);
	}
}
