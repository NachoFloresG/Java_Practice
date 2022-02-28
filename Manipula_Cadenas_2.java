
public class Manipula_Cadenas_2 {

	public static void main(String[] args) {
		String frase = "Hoy es un estupendo día para aprender a programar Java";
		
		String frase_resumen = frase.substring(29, 54);
		System.out.println(frase_resumen);
		
		String frase_resumen2 = frase.substring(0, 28)+" irnos a la playa.";
		System.out.println(frase_resumen2);
		
		String alumno1, alumno2;
		
		alumno1 = "David";
		alumno2 = "david";
		
		System.out.println(alumno1.equalsIgnoreCase(alumno2));

	}

}
