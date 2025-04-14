package com.mitocode.observer;

public class SolObservador extends Observador{

	private double valorCambio = 3.25;
	
	public SolObservador(Subject sujeto) {
		this.sujeto = sujeto;

//		 agrega esta clase como observador
		this.sujeto.agregar(this);
	}


//	eres un observador, vas actualizra o hacer algo cuando algo cambie de estado
	@Override
	public void actualizar() {		
		System.out.println("PEN: " + (sujeto.getEstado() * valorCambio));
	}

}
