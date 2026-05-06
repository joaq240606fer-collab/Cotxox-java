package org.foobarspam.cotxox.main;

import java.util.ArrayList;

import org.foobarspam.cotxox.carrera.Carrera;
import org.foobarspam.cotxox.conductores.Conductor;
import org.foobarspam.cotxox.conductores.PoolConductores;

public class Cotxox {

	public static void main(String[] args) {
						
		String tarjetaCredito = "4916119711304546";
		String origen = "Aeroport Son Sant Joan";
		String destino= "Magaluf";
		double distancia = 7.75;
		int tiempoEsperadoMinutos = 10;
		
		Carrera carrera = new Carrera(tarjetaCredito);
		carrera.setOrigen(origen);
		carrera.setDestino(destino);
		carrera.setDistancia(distancia);
		carrera.setTiempoEsperado(tiempoEsperadoMinutos);
		
		System.out.println("\n#####" + "\t Set Pickup: \t" + "#####\n" );
		
		System.out.println("Visa: " + carrera.getTarjetaCredito());
		System.out.println("From: "+ carrera.getOrigen());
		System.out.println("To: " + carrera.getDestino());
		System.out.println("Distance: " + carrera.getDistancia());
		
		System.out.println("\n#####"  + "\t See your Cost: \t" + "#####\n" );
		
		System.out.println("Visa: " + carrera.getTarjetaCredito());
		System.out.println("From: "+ carrera.getOrigen());
		System.out.println("To: " + carrera.getDestino());
		System.out.println("Distance: " + carrera.getDistancia());
		System.out.println("Total: " + carrera.getCosteEsperado() + "€");
		
		System.out.println("\n#####"  + "\t Get a ride: Driver: \t" + "#####\n" );
