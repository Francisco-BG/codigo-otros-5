import java.util.Scanner;// Se agregó importación de Scanner

public class Codigo5 {
	public static void main(String[] args) { //se agregó método main
			
	    Scanner s = new Scanner(System.in);//Se agregó el flujo de entrada, System.in 
	    System.out.print("Introduzca un número: "); //se cambió la comilla simple por doble (estaban mezcladas)
	    String ni = s.nextLine();
	    int c = Integer.parseInt(ni); //Se agregó el método parseInt(), para convertir c a entero
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (c > 0) { //se cambió ni por c, para poder hacer la comparación
		  int digito = (int)(c % 10); // se cambió ni por c
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)){
			afo++;
	      }else {
			noAfo++;
		  
		  c /= 10; //se cambió ni por c
	    }

	    if (afo > noAfo) {
	      System.out.println("El " + ni + " es un número afortunado.");//se agregó la t de println() cambio c y ni
	    } else {
	      System.out.println("El " + ni + " no es un número afortunado.");// se intercambió c y ni
	    }
	 // aquí se escogió ni porque tiene el mismo valor inicial que c pero no cambia a lo largo del programa
	    }
	} 
}