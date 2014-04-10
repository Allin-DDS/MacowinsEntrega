package ar.edu.utn.frba.dds.macowins;

public class Pantalon extends Prenda {
int centrimetrosTelaUsada;
public int getCentrimetrosTelaUsada() {
	return centrimetrosTelaUsada;
}
public void setCentrimetrosTelaUsada(int centrimetrosTelaUsada) {
	this.centrimetrosTelaUsada = centrimetrosTelaUsada;
}
int precioBase;

public int precioBase(){
	return(250 + this.centrimetrosTelaUsada);
}

}
