import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int x = 123;
		double y = 3.12;
		char symbol = '@';
		String name = "Bro"; 
		
		System.out.println("Hello "+name);
		
		String ex ="water";
		String way = "Koold-Aid";
		String temp;
		
		temp = ex;
		ex = way;
		way=temp;
		
		System.out.println("X: "+ex);
		System.out.println("y: "+way);
		System.out.println("-------------------------------");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String nombre = scanner.nextLine();
		
		System.out.println("What is your age?");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("What is your favorite food?");
		String food = scanner.nextLine();
		
		System.out.println("Hello "+nombre);
		System.out.println("You are "+age+" years old");
		System.out.println("You like "+food);
		
		scanner.close();
	}

}
