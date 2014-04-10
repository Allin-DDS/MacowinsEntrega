package ar.edu.utn.frba.dds.macowins;

public class Sombrero extends Prenda {
	public int getCoefDeMetrosexualidad() {
		return coefDeMetrosexualidad;
	}
	public void setCoefDeMetrosexualidad(int coefDeMetrosexualidad) {
		this.coefDeMetrosexualidad = coefDeMetrosexualidad;
	}
	int coefDeMetrosexualidad;
	int precioBase;
	public int precioBase(){
		return(150 + this.coefDeMetrosexualidad);
	}

}
