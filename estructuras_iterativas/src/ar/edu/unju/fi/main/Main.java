package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// NOS PIDEN QUE PARA EL ALUMNO SE REGISTRE LAS NOTAS FINALES DE 4 MATERIAS (numMaterias para modificar)
		Alumno alumno = generarAlumno();
		registrarNotas(alumno,2);
		
	}
	
	public static Alumno generarAlumno() {
		Alumno alumno = new Alumno();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el legajo:");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese el apellido:");
		String apellido = scanner.next();
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		//scanner.close();
		return alumno;
	}
	
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		Scanner scanner = new Scanner(System.in);
		while(numMaterias-1 <= 2) {
			// Cargar materia
			System.out.println("Ingrese el código de la materia: ");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia: ");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el código del registro de notas: ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese la nota final: ");
			Float nota = scanner.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			numMaterias++;
		}
		//scanner.close();
	}

}
