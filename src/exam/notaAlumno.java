package exam;

import java.util.ArrayList;

public abstract class notaAlumno {

	public static String getEstado(ArrayList<Float> notas){
		float sum = 0;
		
		for(float notaAlu:notas){
			sum+=notaAlu;
		}
		
		if(sum/notas.size() > 8) 
			return "A+";
		else if(sum/notas.size() < 6) 
			return "NA";
		else 
			return "A";
	}

}