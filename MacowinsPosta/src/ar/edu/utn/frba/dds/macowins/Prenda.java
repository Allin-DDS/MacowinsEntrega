package ar.edu.utn.frba.dds.macowins;

public class Prenda {
	double precioIntermedio;
	double precioFinal;
	int valorFijoNegocio; //parecería mas natural que el valorFijoNegocio lo conociera el negocio mismo
						//tal vez la prenda podria conocer al negocio o que se lo pasen por parametro
						//recuerden la idea de encapsulamiento y la propiedad de cohesión
						//de todas formas no se lo tomen como algo taxativo, simplemente entiendan la decisión que están tomando ahí
						//y que al poner este atributo acá están agregando un acoplamiento entre Prenda y Negocio que no es muy explícito que digamos
	double tasaDeImportacion;
	double precioSinSaberMarca;
	boolean esImportada;
	double precioBase; //este atributo no lo usan al final, podrían tener un atributo que fuese constante, para que el código sea un poquito más expresivo
						//o un método con la misma idea, que devuelva un número constante.
	Marca marca;
	
	public int getValorFijoNegocio() {
		return valorFijoNegocio;
	}
	public void setValorFijoNegocio(int valorFijoNegocio) {
		this.valorFijoNegocio = valorFijoNegocio;
	}
	public double getTasaDeImportacion() {
		return tasaDeImportacion;
	}
	public void setTasaDeImportacion(double tasaDeImportacion) {
		this.tasaDeImportacion = tasaDeImportacion;
	}
	public boolean isEsImportada() {
		return esImportada;
	}
	public void setEsImportada(boolean esImportada) {
		this.esImportada = esImportada;
	}
	
	public double precioSinSaberMarca(){
		if(esImportada==true){ //ojo acá, el ==true no es necesario porque esImpotada ya es booleano
			return(this.precioIntermedio*this.tasaDeImportacion);
		}
		else{
			return(this.precioIntermedio);
		}
		
	}
	public double precioIntermedio(){

		return(valorFijoNegocio + this.precioBase);
	}
	
	public double precioFinal(){
		return(this.precioSinSaberMarca * marca.calculoCoeficiente(this.precioSinSaberMarca));
		
		
	}
	
}
