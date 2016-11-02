package exam;

import java.util.ArrayList;

public class e1 {

	static double pi = 3.14;
	static final double pi2 = 3.1416;
	
	public static void main(String[] args) {

		ArrayList<Propiedad> props = new ArrayList<Propiedad>();
		ArrayList<Servicio> servs = new ArrayList<Servicio>();
		
		props.add(new Cochera(15, "dorreg", 25, 120, 10, 5));
		props.add(new Particular(14, "rioja", 12, 100, true, 6));
	
		servs.add(new Servicio("asdasd", 5));
		servs.add(new Servicio("asereje", 2));
	
		props.add(new Oficina(13, "qwe", 2, 100, true, servs));

		Propietario duenio = new Propietario(11111, "abcd", "abcd", "abcd", props);

		
		for(Propiedad p : duenio.getPropiedades()) {

			System.out.println(p.getAlquilerMensual());
		}
		
		//pi2 = 2;
		/*A o1 = new B();
		System.out.println(o1.getTexto());
		
		
		 Animal a = new Animal();   // Animal reference and object
		 Animal b = new Dog();   // Animal reference but Dog object

	      a.move();   // runs the method in Animal class
	      b.move();   // runs the method in Dog class
	      b.bark();
		
		ArrayList<Float> notas = new ArrayList<Float>();
		
		notas.add((float)9.15);
		notas.add((float)9);
		notas.add((float)6);
		notas.add((float)10);
		notas.add((float)7);
		
		System.out.print( notaAlumno.getEstado(notas));*/	
	}
}
