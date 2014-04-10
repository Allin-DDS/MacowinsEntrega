package ar.edu.utn.frba.dds.macowins;

public class Prenda {
	double precioIntermedio;
	double precioFinal;
	int valorFijoNegocio;
	double tasaDeImportacion;
	double precioSinSaberMarca;
	boolean esImportada;
	double precioBase;
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
		if(esImportada==true){
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
