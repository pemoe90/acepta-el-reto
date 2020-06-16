package retos;
import java.util.Scanner;

public class Reto482 {
	private static Scanner sc  = new Scanner(System.in);
	private static int negros = 0;
	private static int grises = 0;
	private static String lectura;
	
	public static void main(String[] args) {
		do {
			lectura = sc.nextLine();
			if(!lectura.equals(".")) {
				for(int i = 0; i < lectura.length(); i++) {
					if(lectura.charAt(i) == 'N') {
						negros ++;
					}else if(lectura.charAt(i) == 'G') {
						grises ++;
					}else if(lectura.charAt(i) == '.') {
						break;
					}
				}
				contarCalcetines();
			}
			
		}while(!lectura.equals("."));
	}
	
	public static void contarCalcetines() {
		int nn = negros % 2;
		int ng = grises % 2;
		
		negros = 0;
		grises = 0;
		
		if(nn == 0 && nn == ng) {
			System.out.println("EMPAREJADOS");
		}else if(nn == 0 && ng > 0) {
			System.out.println("GRIS SOLITARIO");
		}else if(nn > 0 && ng == 0) {
			System.out.println("NEGRO SOLITARIO");
		}else {
			System.out.println("PAREJA MIXTA");
		}
	}
}
