package exam;

public class B extends A{
	public B() {
		this.setNro(5);
	}
	
	public int getNro() {
		return super.getNro()+1000;
	}
	
	public String getTexto() 
	{
		return super.getTexto() + this.getNro();
	}
}
