package ar.edu.utn.frba.dds.macowins;

public class Saco extends Prenda {
	public int getCantidadDeBotones() {
		return cantidadDeBotones;
	}
	public void setCantidadDeBotones(int cantidadDeBotones) {
		this.cantidadDeBotones = cantidadDeBotones;
	}
	int cantidadDeBotones;
	int precioBase;
	
public int precioBase(){
	return(300 + 10* this.cantidadDeBotones);
	
}
}
