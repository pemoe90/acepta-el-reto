package retos;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reto142 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Integer> circulo = new ArrayList<Integer>();
		int jugadores, saltos, eliminar;
		while(true) {
			jugadores = s.nextInt();
			saltos = s.nextInt();
			circulo.clear();
			eliminar = 0;
			if(jugadores == 0 && saltos == 0) {
				break;
			}
			
			for(Integer i = 1; i <= jugadores; i++) {
				circulo.add(i);
			}
			
			while(circulo.size() > 1) {
				eliminar += saltos;
                eliminar %= circulo.size();
				circulo.remove(eliminar);
			}
			
			System.out.println(circulo.get(0));
		}
	}
}
