import javax.swing.*;
public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre:");
		
		String edad = JOptionPane.showInputDialog("Introduce tu edad:");
		
		int edad_usuario = Integer.parseInt(edad);

		System.out.println("Hola "+nombre_usuario+" tienes "+edad_usuario+" años.");
	}

}
