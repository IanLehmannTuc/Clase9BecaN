package modelo;

import java.util.ArrayList;
import java.util.Scanner;

public class Inicio {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		ArrayList<Persona> personaList = new ArrayList<>();
		String dia, mes, anio, validar;
		Boolean repetir = false;
		
		while(true) {
			Persona persona = new Persona();
			System.out.println("Ingrese el nombre de la persona: ");
			persona.setNombre(scan.nextLine());
			System.out.println("Ingrese el apellido de la persona: ");
			persona.setApellido(scan.nextLine());
			System.out.println("Ingrese el dia (en numeros: DD) de nacimiento de la persona: ");
			while(true) {
				dia = scan.nextLine();
				if(!dia.matches(".*\\d{2,}.*")) {
					System.out.println("Por favor ingrese solo numeros en el siguiente formato -> DD");
				}
				else if(dia.length()==2) {
					break;
				}
			}
			System.out.println("Ingrese el mes (en numeros: MM) de nacimiento de la persona: ");
			while(true) {
				mes = scan.nextLine();
				if(!mes.matches(".*\\d{2,}.*")) {
					System.out.println("Por favor ingrese solo numeros en el siguiente formato -> MM");
				}
				else if(mes.length()==2) {
					break;
				}
			}
			System.out.println("Ingrese el año (en numeros: AAAA) de nacimiento de la persona: ");
			while(true) {
				anio = scan.nextLine();
				if(!anio.matches(".*\\d{4,}.*")) {
					System.out.println("Por favor ingrese solo numeros en el siguiente formato -> AAAA");
				}
				else if(anio.length()==4) {
					break;
				}
			}
			persona.setFecNac(dia + "/" + mes + "/" + anio);
			personaList.add(persona);
			
			System.out.println("desea agregar otra persona? S/N \n S -> si \n N -> no");
			do {
				if(repetir) {
					System.out.println("Por favor, ingrese S o N");
				}
				validar = scan.nextLine();
				repetir = true;
			}while(!validar.equalsIgnoreCase("S") && !validar.equalsIgnoreCase("N"));
			repetir = false;
			if(validar.equalsIgnoreCase("N")) {
				break;
			}
			
		}
		
		for(Persona persona : personaList) {
			System.out.println(persona.getNombre());
			System.out.println(persona.getApellido());
			System.out.println(persona.getFecNac());
		}

	}

}
