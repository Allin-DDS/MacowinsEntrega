package ar.edu.utn.frba.dds.macowins;

import java.util.ArrayList; 
import java.util.Collection;
import java.util.Date;

public class Negocio {
	
	//Venta ventas = new ArrayList(venta);

	Collection<Venta> ventas = new ArrayList<Venta>();
	
Date fechaActual= new Date();

public void vender(Prenda prenda, int cantidad){
				ventas.add(new Venta(cantidad, prenda, this.fechaActual));
		
}
public double gananciasDelDia(Date unaFecha){
	
	double acum = 0;

	for(Venta venta: ventas){
		
		
		if(unaFecha == venta.fecha){
			acum = acum + venta.precioDeVenta;
		}
	}
	
	return(acum);
	
	

}
}

