package ejm1;
import java.util.Scanner;
public class e1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);//nos sirve para poder ingresarla respuesta//
		System.out.println("Cuestionario de Capitales de paises");
		System.out.println("Cual es la capital de España:");	
		String r1=s.next();// sirve para ingresar la respuesta//
		if (r1.equals("barcelona")) //evalua la respuesta//
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto, la respuesta es barcelona");
		
		System.out.println("Cual es la capital de Honduras:");	
		String r2=s.next();
		if (r2.equals("tegucigalpa"))
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto, la respuesta es tegucigalpa");
		
		System.out.println("Cual es la capital de Colombia:");	
		String r3=s.next();
		if (r3.equals("bogota"))
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto, la respuesta es bogota");
		
		System.out.println("Cual es la capital de Venezuela:");	
		String r4=s.next();
		if (r4.equals("caracas"))
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto, la respuesta es caracas");
		
		System.out.println("Cual es la capital de Serbia:");	
		String r5=s.next();
		if (r5.equals("belgrado"))
			System.out.println("Correcto");
		else
			System.out.println("Incorrecto, la respuesta es belgrado");
		
		int pro1;// sirve para poder evaluar el valor de la respuesta//
		if (r1.equals("barcelona"))
			pro1=20;
			else 
			pro1=0;
		
		int pro2;
		if (r2.equals("tegucigalpa"))
			pro2=20;
			else 
			pro2=0;
		
		int pro3;
		if (r3.equals("bogota"))
			pro3=20;
			else 
			pro3=0;
		
		int pro4;
		if (r4.equals("caracas"))
			pro4=20;
			else 
			pro4=0;
		
		int pro5;
		if (r5.equals("bogota"))
			pro5=20;
			else 
			pro5=0;
		
		// atribucion a https://github.com/JanioQuiroz/Ejercicio4examen1/blob/master/src/ejercicio4enxamen1/Ejercicio4Examen1.java//
		
		System.out.println("Su resultado es:");//permite mostrar el porcentaje de las respuestas//
		System.out.println(pro1+pro2+pro3+pro4+pro5 +("%"));
		
		if ((pro1+pro2+pro3+pro4+pro5) ==80)//evalua si el usuario gano o perdio el juego//
			System.out.println("FELICIDADES! GANO!");
		else if ((pro1+pro2+pro3+pro4+pro5) >=50)
			System.out.println("FELICIDADES! GANO! pero estudie mas ");
		else if ((pro1+pro2+pro3+pro4+pro5)<=50)
			System.out.println("Intentelo de nuevo, estudie ");
		
		
	}

	
}	

	


