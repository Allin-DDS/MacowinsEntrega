package ar.edu.utn.frba.dds.macowins;

public class Zapatos extends Prenda {
	public int getTalle() {
		return talle;
	}
	public void setTalle(int talle) {
		this.talle = talle;
	}
	int talle;
	int precioBase;
	public int precioBase(){
		return(400 + 5* this.talle);
	}

}
