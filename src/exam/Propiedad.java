package exam;

public abstract class Propiedad {
	
	private int id;
	private String dir;
	private int m2;
	private double impBase;
	
	public Propiedad(int id, String dir, int m2, double impBase) {
		this.id = id;
		this.dir = dir;
		this.m2 = m2;
		this.impBase = impBase;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDir() {
		return dir;
	}
	public void setDir(String dir) {
		this.dir = dir;
	}
	public int getM2() {
		return m2;
	}
	public void setM2(int m2) {
		this.m2 = m2;
	}
	public double getImpBase() {
		return impBase;
	}
	public void setImpBase(double impBase) {
		this.impBase = impBase;
	}
	
	public abstract double getAlquilerMensual();
}
