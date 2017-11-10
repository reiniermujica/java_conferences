import java.util.*;
import java.io.*;

class Principal {
	public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);       
		Cuerpo c = new Cuerpo();
        
        double espacio, tiempo;
        
        System.out.println("Entre el espacio: ");
        espacio = reader.nextDouble();
        
        System.out.println("Entre el tiempo: ");
        tiempo = reader.nextDouble();
        
		c.setEspacio(espacio);
		c.setTiempo(tiempo);
		double v = c.velocidad();
		System.out.println("Velocidad: "+v);
        
        
        Cuerpo c = new Cuerpo();
        
        Coche mi_coche;
        mi_coche = new Coche();
        
        Punto point = new Punto();
        
        Punto point = new Punto(10,5);
        
        mi_coche.Enciende();
        
        mi_coche.Apaga();
        
        point.setX(10);
        
        point.setY(15);
        
        double X = point.getX();
        
        
        
        
        
        
	}
}




