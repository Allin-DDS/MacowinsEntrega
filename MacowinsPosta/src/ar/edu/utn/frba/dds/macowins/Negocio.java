package ar.edu.utn.frba.dds.macowins;

import java.util.ArrayList; 
import java.util.Collection;
import java.util.Date;

public class Negocio {
	
	//Venta ventas = new ArrayList(venta);

	Collection<Venta> ventas = new ArrayList<Venta>();
	
Date fechaActual= new Date(); //esto me hace un poco de ruido, se actualizar�a solo al momento de instanciarse? 

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
	
	//Ac� podr�an usar las colecciones de java 8 (stream)
	 //es parecido a c�mo filtraban las colecciones en pdp
	//Podr�an tener algo as�:
	//ventas.stream()
	//.filter(venta -> venta.getFecha().compareTo(new Date()) == 0) --> Comentario: Ojo que no s� si esta es la mejor forma de trabajar con fechas, habr�a que investigar un poquito
	//.mapToDouble(venta -> venta.precioDeVenta())
	//.reduce(0,Double::sum);
	
	return(acum);
	
	

}
}

