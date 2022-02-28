
public class Manipula_Cadenas {

	public static void main(String[] args) {
		String nombre = "Ignacio";
		
		System.out.println("Mi nombre es "+nombre+" y tiene "+nombre.length()+" letras.");
		System.out.println("Comienza con la letra "+nombre.charAt(0));
		
		int ultima_letra = nombre.length();
		System.out.println("La última letra del nombre es "+nombre.charAt(ultima_letra-1));
		
		
	}

}
