package exam;

public class Servicio {

	private String desc;
	private double costoMensual;
	
	public Servicio(String desc, double costoMensual) {
		super();
		this.desc = desc;
		this.costoMensual = costoMensual;
	}
	
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getCostoMensual() {
		return costoMensual;
	}
	public void setCostoMensual(double costoMensual) {
		this.costoMensual = costoMensual;
	}
}
