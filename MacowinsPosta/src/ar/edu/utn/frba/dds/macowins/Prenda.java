package ar.edu.utn.frba.dds.macowins;

public class Prenda {
	double precioIntermedio;
	double precioFinal;
	int valorFijoNegocio; //parecer�a mas natural que el valorFijoNegocio lo conociera el negocio mismo
						//tal vez la prenda podria conocer al negocio o que se lo pasen por parametro
						//recuerden la idea de encapsulamiento y la propiedad de cohesi�n
						//de todas formas no se lo tomen como algo taxativo, simplemente entiendan la decisi�n que est�n tomando ah�
						//y que al poner este atributo ac� est�n agregando un acoplamiento entre Prenda y Negocio que no es muy expl�cito que digamos
	double tasaDeImportacion;
	double precioSinSaberMarca;
	boolean esImportada;
	double precioBase; //este atributo no lo usan al final, podr�an tener un atributo que fuese constante, para que el c�digo sea un poquito m�s expresivo
						//o un m�todo con la misma idea, que devuelva un n�mero constante.
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
		if(esImportada==true){ //ojo ac�, el ==true no es necesario porque esImpotada ya es booleano
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
