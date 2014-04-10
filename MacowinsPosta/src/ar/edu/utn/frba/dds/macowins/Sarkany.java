package ar.edu.utn.frba.dds.macowins;

public class Sarkany implements Marca {
	public double calculoCoeficiente(double unPrecio){
		if(unPrecio>500){
			return(1.35);}
		else{ return(1.1);}
		}
}
