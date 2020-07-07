package retos;

import java.util.Locale;
import java.util.Scanner;

public class Reto572 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in).useLocale(Locale.US);
		int pruebas = s.nextInt();
		boolean nueve = false, cero = false;
		for(int i = 0; i < pruebas; i++){
			for (int j = 0; j < 5; j++){
				Double val = s.nextDouble();
				if(val == 0.0){
					cero = true;
				}
				
				if(val > 8.9){
					nueve = true;
				}
			}
			if(cero==true  && nueve == false){
				System.out.println("SUSPENSO DIRECTO");
			}else{
				System.out.println("MEDIA");
			}
		}
	}
}