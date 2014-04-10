package ar.edu.utn.frba.dds.macowins;
import java.util.Date;

public class Venta {
	Prenda prenda;
	int cantidad;
	Date fecha;
	double precioDeVenta; //y este atributo? 
	
	
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public double precioDeVenta(){
		return(this.cantidad * this.precioDeVenta); //creo que aca quisieron poner this.cantidad * prenda.precioFinal()
	}
	
	public Venta(int cantidad, Prenda prenda, Date fecha){
	this.cantidad = cantidad;
	this.prenda= prenda;
	this.fecha= fecha;
	};
}
