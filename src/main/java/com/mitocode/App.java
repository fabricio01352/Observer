package com.mitocode;

import com.mitocode.observer.PesoARGObservador;
import com.mitocode.observer.PesoMXObservador;
import com.mitocode.observer.SolObservador;
import com.mitocode.observer.Subject;

public class App {

	public static void main(String[] args) {
		Subject subject = new Subject();

		new SolObservador(subject);
		new PesoARGObservador(subject);
		new PesoMXObservador(subject);


//		los observadores ya estan suscritos al sujeto, el cambio de estado va ser notificado
//		mira como su estado que serian la cantidad de dolares, cambia su estado, se ntoifica a los observadores
//		y cada observador hace su nuevo calculo de divisas
		System.out.println("Si desea cambiar 10 d�lares obtendr� : ");
		subject.setEstado(10);
		System.out.println("-----------------");
		System.out.println("Si desea cambiar 100 d�lares obtendr� : ");
		subject.setEstado(100);
	}
}
